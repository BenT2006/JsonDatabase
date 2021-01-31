package Json;
import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JsonEncodeDemo {

	public static void main(String[] args) {
		Test1();

	}


	private static void Test2() {
		JSONObject obj = new JSONObject();

		obj.put("name","foo");
		obj.put("num",new Integer(100));
		obj.put("balance",new Double(1000.21));
		obj.put("is_vip",new Boolean(true));

		StringWriter out = new StringWriter();
		try {
			obj.writeJSONString(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jsonText = out.toString();
		System.out.print(jsonText);
	}
	
	private static void Test1() {
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));

		System.out.print(obj);
	}
}
