package src;
/*
 * Author: Xtos
 */
import java.util.List;
import com.rosaloves.bitlyj.Bitly.Provider;
import com.rosaloves.bitlyj.ShortenedUrl;
import static com.rosaloves.bitlyj.Bitly.*;


public class URLShortener {

	public static void main(String[] args) throws Exception {

		String siteLine = null;

		List<String> urls = ReadFromFile.urls();
		// BitlyClient client = new BitlyClient("o_1ki0u1sud9",
		// "R_f4121ab5e7284f9fabfbef18eb7db250");
		Provider bit = as("o_1ki0u1sud9", "R_f4121ab5e7284f9fabfbef18eb7db250");

		for (int i = 0; i < urls.size(); i++) {
			siteLine = urls.get(i);
			ShortenedUrl url = bit.call(shorten(urls.get(i)));
			ValidateResponse v = new ValidateResponse();
			v.validateShortenedUrl(url, siteLine);
		}

	}

}
