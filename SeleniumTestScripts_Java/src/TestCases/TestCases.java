package TestCases;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {
	
	public static void googleSearchUseCase() {
		System.setProperty("webdriver.chrome.driver","/Users/akshay.1/Courses/Selenium/JarsAndDriver/chromedriver"); // To load driver
		WebDriver driver = new ChromeDriver(); // creating driver object
		driver.manage().window().maximize(); // maximises browser's window
		driver.manage().deleteAllCookies(); // not mandatory
		
		// actual tasks starts from here:
		driver.navigate().to("https://www.google.com/");
		String[] sa = {"Novarun Deb"}; // text which we search on google
		CharSequence[] csa;
		csa = (CharSequence[]) Arrays.copyOf(sa, sa.length, CharSequence[].class); // Converted string to char sequence because sendkeys function used later accepts char sequence instead of string object.
		
		// findElement function is used to locate HTML elements. Here, we are exploiting name attribute
		driver.findElement(By.name("q")).sendKeys(csa); // If you inspect you will notice that search box of google have name attribute = "q"
		driver.findElement(By.name("btnK")).submit(); // type of this element is written as "submit" in source code.
		
		driver.close(); //  closes the browser tab
//		driver.quit(); // quits whole browser
		
	}
	
	public static void createAccountYahoo() {
		System.setProperty("webdriver.chrome.driver","/Users/akshay.1/Courses/Selenium/JarsAndDriver/chromedriver"); // To load driver
		WebDriver driver = new ChromeDriver(); // creating driver object
		driver.manage().window().maximize(); // maximises browser's window
		driver.manage().deleteAllCookies(); // not mandatory
		driver.get("https://login.yahoo.com/account/create");	
		
		// We will exploit id attributes of HTML elements
		
		// first name: usernamereg-firstName
		String[] fname = {"Akshay"};
		CharSequence[] fname_csa;
		fname_csa = (CharSequence[]) Arrays.copyOf(fname, fname.length, CharSequence[].class);
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(fname_csa);
		
		// last name: usernamereg-lastName
		String[] lname = {"Rajput"};
		CharSequence[] lname_csa;
		lname_csa = (CharSequence[]) Arrays.copyOf(lname, lname.length, CharSequence[].class);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lname_csa);
		
		// email: userId
		String[] uid = {"akshay_cse2k20"};
		CharSequence[] uid_csa;
		uid_csa = (CharSequence[]) Arrays.copyOf(uid, uid.length, CharSequence[].class);
		driver.findElement(By.id("usernamereg-userId")).sendKeys(uid_csa);
		
		// password: usernamereg-password
		String[] pass = {"pqrst_cse2020"};
		CharSequence[] pass_csa;
		pass_csa = (CharSequence[]) Arrays.copyOf(pass, pass.length, CharSequence[].class);
		driver.findElement(By.id("usernamereg-password")).sendKeys(pass_csa);
		
		// birth year: usernamereg-birthYear
		String[] year = {"2001"};
		CharSequence[] year_csa;
		year_csa = (CharSequence[]) Arrays.copyOf(year, year.length, CharSequence[].class);
		driver.findElement(By.id("usernamereg-birthYear")).sendKeys(year_csa);
		
		// submit: reg-submit-button
		driver.findElement(By.id("reg-submit-button")).submit();
		
		// second page:-
		String[] ph = {"7899346578"};
		CharSequence[] ph_csa;
		ph_csa = (CharSequence[]) Arrays.copyOf(ph, ph.length, CharSequence[].class);
		driver.findElement(By.id("usernamereg-phone")).sendKeys(ph_csa);
		// reg-submit-button
		driver.findElement(By.id("reg-submit-button")).submit();
		
		driver.quit();
	}

	public static void main(String[] args) {
//		googleSearchUseCase();
		createAccountYahoo();
		

	}

}
