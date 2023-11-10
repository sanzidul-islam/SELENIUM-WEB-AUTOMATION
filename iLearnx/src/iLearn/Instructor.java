package iLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Instructor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ilearnx.live/ilearnx/?fbclid=IwAR27ol326zotJqil32D-HRZgMXpw1YX8yKe0fK0vz4AHd3rgHQUgsgx-tqg");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//click to the( Sign up | Login ) button 
		driver.findElement(By.xpath("//*[@id=\"rs-header\"]/div[2]/div/div/div/div/div/button")).click();
		Thread.sleep(1000);
		//Then click the Instructor
		driver.findElement(By.xpath("//*[@id=\"model-style\"]/div/div[1]/button[2]")).click();
		Thread.sleep(1000);
		//then login with email and password
		
		WebElement Type_mail = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/form/div[1]/input"));
		Type_mail.sendKeys("apialam008@gmail.com");
		
		WebElement Type_password = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/form/div[2]/input"));
		Type_password.sendKeys("api008"+Keys.ENTER);
		
		//match profile name and id
		WebElement Profile_name = driver.findElement(By.xpath("//*[@id=\"panel51\"]/div/div/div/div[2]/h3"));
		String actualText = Profile_name.getText();
		String expectedTextPart = "API ALAM APU";

		if (actualText.contains(expectedTextPart)) {
		    System.out.println("Text matched! = "+expectedTextPart);
		} else {
		    System.out.println("Text not matched!");
		}
		
		//
		Thread.sleep(2000);
		
		//Go Edit your profile and match instructor id
		driver.findElement(By.xpath("//a[@href='#instructors']")).click();
		
		//matching teacher id
		WebElement lockInputField = driver.findElement(By.name("iid"));

        // Get the value of the lock input field
        String actualValue = lockInputField.getAttribute("value");

        // Expected value to match with the lock input field
        String expectedValue = "I316";

        // Compare the actual and expected values
        if (actualValue.equals(expectedValue)) {
            System.out.println("Instructor ID match = "+expectedValue);
        } else {
            System.out.println("Value did not match.");
        }
        
        // click to add course add new course
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='#review']")).click();
        
        //course title
        Thread.sleep(1000);
        WebElement titel= driver.findElement(By.name("Ctitle"));
        titel.sendKeys("Test 12");
        
        //select course level
        Select Course_Level = new Select(driver.findElement(By.name("level")));
        Course_Level.selectByVisibleText("Advanced");
        
		//select Course Category
        Select Course_Category = new Select(driver.findElement(By.name("ccat")));
        Course_Category.selectByVisibleText("Software Quality Assurance");
        
        //course description
        WebElement course_description = driver.findElement(By.name("Cdescription"));
        course_description.sendKeys("Software quality assurance (SQA) is a means and practice of monitoring all software engineering processes, methods, and work products to ensure compliance against defined standards.");
		
		//set price
        WebElement price = driver.findElement(By.name("price"));
        price.sendKeys("900");
        
        // Find the input element for image upload using one of the available locators
        WebElement imageInput = driver.findElement(By.id("thumbnail")); // Replace "fileInput" with the actual element ID

        // Provide the path to the image file you want to upload
        String imagePath = "C:\\Users\\ASUS\\Downloads\\pic1.jpg"; // Replace with the actual path of your image file

        // Use sendKeys to set the file path in the input element
        imageInput.sendKeys(imagePath);
        
        
        
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        //jse.executeScript("scroll(100, 0)"); // if the element is on top.

        jse.executeScript("window.scrollBy(0,500)","");
        Thread.sleep(2000);
        driver.findElement(By.id("step-button-1")).click();
        
        // if the element is on top.   
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("scroll(100,0)","");
        
        WebElement Lesson_1_title = driver.findElement(By.id("section1_title"));
        Lesson_1_title.sendKeys("Learn about SDLC");
        
        WebElement Lesson_1_Description = driver.findElement(By.id("section1_desc"));
        Lesson_1_Description.sendKeys("The software development lifecycle (SDLC) is the cost-effective and time-efficient process that development teams use to design and build high-quality software. The goal of SDLC is to minimize project risks through forward planning so that software meets customer expectations during production and beyond.");
		
        WebElement VideoInput = driver.findElement(By.id("section1_video")); // Replace "fileInput" with the actual element ID

        // Provide the path to the image file you want to upload
        String VideoPath = "C:\\Users\\ASUS\\Downloads\\v1.mp4"; // Replace with the actual path of your image file

        // Use sendKeys to set the file path in the input element
        VideoInput.sendKeys(VideoPath);
        
		// submit
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"step-2\"]/form/button[3]"));
        submit.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='../index.php']")).click();
       
        // search for created course
        WebElement Search_created_course = driver.findElement(By.id("course-keyword"));
        Search_created_course.sendKeys("Test 12");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/ul/li/a")).click();

		
		

	}

}
