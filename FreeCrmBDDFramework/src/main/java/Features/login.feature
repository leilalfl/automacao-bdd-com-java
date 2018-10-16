Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
#
#Given usuario ja esta na pagina de Login
#When titulo da tela de Login for Free CRM
#Then usuario entra com "naveenk" e "test@123"
#Then usuario clica no botao de login
#Then usuario estara na home page

Scenario Outline: Free CRM Login Test Scenario

Given usuario ja esta na pagina de Login
When titulo da tela de Login for Free CRM
Then usuario entra com "<username>" e "<password>"
Then usuario clica no botao de login
Then usuario estara na home page

Examples:

	|username |password |
	|naveenk  |test@123 |
