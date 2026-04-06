package inheritance;

public class SampleChild extends SampleParent{

	public static void main(String[] args) {
		
	SampleChild obj = new SampleChild();
	obj.demo(6);
	obj.demo1();

	}
	
	public void demo1 ()
	{
		System.out.println("Hai");
	}

}
