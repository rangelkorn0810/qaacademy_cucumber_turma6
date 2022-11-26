package register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driverParametro) {
        driver = driverParametro;
    }
    private String firstName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String address = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAddress = "//*[@id=\"eid\"]/input";
    private String phone = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbies = "//input[@value='Movies']";
    private String skillsSelect = "Skills";
    private String selectCountry = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String year = "yearbox";
    private String month = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String day = "daybox";

    public void preencherUrl(String url){
        driver.get(url);
    }

    public void preencherNome(String nome){
        driver.findElement(By.xpath(firstName)).sendKeys("Rangel");
    }
    public void preecherSobreNome(String sobreNome){
        driver.findElement(By.xpath(lastName)).sendKeys(sobreNome);
    }
    public void preencherEndereco(String endereco){
        driver.findElement(By.xpath(address)).sendKeys(endereco);
    }
    public void preencherEmail(String email){
        driver.findElement(By.xpath(emailAddress)).sendKeys(email);
    }
    public void preencherTelefone(String telefone){
        driver.findElement(By.xpath(phone)).sendKeys(telefone);
    }
    public void clicarGender(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        driver.findElement(By.xpath(gender)).click();

    }
    public void clicarHobbies(){
        driver.findElement(By.xpath(hobbies)).click();
    }
    public void selecionarSkills(String skill){
        Select skills = new Select(driver.findElement(By.id(skillsSelect)));
        skills.selectByVisibleText(skill);
    }
    public void clicarCountry(){
        driver.findElement(By.xpath(selectCountry)).click();
    }
    public void selecionarAno(String anos){
        Select ano = new Select(driver.findElement(By.id(year)));
        ano.selectByVisibleText(anos);
    }
    public void selecionarMes(String meses){
        Select mes = new Select(driver.findElement(By.xpath(month)));
        mes.selectByVisibleText(meses);
    }
    public void selecionarDia(String dias){
        Select dia = new Select(driver.findElement(By.id(day)));
        dia.selectByVisibleText(dias);
    }

}
