#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Player scoring
  A player starts with zero score.
  Correct answer gets points depending on how difficult the question is.

  @tag1
  Scenario: New player starts playing. Their score should be zero.
    Given I am a new player
    When I start playing
    Then my score is 0

  Scenario Outline: A player answer correctly
    Given I am player
    When I answer a question <number> correctly
    Then my score is <score>

    Examples: 
      | number | score  |
      |      1 |    100 |
      |      5 |    500 |
      |     15 | 100000 |
