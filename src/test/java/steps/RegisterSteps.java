package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.RegisterPage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;
    @Before("@register")
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://demo.automationtesting.in/Register.html");
    }
    @AfterStep("@register")
    public void print(){
        TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
        byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        InputStream printStream = new ByteArrayInputStream(printBytes);
        Allure.addAttachment("Register",printStream);
    }
    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    @E("preencho o campo nome com o valor {string}")
    public void preenchoOCampoNomeComOValor(String nome) {
        registerPage = new RegisterPage(driver);
        registerPage.preencherNome(nome);
    }

    @E("preencho o campo sobre nome com o valor {string}")
    public void preenchoOCampoSobreNomeComOValor(String sobreNome) {
        registerPage.preecherSobreNome(sobreNome);
    }

    @E("preencho o campo endereço com o valor {string}")
    public void preenchoOCampoEndereçoComOValor(String endereco) {
        registerPage.preencherEndereco(endereco);
    }

    @E("preencho o campo e-mail com o valor {string}")
    public void preenchoOCampoEMailComOValor(String email) {
        registerPage.preencherEmail(email);
    }

    @E("preencho o campo telefone com o valor {string}")
    public void preenchoOCampoTelefoneComOValor(String telefone) {
        registerPage.preencherTelefone(telefone);
    }

    @E("clico no radio bottom Male")
    public void clicoNoRadioBottomMale() {
        registerPage.clicarGender();
    }

    @E("clico no check box o valor Movies")
    public void clicoNoCheckBoxOValorMovies() {
        registerPage.clicarHobbies();
    }

    @E("seleciono no campo skills o valor {string}")
    public void selecionoNoCampoSkillsOValorJava(String skills) {
        registerPage.selecionarSkills(skills);
    }

    @E("seleciono no campo Select Country o valor Japan")
    public void selecionoNoCampoSelectCountryOValorJapan() {
        registerPage.clicarCountry();
    }

    @E("seleciono no campo year o valor {string}")
    public void selecionoNoCampoYearOValor(String ano) {
        registerPage.selecionarAno(ano);
    }

    @E("seleciono no campo month o valor {string}")
    public void selecionoNoCampoMonthOValor(String mes) {
        registerPage.selecionarMes(mes);
    }

    @E("seleciono no campo day o valor {string}")
    public void selecionoNoCampoDaynOValor(String dia) {
        registerPage.selecionarDia(dia);
    }
    @After
    public void fecharBrowser(){
        driver.quit();
    }
}
