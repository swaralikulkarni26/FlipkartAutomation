package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelClass {
	
	WebDriver driver;
	public void launchBrowser()
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swara\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");

	}
	public void searchElem() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstSelClass ob=new FirstSelClass();
		ob.launchBrowser();
		ob.searchElem();
		
	}

}
