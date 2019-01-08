package com.liferay.automated.utils;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDriver {
	
	private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());
	private static WebDriver mDriver;
	 
	public synchronized static WebDriver getCurrentDriver() {
	    if (mDriver==null) {
	        try {
	        	String path = System.getProperty("user.dir");
	        	System.out.println(path); 
	        	System.setProperty("webdriver.chrome.driver",
                        "/home/nanmarques/eclipse-workspace/LifearyForm_Cucumber_Maven/extras/chromedriver_linux64/chromedriver");        
	        	mDriver = new ChromeDriver(new ChromeOptions());
	                        
	            } finally{
	                Runtime.getRuntime().addShutdownHook(
	                    new Thread(new BrowserCleanup()));
	            }
	    }
	    return mDriver;
	}
	 
	private static class BrowserCleanup implements Runnable {
	    public void run() {
	        LOGGER.info("Closing the browser");
	        close();
	    }
	}
	 
	public static void close() {
	    try {
	        getCurrentDriver().quit();
	        mDriver = null;
	        LOGGER.info("closing the browser");
	    } catch (UnreachableBrowserException e) {
	        LOGGER.info("cannot close browser: unreachable browser");
	    }
	}
	
	public static void loadPage(String url){;
    LOGGER.info("Directing browser to:" + url);
    getCurrentDriver().get(url);
    }

	public static WebElement waitForElement(WebElement elementToWaitFor){
		return waitForElement(elementToWaitFor, null);
	}
	
	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}
	
}
