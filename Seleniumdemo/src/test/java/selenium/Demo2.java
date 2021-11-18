package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	WebDriver driver;

	@Before
	public void steup() {

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\mrbaati\\Desktop\\jjjjj\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(" https://www.sugarcrm.com/uk/ ");
		driver.manage().window().maximize();

	}

	@After
	public void close() {

		driver.quit();

	}

	@Test
	public void runtest() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='btn btn-primary']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Baati");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rafaa");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Baatirafaa9@gmail.com");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='phone_work']")).sendKeys("58123305");
	//	Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Consultant Test Logiciel");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='account_name']")).sendKeys("Neolians");
	//	Thread.sleep(4000);
		Select fruits = new Select(driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select")));
		fruits.selectByVisibleText("51 - 100 employees");
		fruits.selectByIndex(3);
		//Thread.sleep(4000);

		/*
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btn);

		WebElement Element = driver.findElement(By.xpath("//select[@class='element-container form-control mb-2']"));
		Select select = new Select(Element);

		select.selectByValue("level1");
		Thread.sleep(4000);

		WebElement check = driver.findElement(By.id("interest_market_c0"));
		check.click();

		WebElement radio = driver.findElement(By.id("doi0"));
		radio.click();

		WebElement demo = driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", demo);

		WebElement solution = driver.findElement(By.xpath("//*[@id=\"mega-menu-item-20406\"]/a/span[1]/span[1)"));
		Select select1 = new Select(solution);
		solution.click();

		Thread.sleep(4000);
		*/
	}

}
