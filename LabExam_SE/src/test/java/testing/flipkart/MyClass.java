package testing.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {
		WebDriver driver;
		public void launchBrowser()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swara\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		}
		public void login() {
			driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("Swarali@gmail.com");
			driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("123m");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
			driver.close();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyClass ob=new MyClass();
			ob.launchBrowser();
			ob.login();
			
		}

}
