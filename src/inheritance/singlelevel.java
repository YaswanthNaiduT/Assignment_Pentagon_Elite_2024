package inheritance;

class Father
{
	String name="Mukesh";
	void house()
	{
		System.out.println("Having 3BHK Flat");
	}
}
class Son extends Father
{
	String name="Anant Ambani";
	void car()
	{
		System.out.println("Having car");
		System.out.println("Son name is: "+name);
		System.out.println("Father name is: "+super.name);
		
	}
}

public class singlelevel {

	public static void main(String[] args) {
		Son s= new Son();
		
		s.house();
		s.car();
	}

}
