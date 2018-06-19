import java.util.ArrayList;
import java.util.HashMap;

public class CountNoOfDuplicatesArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++) {
			al.add(i);
		}
		for (int i = 0; i <= 3; i++) {
			al.add(i);
		}
		for (int i = 0; i <= 8; i++) {
			al.add(i);
		}
		System.out.println(al);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (Integer obj : al) {
			if (hm.containsKey(obj)) {
				hm.put(obj, (hm.get(obj) + 1));
			} else {
				hm.put(obj, 1);
			}
		}
		System.out.println(hm);
	}
}
