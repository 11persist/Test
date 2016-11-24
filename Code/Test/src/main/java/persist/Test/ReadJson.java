package persist.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class ReadJson {
	public static void main(String[] args) throws IOException {
		readJson();
	}

	private static void readJson() throws IOException {
		// TODO Auto-generated method stub
		File file = new File(ReadJson.class.getResource("/test.json").getFile());
		URL url = ReadJson.class.getResource("/test.json");
		URLConnection uc = url.openConnection();
//		System.out.println(uc.getContentType());
//		System.out.println(uc.getContentEncoding());
		String str = FileUtils.readFileToString(file,"GBK");
		JSONObject json = new JSONObject(str);
		System.out.println(json.toString());
	}
	
	
}
