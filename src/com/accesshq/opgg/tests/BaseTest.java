package com.accesshq.opgg.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BaseTest {
	
	protected static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/Hunter/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://oce.op.gg/");
	}
	
	/*
	 * Test 1: HomePage search test
	 * Enter name into search bar
	 * Press search button
	 * Verify that summoner name matches search name
	 * 
	 * Test 2: SummonerPlayedGames test
	 * Verify name of summoner 
	 * Go through previous games in match history
	 * Verify summoners name appears in all games
	 * Click Show more
	 * Verify Summoner name still appears
	 * 
	 * Test 3: Champion Search results test
	 * Click to champions page
	 * Verify that champion appears in list
	 * 
	 * Test 4: Partial Name results test
	 * Enter name/partial name of champion
	 * Verify that champion appears in list
	 * 
	 * Test 5: Incorrect name test
	 * Enter incorrect name
	 * Verify that champion is no longer visible
	 * 
	 */

}
