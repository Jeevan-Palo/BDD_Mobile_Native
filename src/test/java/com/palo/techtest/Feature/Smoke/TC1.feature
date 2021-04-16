@Palo-IT
Feature: TC1

  #--------------------------------  Scenario Flow 1 --------------------------------------------------#
  Background: 
    Given Launching the browser

  @TC1
  Scenario: Enter a text in Native androip app
    When user should able to enter "PALO IT - QA" in search textbox
    And close browser
