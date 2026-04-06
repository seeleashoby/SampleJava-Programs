package inheritance;

public class Son extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		s.test();
		s.test1();
		s.test2();

	}
	public void test2() {
		
		System.out.println("I am John");
	}

}
