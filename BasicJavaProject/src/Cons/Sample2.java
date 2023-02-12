package Cons;

public class Sample2 {
	
	
	public Sample2 ()
	{
		System.out.println("Zero Arg cons");
	}
	public void Sample2 (int  x,int y)
	{
		System.out.println(x+y);
	}
	public Sample2 (String a, int b)
	{
		System.out.println("INT and String Arg cons");
	}
	public static void main(String[] args) {
	Sample2 n = new Sample2();
	Sample2 r = new Sample2();
	r.Sample2(100,80);
	r.Sample2(149,88);
	Sample2 c = new Sample2("addd",10);
	

	}

}
