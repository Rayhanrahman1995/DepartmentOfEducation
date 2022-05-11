

Feature: Early Childhood
Background: user is on the home page

@Smoke
Scenario: Varify Child Care Facility Licencing Information
#Given user is on the home page
When user click on early childhood button
And user click on child care facility button
Then user should able to see "CHILD CARE FACILITY LICENSING INFORMATION"


#Feature: Search field
# Scenario Outline is when we parameterize our test scenario means we used same scenario
# for multiple test data by using Examples keyword.
@ignore
Scenario Outline: Varify Search field
#Given user is on the home page
When user enter <text>
Then user should see the text

Examples: 
|text|
|'help'|
|'Contact'|
|'Location'|

