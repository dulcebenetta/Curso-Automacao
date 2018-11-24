#language: pt
#enconding: UTF-8
@ui
Funcionalidade: Trello UI
  @ui
  Esquema do Cenario: Criando, comentando e deletando um card
    Dado que esteja logado no Trello
    E acesse o board
    Quando crio um card com nome "<Card Name>"
    E comento "<Coment>"
    Então o card deve estar na lista
    Quando excluo o card
    Então o card não existe mais

    Exemplos:
      | Card Name | Coment		|
      | Card 01 	| Cometário 01	|
      | Card 02 	| Cometário 02	|