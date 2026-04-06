package superkeyword;

public class Childclass extends Parentclass{

	
	int a= 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childclass obj = new Childclass();
		obj.test();

	}
	
	public void test()
	{
		System.out.println(a);
		System.out.println(super.a); // printing the variable form the parent class using super keyword
	}

}
