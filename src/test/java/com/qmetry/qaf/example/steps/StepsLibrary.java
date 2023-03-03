package com.qmetry.qaf.example.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsLibrary {
	static WebDriver driver;

	@QAFTestStep(description = "User Launch browser")
	public void user_launch_browser() {
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@QAFTestStep(description = "opens URL {string}")
	public void opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

}
