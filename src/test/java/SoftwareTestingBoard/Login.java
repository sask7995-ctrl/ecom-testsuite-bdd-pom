package SoftwareTestingBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("sasikanth");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname"))).sendKeys("budaraju");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_address")))
				.sendKeys("sasikanthtester123@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Sasi@1993");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-confirmation"))).sendKeys("Sasi@1993");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"))).click();
		driver.quit();

	}

}
