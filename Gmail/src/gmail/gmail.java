package gmail;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class gmail {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//Initialize chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2095765\\OneDrive - Cognizant\\Desktop\\workspace\\Gmail\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
				//launching Amazon website
				driver.get("https://www.amazon.in/");
	
				
				
				// maximizing window
				driver.manage().window().maximize();
				
				// click on sign in button
				driver.findElement(By.xpath("	//a[ @class='nav-a nav-a-2   nav-progressive-attribute']/span[@class='nav-line-2 ']")).click();
				Thread.sleep(2000);
				
				// entering phone no
				driver.findElement(By.id("ap_email")).sendKeys("8123731618");
				Thread.sleep(2000);
				
				//click on continue
				driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				
				//entering password
				driver.findElement(By.id("ap_password")).sendKeys("adithi98*");
				Thread.sleep(2000);
				
				//click on signin
				driver.findElement(By.id("signInSubmit")).click();
				Thread.sleep(2000);
				
				//search for Samsung Mobile using id locator
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung phone");
				
				Thread.sleep(2000);
			
				
				//click on search using xpath locator
				driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
				Thread.sleep(2000);

				
				//select min and max price  range
				driver.findElement(By.id("low-price")).sendKeys("10000");
				Thread.sleep(2000);
				
				driver.findElement(By.id("high-price")).sendKeys("25000");
				Thread.sleep(2000);
				
				
				  //click on go button
				driver.findElement(By.id("a-autoid-1")).click();
				Thread.sleep(2000);
				
				// search for particular phone using linkText
				driver.findElement(By.linkText("Samsung Galaxy M32 5G (Sky Blue, 6GB RAM, 128GB Storage)")).click();
				Thread.sleep(2000);
				
				driver.close();
				
		    	
	}

}
