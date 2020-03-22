package com.accesshq.opgg.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.accesshq.opgg.pages.ChampionsPage;
import com.accesshq.opgg.pages.HomePage;
import com.accesshq.opgg.uielement.ChampionElement;
import com.accesshq.opgg.uielement.ChampionIndexList;

class ChampionPageListTest extends BaseTest {

	/*
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
	
	String championName = "Garen";
	
	@Test
	void ChampionSearchResultsTest() throws Exception {

		HomePage homePage = new HomePage(driver);
		homePage.clickChampionsPage();
		
		ChampionsPage championsPage = new ChampionsPage(driver);
		championsPage.setChampionSearch(championName);
		
		championsPage.getChampionElements().updateVisibleList();
		ChampionIndexList championIndexList = championsPage.getChampionElements();
		
		assertEquals(championName, championIndexList.getName(championName));

		
		
	
	}

}
