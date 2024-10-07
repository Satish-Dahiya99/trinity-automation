Feature: Activate service application

  @Test
  Scenario: Add new crop, Edit and Delete

    Given User logins to the application
    When user clicks on sandy setup
    Then user navigates to activate each service
    And click on carbon manage data
    Then click on Manage data for cropping
    And Select filter with data to add crop
    |filter | data       |
    |farm   | Grapes     |
    |field  | GP1        |
    |year   | 2024       |
    Then click on add crop button
    And add required data for crop
    |field          | data           |
    |Crop type      | Main crop      |
    |Crop name      | Alsike Clover  |
    |Variety        | Aurora         |
    |Tillage method | Min till       |
    |Yield (t/ha)   | 1              |
    |Straw yield    | 0              |
    |Harvest yield  | 1              |
    Then set date to add crop
    | field       | no of prior days |
    |Planting date|3                 |
    |Harvest date |0                 |
    And user "Save" the added data for crop
    Then verify the data "added" message
    And verify tillage type as "Min till" is displayed
    When user clicks on edit button
    And Edit single required data for crop
    |field          | data           |
    |Tillage method | Full           |
    Then user "Save" the added data for crop
    Then verify the data "updated" message
    And verify tillage type as "Full" is displayed
    Then user clicks on delete button
    Then verify the data "deleted" message










