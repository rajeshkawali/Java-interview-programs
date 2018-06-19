import java.util.HashMap;
import java.util.Map;

public class TestMap2 {

	public static void main(String[] args) {
		Map objMap = new HashMap();

		System.out.println("------------------------------------------------------");
		System.out.println("Array Index[0] :"+objMap.get(0));// null
		System.out.println("Array Index[35] :"+objMap.get(35));// null
		System.out.println("------------------------------------------------------\n");
		System.out.println("Before Size of the Map:" + objMap.size());// 0
		
		objMap.put("Name", "Suzuki");
		objMap.put("Power", 220);
		objMap.put("Type", "2-wheeler");
		objMap.put("Price", 85000);
		objMap.put("Name", "Suzuki");
		System.out.println("return value=>"+objMap.put("Name", "Honda"));//return value=>Suzuki
		System.out.println("return value=>"+objMap.get("Name"));//return value=>Honda
		objMap.put("test", null);
		objMap.put(null, null);
		objMap.put(null, "Suzuki");
		objMap.put("ddd", 3.3);
		objMap.put("test3", null);
		System.out.println(objMap);
	}

}
