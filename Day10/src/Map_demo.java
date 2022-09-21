import java.util.HashMap;
import java.util.Map;

public class Map_demo {
	public static void main(String[] args) {
		Map<String, Map<String, String>> map=new HashMap<String, Map<String,String>>();
		Map<String, String> map1=new HashMap<String, String>();
		map1.put("svhsv","cdcdsy");
		map1.put("vf","cdcdsy");
		map.put("ALEX",map1);
		map.put("BROD",map1);
		System.out.println(map.entrySet());
	}
}
