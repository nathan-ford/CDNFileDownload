package com.scholastic.qa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CDNDownloadTestSteps {

	private CDNDownloadTestRest restAssuredTest = new CDNDownloadTestRest();
	private long totalTime;
	
	@Given("^User downloads file from url \"(.*)\"$")
	public void user_downloads_file_from_url(String url) throws Throwable{
		totalTime = restAssuredTest.downloadFile(url);
	}
	
	@Then("^the user should see how long the download took$")
	public void the_user_should_see_how_long_the_download_took() throws Throwable {
		System.out.println("The download took " + totalTime + " milliseconds");
	}
	
	
}
