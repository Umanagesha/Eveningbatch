package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class base_test implements Frameworkconstants 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openAppli()
	{
	
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlywait(10,Timeunit.SECONDS);
		driver.get(baseURL);
	}
	@AfterMethod
	
	public void closeAppln()
	{
		driver.close();
	}

}
