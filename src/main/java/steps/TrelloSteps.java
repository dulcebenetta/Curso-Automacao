package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.*;

public class TrelloSteps {
    @Dado("^que esteja logado no Trello$")
    public void queEstejaLogadoNoTrello() {
    }

    @E("^acesse o board$")
    public void acesseOBoard(){
        System.out.println("acesseOBoard");
    }

    @Quando("^crio um card com nome \"([^\"]*)\"$")
    public void crioUmCardComNome(String arg0)  {
        System.out.println("crioUmCardComNome");
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0)   {
        System.out.println("comento");
    }

    @Entao("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() {
        System.out.println("oCardDeveEstarNaLista");
    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        System.out.println("excluoOCard");
        
    }

    @Entao("^o card nao existe mais$")
    public void oCardNaoExisteMais() {
        System.out.println("oCardNaoExisteMais");
    }
}
