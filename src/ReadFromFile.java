import java.io.*;

public class ReadFromFile {
	
	String Urls() throws IOException {

		String fileName = "UrlsToShortenList.txt";

		FileReader urlToTest = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(urlToTest);

		String urlLine;
		while((urlLine=bufferedReader.readLine())!=null) {
			System.out.println(urlLine);
			
		}
		bufferedReader.close();
		
		return urlLine;
		
		
	}
	
}
