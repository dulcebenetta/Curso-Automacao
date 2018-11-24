package steps;
import cucumber.api.java.pt.*;
import org.junit.Assert;
import pom.LoginPage;

public class TrelloSteps {
    LoginPage loginPage;

    @Dado("^que esteja logado no Trello$")
    public void queEstejaLogadoNoTrello() throws Throwable {
        loginPage = new LoginPage();
        loginPage.access();
        loginPage.doLogin("dulce.benetta.ext@sascar.com.br", "Amgrl3001t");
        Assert.assertEquals("Página Inicial do Trello", loginPage.checkInitialPage());
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
