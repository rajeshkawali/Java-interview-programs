package com.programs.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		

		Map<String, String> objMap = new HashMap<String, String>();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Array Index[0] :"+objMap.get(0));//null
		System.out.println("Array Index[35] :"+objMap.get(35));//null
		System.out.println("------------------------------------------------------\n");
		System.out.println("Before Size of the Map:" + objMap.size()); // 0
		
		objMap.put("Name", "Suzuki");
		objMap.put("Power", "220");
		objMap.put(null, null); 
		objMap.put("Type", "2-wheeler");
		objMap.put("Price", "85000");
		objMap.put("Name", "Suzuki");
		objMap.put("test", null);
		objMap.put(null, "Suzuki");
		System.out.println("return value=>"+objMap.put(null, "Suzuki test")); // return value=>Suzuki
		objMap.put("test2", null);
		objMap.put("test3", null);
		objMap.put(null, null); 
		System.out.println("return value=>"+objMap.put(null, null)); // return value=>null
		Collection mapdata = objMap.entrySet();
		Iterator itr = mapdata.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");// null=null Type=2-wheeler test2=null test3=null test=null Price=85000 Power=220 Name=Suzuki
		}
	}
}
