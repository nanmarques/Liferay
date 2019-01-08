# Liferay

Automation
Technologies:
The automation activities for the Liferay form project were carried out using the following technologies:
Eclipse IDE: Integrated Development Environment used to develop the automation scripts using the Java language
Selenium: A framework for testing web applications
Cucumber: Cucumber is a software tool used by computer programmers for testing other software. It runs automated acceptance tests written in a behavior-driven development (BDD) style
Maven - Maven is a build automation tool used primarily for Java projects.
2. Structure
The structure of the java project is the following:
/LifearyForm_Cucumber_Maven
	-src/main/java
		Here are the java classes that handle the Browser web driver, navigator factory and navigator, and page objects (view and containers)
		-com.liferay.automated.app
		The class called Navigation conducts the tests and also delegates tasks to page containers. The Navigator Factory handles the creation and access to the Navigator.
		-com.liferay.automated.containers
		-com.liferay.automated.view
		In this implementation, we call some "view" classes from Page Objects and separate the DOM references into "container" classes.
		-com.liferay.automated.utils
		BrowserDriver along with methods to get and close the browser and handle waitFor elements
	/src/test/java
		com.cucumber.test
		Java classes that represent the steps of the cucumber feature file in java methods that call the Navigator ones
	/src/test/resource
	Test cases are placed in resource files that cover one or more test scenarios. Cucumber interprets tests in the specified programming language and uses Selenium to conduct test cases in a browser. Our tests are converted to Java code.
	pom.xm
	All the necessary dependencies are listed here for Maven to handle
