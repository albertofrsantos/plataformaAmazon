#language: pt

@AllScenarios
Funcionalidade: Acesso ao site da Amazon

  Cenario: Efetuar login no site da Amazon
    Dado que estou logando na aplicacao da amazon
    E clico no faca seu login
    E informo o usuario  "albertofransantos98@gmail.com" e a senha "Da251304"
    Quando apresentar o titulo ".com.br"
    Então apresenta a mensagem "LOGADO COM SUCESSO"

  Cenario: Efetuar login no site da Amazon
    Dado que estou logando na aplicacao da amazon
    E clico no faca seu login
    E informo o usuario  "albertofransantos98@gmail.com" e a senha "Da250987"
    Então apresenta a mensagem acesso "Houve um problema"

