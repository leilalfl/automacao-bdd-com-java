Feature: Free CRM Criar Contatos

#Scenario Outline: Free CRM Criar um novo contato
#
#Given usuario ja esta na pagina de Login
#When titulo da tela de Login for Free CRM
#Then usuario entra com "<username>" e "<password>"
#Then usuario clica no botao de login
#Then usuario estara na home page
#Then user acessa Novo Contato Page
#Then usuario entra com dados do contato "<firstname>" e "<lastname>" e "<position>"
#Then fecha o browser
#
#Examples:
#	|username |password | firstname | lastname | position |
#	|naveenk  |test@123 | Tom       | Peter    | Manager  |

	
Scenario Outline: Free CRM Criar um novo contato com uma conta suspensa

Given usuario ja esta na pagina de Login
When titulo da tela de Login for Free CRM
Then usuario entra com "<username>" e "<password>"
Then usuario clica no botao de login
Then usuario estara na home page
Then user acessa Novo Contato Page
Then Visualiza a mensagem "<mensagem>"

Examples:
	|username |password	| mensagem							|
	|naveenk  |test@123 | Your account has been suspended	|