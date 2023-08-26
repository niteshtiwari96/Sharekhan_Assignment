package StepDefinitions;



import java.awt.Color;
import java.time.Duration;

import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.relevantcodes.extentreports.LogStatus;

import ShareKhanCore.WebConnector;
import ShareKhan_Util.testUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Verify_MainMenuPopup_Test extends WebConnector{
	

	  @Given("^ShareKhan website is open in the browser$")
	    public void sharekhan_website_is_open_in_the_browser() throws Throwable 
	    {
		  try{
		  report.startTest("ShareKhan website is open in the browser");	  
		  Thread.sleep(5000);
		  System.out.println("ShareKhan website is open in the browser");
		  report.log(LogStatus.INFO, "ShareKhan website is open");
		  driver.get(config.getProperty("testsite"));
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40L));
		  report.log(LogStatus.INFO, "Get Title");
		  System.out.println(driver.getTitle());
		  }catch (Throwable t)
			{
			  report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
			  report.log(LogStatus.ERROR, "Sharekhan Functionaltiy error");
				 testUtil.captureScreenshot("Verify_MainMenuPopup_Test");
				 report.attachScreenshot(testUtil.mailscreenshotpath);
				 Assert.assertTrue(false, t.getMessage());
				
			}
			
	    }

	  
	  @Then("^the website is launched successfully$")
	    public void the_website_is_launched_successfully() throws Throwable 
	    {
		  try{
		   Thread.sleep(2000);
		   report.startTest("the website is launched successfully");
		   report.log(LogStatus.INFO, "ShareKhan website is launched successfully");
	       System.out.println("the website is launched successfully");
	       
		  }catch (Throwable t)
			{
			  report.log(LogStatus.FAIL, "Sharekhan website launching Failed");
			  report.log(LogStatus.ERROR, "Sharekhan launching error");
				 testUtil.captureScreenshot("Verify_MainMenuPopup_Test");
				 report.attachScreenshot(testUtil.mailscreenshotpath);
				 Assert.assertTrue(false, t.getMessage());
				
			}
	    }
	    
	    
	 
	    @When("^user clicks on main menu button$")
	    public void user_clicks_on_main_menu_button() throws Throwable 
	    {
	    	
	    	try{
	    	Thread.sleep(5000);
	    	report.startTest("user clicks on main menu button");
	    	System.out.println("user clicks on main menu button");
	    	report.log(LogStatus.INFO, "user clicks on main menu button");
	    	//Login Button
	    	 Thread.sleep(6000);
	    	 WebElement mainMenuButton=driver.findElement(By.xpath(object.getProperty("MainMenuButton")));
	    	 mainMenuButton.click();
	    	 System.out.println(mainMenuButton.getText());
	         }catch (Throwable t)
		     {
	        	 report.log(LogStatus.FAIL, "Main Menu Popup is Failed");
	        	 //report.log(Status.FAIL, MarkupHelper.createLabel(Result.class, Color.red));
				 testUtil.captureScreenshot("Verify_MainMenuPopup_Test");
				 report.attachScreenshot(testUtil.mailscreenshotpath);
				 Assert.assertTrue(false, t.getMessage());
			
		      }
	    	 
	    }
	    

	    @Then("^main menu popup is displayed$")
	    public void main_menu_popup_is_displayed() throws Throwable 
	    {
	    	try{
	      Thread.sleep(5000);
	      report.startTest("main menu popup is displayed");
	      System.out.println("main menu popup is displayed"); 
	    //*[@id="hamburgerMenu"]/li[1]
	      report.log(LogStatus.INFO, "main menu popup is displayed");
	      WebElement mainMenuPopup=driver.findElement(By.xpath(object.getProperty("mainMenuPopup")));
	      System.out.println("Main Menu Popup is Displayed"+mainMenuPopup.isEnabled());
	      String contain=mainMenuPopup.getText();
	    	 System.out.println("main menu popup is"+contain);
	    	}catch (Throwable t)
			{
	    		report.log(LogStatus.FAIL, "main menu popup is displayed is Failed");
				 testUtil.captureScreenshot("Verify_MainMenuPopup_Test");
				 report.attachScreenshot(testUtil.mailscreenshotpath);
				 Assert.assertTrue(false, t.getMessage());
				
			}
	    }
	    
	    
		

}
