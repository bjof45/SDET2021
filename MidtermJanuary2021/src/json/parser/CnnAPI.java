package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();

       if(status != 200)
           System.out.println("Something isnt right, the below wont work.....we should change this to a try/catch eventually");

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) con.getContent()));
        JsonObject jsonObject = root.getAsJsonObject();
        JsonArray jsonArray = jsonObject.getAsJsonArray("articles");

    for (int i = 0; i < jsonArray.size()-1; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                String author = " by "+jsonobject.get("author").toString();

                if(author.contains("null"))
                    author = "";

                System.out.println(jsonobject.get("title").toString()+author);

            }catch(Exception ex){

            }
        }
    }
}

