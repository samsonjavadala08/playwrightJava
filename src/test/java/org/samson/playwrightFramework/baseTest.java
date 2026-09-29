package org.samson.playwrightFramework;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class baseTest {

 @Test 	
 
 public void demoTest() {
	 
	 Playwright playwright =Playwright.create();
	 
	Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	Page page=browser.newPage();
	
	page.navigate("https://www.amazon.in/");
	System.out.println(page.title());
	
	page.getByPlaceholder("").fill("");
	page.getByLabel("");
	
	page.getByRole(null);
	//assertThat(page.getByTestId("status")).hasText("Submitted");
 }  
	
}
