import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };
		for (int i = 0; i < strArray.length - 1; i++) {
			//System.out.println("i--"+i);
			for (int j = i + 1; j < strArray.length; j++) {
				//System.out.println("j--"+j);
				if ((strArray[i].equals(strArray[j])) && (i != j)) {
					System.out.println("Duplicate Element is : " + strArray[j]);
				}
			}
		}
		System.out.println("---------------------------");
		
		String[] str2 = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };
		HashSet<String> set = new HashSet<String>();
		for (String arrayElement : str2) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}
}
