
Feature: Registration and Login

  Scenario: Registration and Log

    Given Navigate to http://www.sharelane.com

    When You have been navigated to site click Enter

    And Cick the Sing up

    And Enter ZIP code

    And Click continue

    Then Navigate to registration form, enter Fist name

    And Enter email

    And  Enter password

    And Confirm password

    And Click register button

    When You get message acc is created

    And Copy the email

    And Copy the password

    Then Click here

    When Yo navigate to mail page, enter email to the email field

    And Enter password to Password field

    And Click login

    Then Login as new user







