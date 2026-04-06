package inheritance;

public class Daughterclass extends Fatherclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Daughterclass D1 = new Daughterclass();
	D1.demo();
	D1.demo2();
	
	//D1.demo1(); function of Sonclass which is not accessed in the Daughterclass that is hierarchical inheritance 
	}
	
	public void demo2()
	{
		System.out.println("I am daughter Siya");
	}

}
