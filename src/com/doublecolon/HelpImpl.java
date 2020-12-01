package com.doublecolon;

//MethodReferencing -1.Instance method 2.Static method
// Constructor reference -1.
public class HelpImpl {

	public static void main(String[] args) {

		//Lambda expression
		Help h = () -> System.out.println("Help interface");
		h.display();
		
		//Normal use
		HelpImpl hi = new HelpImpl();
		hi.show();
		
		//Instance method reference
		Help helpImplObj = hi::show;
		helpImplObj.display();
		
		//Static method reference
		Help helpImplStatic = HelpImpl::showStatic;
		helpImplStatic.display();
		
		//Instance method reference with Parameter
		HelpWithParam hwp = hi::showWithParam;
		hwp.display("Rajesh");
	}
	
	public void show() {
		System.out.println("HelpImpl class - show method");
	}
	
	public static void showStatic() {
		System.out.println("HelpImpl class - showStatic method");
	}
	
	public void showWithParam(String s) {
		System.out.println("HelpImpl class - show showWithParam = "+s);
	}

}
