package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass{

	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		String aTitle="GTPL Bank Manager HomePage";
		Assert.assertEquals(aTitle, driver.getTitle());
	}

}
