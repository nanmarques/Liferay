#Author: renan.marquesx@gmail.com
Feature: Liferay Form Submission

  Background: 
    Given I access the form

  Scenario: Successful form submission
    When Form page is displayed
    Then I enter a name on page: "Renan Marques"
    Then I enter a BirthDate on page: "03/03/1992"
    Then I enter an Answer on page: "Because I love to be a part of the software quality assurance process"
    Then Click on Submit Button
    And Information sent page is displayed

  Scenario: Verify if all fields are available, including the “party rock” string
    When Form page is displayed
    Then I check that all fields are available
    Then I check that the string party rock is available
    
  Scenario: Verify that user is not able to submit the form with all fields blank
    When Form page is displayed
    Then I enter a name on page: ""
    Then I enter a BirthDate on page: ""
    Then I enter an Answer on page: ""
    Then Click on Submit Button
    Then I check that an error message is displayed for the name field
    Then I check that an error message is displayed for the birthdate field
    Then I check that an error message is displayed for the answer field
    
  Scenario: Verify that a message is displayed if user tries to submit the form with the Name field empty
    When Form page is displayed
    Then I enter a BirthDate on page: "03/03/1992"
    Then I enter an Answer on page: "Because I love to be a part of the software quality assurance process"
    Then Click on Submit Button
    Then I check that an error message is displayed for the name field

  Scenario: Verify that a message is displayed if user tries to submit the form with the Birth Date field empty
    When Form page is displayed
    Then I enter a name on page: "Renan Marques"
    Then I enter an Answer on page: "Because I love to be a part of the software quality assurance process"
    Then Click on Submit Button
    Then I check that an error message is displayed for the birthdate field
    
  Scenario: Verify that a message is displayed if user tries to submit the form with the Answer field empty
    When Form page is displayed
    Then I enter a name on page: "Renan Marques"
    Then I enter a BirthDate on page: "03/03/1992"
    Then Click on Submit Button
    Then I check that an error message is displayed for the answer field
    
