package com.scholastic.qa.steps;

import java.io.InputStream;

import static com.jayway.restassured.RestAssured.*;

public class CDNDownloadTestRest {
	
	
	public long downloadFile(String url) {
		long startTime = System.nanoTime();
		final InputStream inputStream = get(url).asInputStream();
		long endTime = System.nanoTime();
		
		if (inputStream == null) {
			System.out.println("File failed to download!");
		}
		
		long duration = (endTime - startTime)/1000000;
		return duration;
		
	}
}
