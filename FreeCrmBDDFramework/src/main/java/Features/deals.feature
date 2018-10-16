Feature: Deal data creating

#Scenario: Free CRM Create a new deal scenario
#
#Given usuario ja esta na pagina de Login
#When titulo da tela de Login for Free CRM
#Then usuario entra com username e password
#|naveenk	|test@123	|
#
#Then usuario clica no botao de login
#Then usuario estara na home page
#Then usuario acessa Novo Deal Page
#Then usuario entra deal com os dados
#|test deal 	| 1000 | 50 |10|
#Then fecha o browser

Scenario: Free CRM Criar um novo deal com uma conta suspensa

Given usuario ja esta na pagina de Login
When titulo da tela de Login for Free CRM
Then usuario entra com username e password
|naveenk	|test@123	|
Then usuario clica no botao de login
Then usuario estara na home page
Then usuario acessa Novo Deal Page
Then Visualiza a mensagem
|Your account has been suspended|
Then fecha o browser
