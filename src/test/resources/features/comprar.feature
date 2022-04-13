#language: pt

@AllScenarios @Test
Funcionalidade: Efetuar uma compra

  Cenario: Efetuar uma Compra

    Dado que estou logando na aplicacao da amazon
    E clico no faca seu login
    E informo o usuario  "albertofransantos98@gmail.com" e a senha "Da251304"
    Quando apresenta a mensagem ".com.br"
    E clico no link "Eletrônicos"
    E clico em "Acessorios"
    E seleciono item "Fone de Ouvido"
    E adiciono no carrinho
    Então fecho o pedido