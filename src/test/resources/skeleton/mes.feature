Feature:login
@Message
Scenario Outline: successful login
    Given user is on home page
    When username "<username>" and password is "<password>"
    Then user does "<res>" login
   

Examples:
| username  |password  |res     |
|  mercury  |  mercury | valid   |
|  tutorial | tutorial | valid   |
|  mercury  |name      |invalid  |