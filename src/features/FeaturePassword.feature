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


  Scenario: #0.5. Изменение пароля
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I have entered "pass" as password operand
    And I edit password for "vk.com"
    And I get password for "vk.com"
    Then The result should be "pass"

  Scenario: #0.6. Изменение не существующего пароля
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I have entered "pass" as password operand
    And I edit password for "vk"
    Then The result bool should be "false"


  Scenario: #0.7. Возврат строки. Нет угаданных букв
    Given I Have class password
    When I have entered "vk.com" as servis operand
    And I have entered "password" as password operand
    And I add password
    And I get string
    Then The result should be "********"
