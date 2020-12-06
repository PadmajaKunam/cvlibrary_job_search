@Sprint1
Feature:Search Functionality
  @US0001
  Scenario Outline: Validating Positive search functionality
    Given user is on Search page
    And user navigate to Search page
    When user enters "<keywords>" and "<location>"and "<distance>"
    And user clicks on  Find Jobs button
    Then user is navigated to search results
    Examples:
    |Keywords       |Location    |distance     |
    |Automation Tester |NN5 5FN      |up to 80miles|
    |Buyer             |Northampton  |up to 30miles|
    |Logistics Manager |Coventry     |up to 50miles|
 @US0002
  Scenario Outline: Validating Negative search functionality
    Given user is on Search page
    And user navigate to Search page
    When user enters negative keys "<keywords1>" and "<location1>"and "<distance1>"
    And user clicks on  Find Jobs button
    Then user is able to see error message
    Examples:
      |Keywords1          |Location1     |distance1     |
      | 1234              |London       |up to 80miles|
      |Buyer             |708708        |up to 30miles|
      |                  |London       |up to 80miles|
      | 1234             |             |up to 80miles|
      |Logistics Manager |Coventry     |up to 0miles |
      |Automation Tester |Northampton    |up to 751miles |
