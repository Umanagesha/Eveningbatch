package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Parallel 
{
	
WebDriver driver;
@parameter({"browser"})

@Test
public void exec1(String browser)
{
		System.setProperty("webdriver.gecko.driver", "/software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "/software/chromedriver.exe");
		if(browser.equals("firefox");
		{
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
}
}
