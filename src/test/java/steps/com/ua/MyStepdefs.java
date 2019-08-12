package steps.com.ua;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {


        String с;
        String al;
        WebDriver driver = new ChromeDriver();



    @cucumber.api.java.en.Given("^Navigate to http://www\\.sharelane\\.com$")
    public void navigateToHttpWwwSharelaneCom() {
        driver.get ("http://www.sharelane.com/");
        
    }

    @cucumber.api.java.en.When("^You have been navigated to site click Enter$")
    public void youHaveBeenNavigatedToSiteClickEnter() {
        WebElement el_enter = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));

        el_enter.click();
        
    }

    @cucumber.api.java.en.And("^Cick the Sing up$")
    public void cickTheSingUp() {
        WebElement el_singup = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));

        el_singup.click();
    }

    @cucumber.api.java.en.And("^Enter ZIP code$")
    public void enterZIPCode() {

        WebElement el_zip = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        el_zip.sendKeys("99999");
        
    }

    @cucumber.api.java.en.And("^Click continue$")
    public void clickContinue() {

        WebElement el_contin = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        el_contin.click();
        
    }

    @cucumber.api.java.en.Then("^Navigate to registration form, enter Fist name$")
    public void navigateToRegistrationFormEnterFistName() {

        WebElement confirm = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/p/b"));
        Assert.assertEquals("Sign Up", confirm.getText());

        WebElement el_name = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        el_name.sendKeys("TestUser");

        
    }

    @cucumber.api.java.en.And("^Enter email$")
    public void enterEmail() {
        WebElement el_mail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        el_mail.sendKeys("TeUser@gmail.com");
    }

    @cucumber.api.java.en.And("^Enter password$")
    public void enterPassword() {
        WebElement el_pass = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        el_pass.sendKeys("aaaaa");
        
    }

    @cucumber.api.java.en.And("^Confirm password$")
    public void confirmPassword() {
        WebElement el_pass2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        el_pass2.sendKeys("aaaaa");

        
    }

    @cucumber.api.java.en.And("^Click register button$")
    public void clickRegisterButton() {
        WebElement el_pass2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        el_pass2.sendKeys(Keys.ENTER);
    }

    @cucumber.api.java.en.When("^You get message acc is created$")
    public void youGetMessageAccIsCreated() {
        WebElement acc_creat = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Account is created!", acc_creat.getText());
    }

    @cucumber.api.java.en.And("^Copy the email$")
    public void copyTheEmail() {
        WebElement new_email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"));
        с = new_email.getText();





    }

    @cucumber.api.java.en.And("^Copy the password$")
    public void copyThePassword() {
        WebElement new_pass = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]"));
        al = new_pass.getText();

    }

    @cucumber.api.java.en.Then("^Click here$")
    public void clickHere() {
        WebElement click_here = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));

        click_here.click();
    }

    @cucumber.api.java.en.When("^Yo navigate to mail page, enter email to the email field$")
    public void yoNavigateToMailPageEnterEmailToTheEmailField() {

        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input"));
        email.sendKeys(String.valueOf(с));


    }

    @cucumber.api.java.en.And("^Enter password to Password field$")
    public void enterPasswordToPasswordField() {
        WebElement pass = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input"));
        pass.sendKeys(String.valueOf(al));
        
    }

    @cucumber.api.java.en.And("^Click login$")
    public void clickLogin() {

        WebElement login = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input"));
        login.click();
        
    }

    @cucumber.api.java.en.Then("^Login as new user$")
    public void loginAsNewUser() throws Exception {
        Thread.sleep(2000);
        WebElement con_login = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/a"));
        Assert.assertEquals("Logout",con_login.getText());



    }

     @cucumber.api.java.After public void closeBrowser()
    {

        driver.quit();
    }
}
