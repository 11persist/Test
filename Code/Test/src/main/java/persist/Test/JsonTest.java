package persist.Test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JsonTest {
	
	public static void main(String[] args) {
//		testJson();
//		testMap();
		testBean();
	}

	private static void testBean() {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setName("张大爷");
		stu.setAge(99.1);
		stu.setSchool("老人学院");
		stu.setMajor(new String[]{"太极拳","舞剑"});
		stu.setSkills(new String[]{"太师椅","玩笑"});
		
		JSONObject jsonObject = new JSONObject(stu);
		System.out.println(jsonObject.toString());
	}

	private static void testMap() {
		// TODO Auto-generated method stub
		Map<String,Object> mapJson = new HashMap();
		
		mapJson.put("table", "tableinfo");
		mapJson.put("test",new String[]{"abc","def"});
		mapJson.put("weary", "tired");
		mapJson.put("world", null);
		mapJson.put("hall",18 );
		
		JSONObject json = new JSONObject(mapJson);
		System.out.println(json.toString());
		
	}

	private static void testJson() {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();
		
		Object nullObject = null;
		
		jsonObject.put("name", "测试");
		jsonObject.put("age", 13.5);
		jsonObject.put("info", nullObject);
		jsonObject.put("major", new String[]{"coding","test"});
		jsonObject.put("text", new String[]{"file","txt"});
		
		System.out.println(jsonObject.toString());
	}
	
	
}
