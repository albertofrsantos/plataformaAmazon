package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ComprasPage;
import runner.RunCucumberTest;

public class CompraSteps extends RunCucumberTest {

    ComprasPage comprasPage = new ComprasPage();


    @Quando("^apresentar o titulo \"([^\"]*)\"$")
    public void apresentarOTitulo(String telaCompra){
        String resultado_Atual = getDriver().findElement(By.linkText(".com.br")).getText();
        Assert.assertEquals(telaCompra,resultado_Atual);
    }

    @Entao("^apresenta a mensagem \"([^\"]*)\"$")
    public void apresentaAMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    @E("^clico no link \"([^\"]*)\"$")
    public void clicoNoLink(String link) {
        comprasPage.clicarLinkCompra(link);
    }


    @E("^clico em \"([^\"]*)\"$")
    public void clicoEmAcessorios(String acessorios)  {
        comprasPage.clicarAcessorios(acessorios);
    }

    @E("^seleciono item \"([^\"]*)\"$")
    public void selecionoItem(String item)  {
        comprasPage.clicarItem(item);
    }

    @E("^adiciono no carrinho$")
    public void adicionoNoCarrinho() {
        comprasPage.clicarAdicionarCarrinho();
    }

    @Entao("^fecho o pedido$")
    public void fechoOPedido() {
        comprasPage.clicarFecharPedido();
    }
}
