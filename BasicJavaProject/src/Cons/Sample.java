package Cons;

public class Sample {
	
	
	public Sample ()
	{
		System.out.println("Zero Arg cons");
	}
	public Sample (int  a)
	{
		System.out.println("int Arg cons");
	}
	public Sample (String a, int b)
	{
		System.out.println("INT and String Arg cons");
	}
	public static void main(String[] args) {
	Sample n = new Sample();
	Sample r = new Sample(10);
	Sample c = new Sample("addd",10);
	

	}

}
