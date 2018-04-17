package src;

/*
 * Author: Xtos
 */
import java.util.List;
import com.rosaloves.bitlyj.ShortenedUrl;
import static com.rosaloves.bitlyj.Bitly.Provider;
import static com.rosaloves.bitlyj.Bitly.as;
import static com.rosaloves.bitlyj.Bitly.shorten;

public class URLShortener {
	private static final String API_USER = "o_1ki0u1sud9"; // constant
	private static final String API_KEY = "R_f4121ab5e7284f9fabfbef18eb7db250"; // constant

	public static void main(String[] args) throws Exception {

		String siteLine = null;

		ReadFromFile r = new ReadFromFile();
		List<String> urls = r.urls();
		Provider bit = as(API_USER, API_KEY);

		for (int i = 0; i < urls.size(); i++) {
			siteLine = urls.get(i);
			ShortenedUrl url = bit.call(shorten(urls.get(i)));
			ValidateResponse v = new ValidateResponse();
			v.validateShortenedUrl(url, siteLine);
		}

	}

}
