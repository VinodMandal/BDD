Feature: I want to login 


Scenario Outline: Login to dashboard

Given User in login page
When Enter un as "<username>" and pwd as "<password>"
Then login successfull

Examples:

| username | password |
|Admin     |admin123  |






