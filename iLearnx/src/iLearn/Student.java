package iLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ilearnx.live/ilearnx/?fbclid=IwAR27ol326zotJqil32D-HRZgMXpw1YX8yKe0fK0vz4AHd3rgHQUgsgx-tqg");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//click to the( Sign up | Login ) button 
		driver.findElement(By.xpath("//*[@id=\"rs-header\"]/div[2]/div/div/div/div/div/button")).click();
		Thread.sleep(1000);
		WebElement Student_mail = driver.findElement(By.name("phoneOrEmail"));
		Student_mail.sendKeys("apialam008@gmail.com");
		
		WebElement Student_Pass = driver.findElement(By.name("password"));
		Student_Pass.sendKeys("api008"+Keys.ENTER);
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='../index.php']")).click();
        
        WebElement Search_created_course = driver.findElement(By.id("course-keyword"));
        Search_created_course.sendKeys("Test 8");
        Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/ul/li/a")).click();
	}

}
