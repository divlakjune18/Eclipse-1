package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNavigation {

	

		public static void clickSiginLink(WebDriver driver) {

			WebElement signIn = driver.findElement(By.xpath("//*[@class='login']"));
			signIn.click();
			System.out.println("Divya Code");
		}

		public static void enterUsername(WebDriver driver) {
			WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
			username.sendKeys("kishorevelraj95@gmail.com");
			System.out.println("Divya Code");
		}

		public static void enterPassword(WebDriver driver) {
			WebElement passwords = driver.findElement(By.xpath("//*[@id='passwd']"));
			passwords.sendKeys("12345");
			System.out.println("Divya Code");
		}

		public static void clickSignInButton(WebDriver driver) {
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
			loginbutton.click();
			System.out.println("Divya Code");
		}
		


	}


