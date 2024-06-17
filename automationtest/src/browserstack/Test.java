package browserstack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {

public static void main(String[] args) {
// TODO Auto-generated method stub

	case1();
	case2();
	case3();
	case4();
	case5();

}

public static void case1(){
	
	//setting the driver executable
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer User\\eclipse-workspace\\automationtest\\src\\browserstack\\chromedriver.exe");

	//Initiating your chromedriver
	WebDriver driver = new ChromeDriver();

	//Applied wait time
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//maximize window
	driver.manage().window().maximize();

	//open browser with desired URL
	driver.get("https://www.xe.com/currencyconverter/");
	driver.getTitle();

	WebElement inputvalue = driver.findElement(By.id("amount"));
	WebElement convertbutton = driver.findElement(By.xpath("//button[text()='Convert']"));

	inputvalue.sendKeys("100");

	convertbutton.click();

	//closing the browser
	driver.close();
	
}

public static void case2() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer User\\eclipse-workspace\\automationtest\\src\\browserstack\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();


	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.xe.com/currencyconverter/");
	driver.getTitle();

	WebElement inputvalue = driver.findElement(By.id("amount"));

	inputvalue.sendKeys("abcdef");
	inputvalue.clear();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.close();
	
}

public static void case3() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer User\\eclipse-workspace\\automationtest\\src\\browserstack\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.xe.com/currencyconverter/");
	driver.getTitle();

	WebElement inputvalue = driver.findElement(By.id("amount"));
	WebElement convertbutton = driver.findElement(By.xpath("//button[text()='Convert']"));

	inputvalue.sendKeys("100");
	convertbutton.click();

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement trackbutton = driver.findElement(By.xpath("//button[normalize-space()='Track currency']"));
	trackbutton.click();
	
	driver.close();
	
}

public static void case4() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer User\\eclipse-workspace\\automationtest\\src\\browserstack\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.xe.com/currencyconverter/");
	driver.getTitle();

	WebElement inputvalue = driver.findElement(By.id("amount"));
	WebElement convertbutton = driver.findElement(By.xpath("//button[text()='Convert']"));

	inputvalue.sendKeys("100");
	convertbutton.click();

	WebElement quotebutton = driver.findElement(By.cssSelector("a[href='/send-money/']"));
	
	quotebutton.click();
	
	driver.close();
	
}

public static void case5() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer User\\eclipse-workspace\\automationtest\\src\\browserstack\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.xe.com/currencyconverter/");
	driver.getTitle();

	WebElement logintext = driver.findElement(By.linkText("Login to view send rates"));
	logintext.click();
	
	driver.close();
	
}

}
