
final class ImmutableClass{
	final private int id;
	final private String name;
	/*
	private ImmutableClass() { // The blank final field name may not have been initialized
	}
	*/
	public ImmutableClass(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "id-->"+id+" name-->"+name;
	}
}
public class ImmutableClassCreation {

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass(12, "Rajesh");
	
		System.out.println(ic);//id-->12 name-->Rajesh

		System.out.println(ic.getName());//Rajesh
		System.out.println(ic.getId());//12
	}
}
