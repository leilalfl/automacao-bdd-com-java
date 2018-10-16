$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Inmetrics/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Criar Contatos",
  "description": "",
  "id": "free-crm-criar-contatos",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario Outline: Free CRM Criar um novo contato"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#Given usuario ja esta na pagina de Login"
    },
    {
      "line": 6,
      "value": "#When titulo da tela de Login for Free CRM"
    },
    {
      "line": 7,
      "value": "#Then usuario entra com \"\u003cusername\u003e\" e \"\u003cpassword\u003e\""
    },
    {
      "line": 8,
      "value": "#Then usuario clica no botao de login"
    },
    {
      "line": 9,
      "value": "#Then usuario estara na home page"
    },
    {
      "line": 10,
      "value": "#Then user acessa Novo Contato Page"
    },
    {
      "line": 11,
      "value": "#Then usuario entra com dados do contato \"\u003cfirstname\u003e\" e \"\u003clastname\u003e\" e \"\u003cposition\u003e\""
    },
    {
      "line": 12,
      "value": "#Then fecha o browser"
    },
    {
      "line": 13,
      "value": "#"
    },
    {
      "line": 14,
      "value": "#Examples:"
    },
    {
      "line": 15,
      "value": "#\t|username |password | firstname | lastname | position |"
    },
    {
      "line": 16,
      "value": "#\t|naveenk  |test@123 | Tom       | Peter    | Manager  |"
    }
  ],
  "line": 19,
  "name": "Free CRM Criar um novo contato com uma conta suspensa",
  "description": "",
  "id": "free-crm-criar-contatos;free-crm-criar-um-novo-contato-com-uma-conta-suspensa",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "usuario ja esta na pagina de Login",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "titulo da tela de Login for Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "usuario entra com \"\u003cusername\u003e\" e \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "usuario clica no botao de login",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "usuario estara na home page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user acessa Novo Contato Page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Visualiza a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "free-crm-criar-contatos;free-crm-criar-um-novo-contato-com-uma-conta-suspensa;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mensagem"
      ],
      "line": 30,
      "id": "free-crm-criar-contatos;free-crm-criar-um-novo-contato-com-uma-conta-suspensa;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Your account has been suspended"
      ],
      "line": 31,
      "id": "free-crm-criar-contatos;free-crm-criar-um-novo-contato-com-uma-conta-suspensa;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Free CRM Criar um novo contato com uma conta suspensa",
  "description": "",
  "id": "free-crm-criar-contatos;free-crm-criar-um-novo-contato-com-uma-conta-suspensa;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "usuario ja esta na pagina de Login",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "titulo da tela de Login for Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "usuario entra com \"naveenk\" e \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "usuario clica no botao de login",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "usuario estara na home page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user acessa Novo Contato Page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Visualiza a mensagem \"Your account has been suspended\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.usuario_ja_esta_na_pagina_de_Login()"
});
formatter.result({
  "duration": 7058364393,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.titulo_da_tela_de_Login_for_Free_CRM()"
});
formatter.result({
  "duration": 18361317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 19
    },
    {
      "val": "test@123",
      "offset": 31
    }
  ],
  "location": "LoginStepDefinition.usuario_entra_com_username_e_senha(String,String)"
});
formatter.result({
  "duration": 239374454,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.usuario_clica_no_botao_de_login()"
});
formatter.result({
  "duration": 3953589819,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.usuario_estara_na_home_page()"
});
formatter.result({
  "duration": 6407549,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_acessa_Novo_Contato_Page()"
});
formatter.result({
  "duration": 1436535167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your account has been suspended",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.visualiza_a_mensagem(String)"
});
formatter.result({
  "duration": 51254177,
  "status": "passed"
});
});