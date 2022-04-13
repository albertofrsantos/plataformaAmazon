package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;

import java.util.concurrent.TimeUnit;

public class LoginPage extends RunCucumberTest {

    public void acessarAplicacao(){
        getDriver(Browser.CHROME);
        getDriver().get("https://www.amazon.com.br/");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clicarButtonFacaSeuLogin(){
        getDriver().findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
    }

    public void digitarUsuario(String usuario){
        getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(usuario);
    }

    public void clicarContinuar(){
        getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    public void digitarSenha(String senha){
        getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(senha);
    }

    public void clicarButtonFazerlogin (){
        getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

    public void senhaInvalida(String senhaInvalida){
        getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
    }

}
