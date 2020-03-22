package com.accesshq.opgg.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accesshq.opgg.pages.HomePage;
import com.accesshq.opgg.pages.SummonerPage;
import com.accesshq.opgg.uielement.GameItem;

class SummonerSearchTest extends BaseTest{
	
	/*
	 * Test 1: HomePage search test
	 * Enter name into search bar
	 * Press search button
	 * Verify that summoner name matches search name
	 */
	
	String summonerName = "John";

	@Test
	void summonerSearchTest() {
		
		HomePage homePage = new HomePage(driver);
		homePage.setSearchbarName(summonerName);
		homePage.clickSearch();
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("GameItemList")));
		
		SummonerPage summonerPage = new SummonerPage(driver);
		assertEquals(summonerName, summonerPage.getProfileName());
		
	}
	
	/*
	 * Test 2: SummonerPlayedGames test
	 * Verify name of summoner 
	 * Go through previous games in match history
	 * Verify summoners name appears in all games
	 * Click Show more
	 * Verify Summoner name still appears in all games
	 */
	
	
	@Test
	void summonerNamePlayedGamesTest()
	{	
		
		HomePage homePage = new HomePage(driver);
		homePage.setSearchbarName(summonerName);
		homePage.clickSearch();
		
		SummonerPage summonerPage = new SummonerPage(driver);
		
		List<GameItem> gameItemElements = summonerPage.getGameItems();
		
		for (GameItem gameItemElement : gameItemElements) {
			assertEquals(summonerName, gameItemElement.getName()); 
		}
		
		summonerPage.clickShowMore();		
		summonerPage.updateGameItems();
		
		for (GameItem gameItemElement : gameItemElements) {
			assertEquals(summonerName, gameItemElement.getName()); 
		}
	}
	

}
