package steps;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou logando na aplicação da amazon$")
    public void queEstouLogandoNaAplicaçãoDaAmazon() {
        loginPage.acessarAplicacao();
    }

    @E("^clico no faça seu login$")
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

    @Então("^apresenta a mensagem acesso \"([^\"]*)\"$")
    public void apresentaAMensagemAcesso(String senhaInvalida) {
        loginPage.senhaInvalida(senhaInvalida);
    }
}
