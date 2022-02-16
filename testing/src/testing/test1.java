package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Eclipse-2020-03\\BroswerDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Eclipse-2020-03\\BroswerDrivers\\geckodriver.exe");
	
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		

	}

}
