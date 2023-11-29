package stepdef1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defA {
	 public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 WebDriver driver;
	 

     @Given("I should be on the login page")
     public void i_should_be_on_the_login_page() throws InterruptedException {
    	 WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.get(url);
         driver.manage().window().maximize();
         Thread.sleep(5000);
    }

     @And("Enter the UserName {string}")
     public void enter_the_user_name(String string) throws InterruptedException{
    	 driver.findElement(By.name("username")).sendKeys(string);
    	 Thread.sleep(5000);
    }

     @And("Enter the Password {string}")
     public void enter_the_password(String string) throws InterruptedException {
    	 driver.findElement(By.name("password")).sendKeys(string);
    	 Thread.sleep(5000);
    }

     @When("Click on Login button")
     public void click_on_login_button() throws InterruptedException {
    	 driver.findElement(By.xpath("//*[@type='submit']")).click();
    	 Thread.sleep(5000);
   }

     @Then("I should see the title as {string}")
     public void i_should_see_the_title_as(String etitle) throws InterruptedException {
         String atitle = driver.getTitle();
         Assert.assertEquals(etitle, atitle);
         Thread.sleep(5000);
         driver.close();
    }

	  

}
