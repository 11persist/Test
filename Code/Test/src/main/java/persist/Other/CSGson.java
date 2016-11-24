package persist.Other;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.apache.commons.io.FileUtils;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import persist.Test.Student;

public class CSGson {
	
	public static void main(String[] args) throws IOException {
		testGson();
		testOGson();
	}

	private static void testOGson() {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setName("张大爷");
		stu.setAge(99.1);
		stu.setSchool("老人学院");
		stu.setMajor(new String[]{"太极拳","舞剑"});
		stu.setSkills(new String[]{"太师椅","玩笑"});
		
		Gson gson = new Gson();
		String json = gson.toJson(stu);
		System.out.println(json);
	}

	private static void testGson() throws IOException {
		// TODO Auto-generated method stub
//		Gson gson = new Gson();
//		Double d = gson.fromJson("\"555.5\"", Double.class);
//		System.out.println(d);
		
		File file = new File(CSGson.class.getResource("/test.json").getFile());
		String str = FileUtils.readFileToString(file, "GBK");
		Gson gson = new Gson();
		Student stu = gson.fromJson(str, Student.class);
		System.out.println(stu.getName());
		
		GsonBuilder gb = new GsonBuilder();
		gb.setFieldNamingStrategy(new FieldNamingStrategy() {
			
			@Override
			public String translateName(Field f) {
				// TODO Auto-generated method stub
				return f.getName();
			}
		});
	}
}
