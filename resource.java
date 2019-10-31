package apiAutomation;

public class resource {
     
	public static String getPostTweetBaseURI() {
		String res="https://api.twitter.com/1.1/statuses/";
		return res;
	}
	public static String getPostTweetResource() {
			String res="/update.json";
			return res;
		}
	
	
	public static String getHashBaseURI() {
		String res="https://api.twitter.com/1.1/trends/";
		return res;
	}
	public static String getHashResource() {
			String res="/place.json";
			return res;
		}
	
	
	public static String getSearchTweetBaseURI() {
		String res="https://api.twitter.com/1.1/search/";
		return res;
	}
	public static String getSearchTweetResource() {
			String res="/tweets.json";
			return res;
		}
	
	
	public static String getTweetBaseURI() {
		String res="https://api.twitter.com/1.1/statuses/";
		return res;
	}
	public static String getTweetResource() {
			String res="/home_timeline.json";
			return res;
		}
	
	
	public static String getUserNameBaseURI() {
		String res="https://api.twitter.com/1.1/search/";
		return res;
	}
	public static String getUserNameResource() {
			String res="/tweets.json";
			return res;
		}
	
	
	public static String getWeatherUpdateBaseURI() {
		String res="https://api.twitter.com/1.1/search/";
		return res;
	}
	public static String getWeatherUpdateResource() {
			String res="/tweets.json";
			return res;
		}

}
