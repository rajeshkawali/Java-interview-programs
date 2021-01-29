package com.programs.slidenerd;

public class PatternNumber {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j >= i) {
					System.out.print(j);
					//System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
/*
System.out.print(j);
1
12
123
1234
12345

------------------------
System.out.print(i);
1
22
333
4444
55555

------------------------
j >= i
System.out.print(j);

12345
2345
345
45
5

------------------------
j >= i
System.out.print(i);

11111
2222
333
44
5

 */