import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vmsAdminTesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\work Space\\Selenium Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// opening the URL bar and type the text
		driver.navigate().to("http:\\3.17.72.4");  
        
		//  SUPER ADMIN LOGIN   
	    driver.findElement(By.id("inputName")).sendKeys("admin@vms.com");        
	    Thread.sleep(10);
	    
	    driver.findElement(By.id("inputPassword")).sendKeys("passpass");        
	    Thread.sleep(10);
	    // click Login button
	    driver.findElement(By.xpath("//*[@id=\"externalDiv\"]/div/div[2]/div[5]/button")).click();  
	   Thread.sleep(15000);  
	 /* 
	   // Hover the VMS Admin
	   driver.findElement(By.xpath("//*[@id=\"userName\"]")).click();
	  // Thread.sleep(2000);
		
	  // click on profile
	   driver.findElement(By.xpath("//*[@id=\"topbar\"]/div[2]/ul[1]/li/ul/li[2]/a")).click();
	   Thread.sleep(4000);
	   
	  // click on the Phone number input field
	   driver.findElement(By.id("personalPhone")).click();
	   Thread.sleep(500);
	   driver.findElement(By.id("personalPhone")).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("personalPhone")).sendKeys("2568");
	   Thread.sleep(1000);

	   // Profile Update btn
	   driver.findElement(By.id("updatebtn")).click();
	   Thread.sleep(1500);
	   
	   //click on the dashboard
	   driver.findElement(By.xpath("//*[@id=\"vmsAdminDashboardTab\"]/a")).click();
	   Thread.sleep(1500);
	   
	   driver.findElement(By.id("resetCompany")).click();
	   Thread.sleep(1500);
	   
	   driver.findElement(By.id("companyName")).sendKeys("Agilance");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("subscriptionList")).click();
	   Thread.sleep(100);
	   driver.findElement(By.xpath("//*[@id=\"subscriptionList\"]/option[2]")).click();
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("subStartDate")).sendKeys("06-07-19");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("subEndDate")).sendKeys("08-07-19");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("inputEmail")).sendKeys("companyhead123@gmail.com");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("inputPhone")).sendKeys("9789289878");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("billingContactName")).sendKeys("malik");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("technicalContactName")).sendKeys("syam");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("businessContactName")).sendKeys("sharief");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("billingContactEmail")).sendKeys("syam@gmail.com");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("technicalContactEmail")).sendKeys("syam@gmail.com");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("businessContactEmail")).sendKeys("syam@gmail.com");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("billingContactPhone")).sendKeys("9789289878");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("technicalContactPhone")).sendKeys("9789289878");
	   Thread.sleep(500);
	   
	   driver.findElement(By.id("businessContactPhone")).sendKeys("9789289878");
	   Thread.sleep(500);
	   //  Submit button
	   driver.findElement(By.xpath("//*[@id=\"createCompanyModal\"]/div/div/div/div/div[2]/div[2]/button[2]")).click();
	   Thread.sleep(5000);
	   //click on edit button
	   driver.findElement(By.xpath("//*[@id=\"companyDataTable\"]/tbody/tr[4]/td[6]/button")).click();
	   Thread.sleep(4000);  
	   //
	   driver.findElement(By.id("editableCompanyName")).sendKeys(Keys.SPACE, "digitals");
	   Thread.sleep(1500); 
	   //
	   driver.findElement(By.id("editableBilEmail")).sendKeys(Keys.SPACE, "salim");
	   Thread.sleep(1500);   
	   // Update
	   driver.findElement(By.xpath("//*[@id=\"tab-general\"]/div/div[2]/div[2]/button")).click();
	   Thread.sleep(500);
	   
	   */
	   
	// open gmail
			driver.get("http:\\gmail.com");
			Thread.sleep(3000);
			// mail inputs
			driver.findElement(By.className("zHQkBf")).sendKeys("companyhead123@gmail.com");
			Thread.sleep(1000);   
			
			driver.findElement(By.className("CwaK9")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("whsOnd")).sendKeys("agilance");
			Thread.sleep(1000);
			
			driver.findElement(By.className("CwaK9")).click();
			Thread.sleep(10000);
			// click on mail
			driver.findElement(By.id(":2u")).click();
			Thread.sleep(6000); 
			
			driver.findElement(By.xpath("//*[@id=\":5t\"]/div/div[1]/div[1]/div[1]/p/a")).click();
			Thread.sleep(3000);
			
	   //
	   // hover to the admin name
	   // driver.findElement(By.xpath("//*[@id=\"userName\"]")).click();
	   
	   // click on the logout button
	   //  driver.findElement(By.xpath("//*[@id=\"topbar\"]/div[2]/ul[1]/li/ul/li[4]/a")).click();
	   
	   // Super Admin Testing is over 
	   
		}
}

