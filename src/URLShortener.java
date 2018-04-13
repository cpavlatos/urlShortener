package src;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.rosaloves.bitlyj.Url;
import static com.rosaloves.bitlyj.Bitly.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.util.Objects;

public class URLShortener {

	public static void main(String[] args) throws Exception {

		String siteLine = null;
		List<String> urls= ReadFromFile.urls();
		for (int i = 0; i < urls.size(); i++) {
			siteLine = urls.get(i);
			Url url = as("o_1ki0u1sud9", "R_f4121ab5e7284f9fabfbef18eb7db250").call(shorten(urls.get(i)));
			String getShortUrl = url.getShortUrl();
			String getLongUrl = url.getLongUrl();
			URL urlValidate = new URL(url.getShortUrl());
			
			HttpURLConnection urlConnection = (HttpURLConnection) urlValidate.openConnection();

			urlConnection.setRequestMethod("GET");
			urlConnection.setInstanceFollowRedirects(false);
			HttpURLConnection.setFollowRedirects(false);

			//String uriInString = getShortUrl.toString();

			String newUrl = urlConnection.getHeaderField("Location");
			System.out.println("Location : " + newUrl);

			boolean testResult = passOrFail(newUrl, siteLine);
			System.out.println(testResult);
			urlConnection.disconnect();
			System.out.println("short url: " + getShortUrl);
			System.out.println("Long url: " + getLongUrl + "\n");
			
		}	
	}
	
	public static boolean passOrFail(String newUrl, String siteLine) {
		return (Objects.equals(siteLine, newUrl));
		}
	
}

