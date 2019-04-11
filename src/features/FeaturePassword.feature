Feature: Password
  Scenario:
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    Then The result should be "password"