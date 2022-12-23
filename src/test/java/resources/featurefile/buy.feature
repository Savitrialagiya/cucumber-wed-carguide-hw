Feature: Search functionality

#  @regression
#  Scenario Outline: Search the buy car with model
#    Given I am on homepage
#    When  I mouse hover on buy+sell tab
#    And   I click Search Cars link
#    Then  I navigate to new and used car search page
#    And   I select make "<make>"
#    And   I select model "<model>"
#    And   I select location "<location>"
#    And   I select price "<price>"
#    And   I click on Find My Next Car tab
#    Then  I should see the make in results
#    Examples:
#      | make          | model         | location      | price |
#      | Land Rover    | Freelander    | Any Location  | 70000 |
#      | MG            | GS            | Any Location  | 60000 |
#      | Audi          | A3            | Any Location  | 50000 |
#      | Honda         | Civic         | Any Location  | 40000 |
#      | Nissan        | Murano        | Any Location  | 30000 |
#      | Volvo         | S80           | Any Location  | 35000 |
#
#      | make   | model    | location   | price |
#      | Kia    | Niro     | QLD - All  | 90000 |
##      | BMW    | 2 Series | NSW - All  | 60000 |
#      | Audi   | A3       | NSW - All  | 50000 |
#      | Honda  | Civic    | NT - North | 35000 |
#      | Nissan | Murano   | NSW - All  | 45000 |
#      | Audi   | A1       | ACT - All  | 50000 |
#
#  @regression
#  Scenario Outline: Search the used car with model
#    Given I am on homepage
#    When  I mouse hover on buy+sell tab
#    And   I click Used link
#    Then  I navigate to Used Cars For Sale page
#    And   I select make "<make>"
#    And   I select model "<model>"
#    And   I select location "<location>"
#    And   I select price "<price>"
#    And   I click on Find My Next Car tab
#    Then  I should see the make in results
#    Examples:
#      | make       | model   | location     | price |
#      | Mitsubishi | Lancer  | Any Location | 30000 |
#      | Kia        | Niro    | Any Location | 40000 |
#      | Honda      | Civic   | Any Location | 50000 |
#      | Jeep       | Compass | Any Location | 60000 |
#      | Tesla      | Model 3 | Any Location | 70000 |
#      | Ford       | Focus   | Any Location | 25000 |
#
#
