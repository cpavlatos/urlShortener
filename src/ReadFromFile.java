package src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

	List<String> urls() throws Exception {

		List<String> urlArray = new ArrayList<String>();

		Scanner urls = new Scanner(new File("UrlsToShortenList.txt"));
		while (urls.hasNextLine()) {
			urlArray.add(urls.nextLine());

		}
		urls.close();

		return urlArray;

	}

}
