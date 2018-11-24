#language: pt
#enconding: UTF-8
@ui
Funcionalidade: Trello UI
  @ui
  Esquema do Cenario: Criando, comentando e deletando um card
    Dado que esteja logado no Trello
    E acesse o board
    Quando crio um card com nome "<Card Name>"
    E comento "<Comment>"
    Entao o card deve estar na lista
    Quando excluo o card
    Entao o card nao existe mais

    Exemplos:
      | Card Name   | Comment	   	|
      | Card 01 	| Comentario 01	|
      | Card 02 	| Comentario 02	|