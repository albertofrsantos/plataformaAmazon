package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;

public class ComprasPage extends RunCucumberTest {

    public void clicarLinkCompra(String link){
        getDriver().findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
    }

    public void clicarAcessorios(String acessorios){
        getDriver().findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[2]/span/a/span")).click();
    }

    public void clicarItem(String item){
        getDriver().findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[4]/div/div[2]/div[2]/ul/li[2]/span/div/a/div[1]/div")).click();
    }

    public void clicarAdicionarCarrinho(){
        getDriver().findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    }

    public void clicarFecharPedido(){
        getDriver().findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
    }

}
