package src;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

import com.rosaloves.bitlyj.ShortenedUrl;

public class ValidateResponse {
	public void validateShortenedUrl(ShortenedUrl url, String siteLine ) throws Exception{

		String getShortUrl = url.getShortUrl();
		String getLongUrl = url.getLongUrl();
		HttpURLConnection urlConnection = (HttpURLConnection) new URL(getShortUrl).openConnection();
		urlConnection.setRequestMethod("GET");
		urlConnection.setInstanceFollowRedirects(false);
		HttpURLConnection.setFollowRedirects(false);

		String newUrl = urlConnection.getHeaderField("Location");
		System.out.println("Location : " + newUrl);

		boolean testResult = ValidateResponse.passOrFail(newUrl, siteLine);
		System.out.println(testResult);
		urlConnection.disconnect();
		
		System.out.println("short url: " + getShortUrl+"\nLong url: " + getLongUrl + "\n");
	}
	public static boolean passOrFail(String newUrl, String siteLine) {
		return (Objects.equals(siteLine, newUrl));
	}

}
