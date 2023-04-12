package polymorphism;

public class Samplepoly1 extends Samplepoly
{
	public void shape()
	{
		super.shape();
		System.out.println("its a square");
		
	}

	public static void main(String[] args)
	{
		Samplepoly1 s=new Samplepoly1();
		s.shape();
		

	}

}
