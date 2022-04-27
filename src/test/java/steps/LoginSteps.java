package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou logando na aplicacao da amazon$")
    public void queEstouLogandoNaAplicacaoDaAmazon() {
        loginPage.acessarAplicacao();
    }

    @E("^clico no faca seu login$")
    public void clicoNoFacaSeuLogin() {
        loginPage.clicarButtonFacaSeuLogin();
    }

    @E("^informo o usuario  \"([^\"]*)\" e a senha \"([^\"]*)\"$")
    public void informoOUsuarioEASenha(String usuario, String senha) throws Throwable {
        loginPage.digitarUsuario(usuario);
        loginPage.clicarContinuar();
        loginPage.digitarSenha(senha);
        loginPage.clicarButtonFazerlogin();
    }

    @Entao("^apresenta a mensagem acesso \"([^\"]*)\"$")
    public void apresentaAMensagemAcesso(String senhaInvalida) {
        loginPage.senhaInvalida(senhaInvalida);
    }
}
