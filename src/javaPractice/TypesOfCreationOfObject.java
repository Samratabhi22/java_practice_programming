package javaPractice;

public class TypesOfCreationOfObject {
	String s = "Vinay";
	public static void main(String[] args) throws Throwable {
		TypesOfCreationOfObject obj1 = new TypesOfCreationOfObject();
		System.out.println(obj1.s);
		
		TypesOfCreationOfObject obj2 = TypesOfCreationOfObject.class.getDeclaredConstructor().newInstance(null);
		System.out.println(obj2.s);
		
		TypesOfCreationOfObject obj3 = TypesOfCreationOfObject.class.getConstructor(null).newInstance(null);
		System.out.println(obj3.s);
		
		obj1.s="vinni";
		System.out.println(obj2.s);
		System.out.println(obj1.s);
				 
	}

}
