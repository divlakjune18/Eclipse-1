package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPageNavigation;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Niranjan workspace\\PageFactory\\browser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		LoginPageNavigation LoginNavi =new LoginPageNavigation();
		
		/*LoginNavi.clickSiginLink(driver);
		LoginNavi.enterUsername(driver);
		LoginNavi.enterPassword(driver);
		LoginNavi.clickSignInButton(driver);*/
		
		LoginPageNavigation.clickSiginLink(driver);
		LoginPageNavigation.enterUsername(driver);
		LoginPageNavigation.enterPassword(driver);
		LoginPageNavigation.clickSignInButton(driver);
		
	}

}
