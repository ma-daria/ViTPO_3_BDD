Feature: Password
  Scenario: #0.1. Добавление 1го пароля
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I get password for "vk.com"
    Then The result should be "password"

  Scenario: #0.2. Добавление 2х паролей
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I have entered "git.com" as servis operand
    And I have entered "pasGit" as password operand
    And I add password
    And I get password for "vk.com"
    Then The result should be "password"

  Scenario: #0.3. Добавление 2х паролей, одинакового сервиса
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I have entered "vk.com" as servis operand
    And I have entered "pasGit" as password operand
    And I add password
    And I get password for "vk.com"
    Then The result should be "password"


  Scenario: #0.4. Получение пароля не сущ сервиса
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I get password for "vk"
    Then The result should be "null"