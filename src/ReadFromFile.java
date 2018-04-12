package src;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
	
	static List<String> urls() throws Exception {
		
		List<String> urlArray = new ArrayList<String>();
		
		Scanner urls = new Scanner(new File("UrlsToShortenList.txt"));
		while(urls.hasNextLine()) {
		    urlArray.add(urls.nextLine());
		}
		return urlArray;
		
		
		
		
		
		
		
		
		

//		String fileName = "UrlsToShortenList.txt";
//		String urlLine;
//		StringBuilder stringBuild = new StringBuilder();
//		List<String> urlArray = new ArrayList<String>();
//
//		FileReader urlToTest = new FileReader(fileName);
//		BufferedReader bufferedReader = new BufferedReader(urlToTest);
//		
//		
//		
//		while((urlLine=bufferedReader.readLine())!=null) {
//			
//			stringBuild.append(urlLine);
//			//urlArray.add(urlLine);
//			
//			System.out.println(urlArray{});
//		}
//		bufferedReader.close();
//		
//		return urlLine;
		
		
	}
	
}
