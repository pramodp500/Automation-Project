package VariableTypes;

public class NewLocalVariable {

	public static void main(String[] args)
	{
		NewLocalVariable abc = new NewLocalVariable();
		abc.test1();
		abc.test2();
		NewLocalVariable.test3();
	}
public void test1()
{
	double x = 10.2;
	double y = 5.6;
	double z = x*y;
	System.out.println(z);
	
}
public void test2()
{
	double a = 10.2;
	double b = 5.6;
	double c = a/b;
	System.out.println(c);
	
}
public static void test3()
{
	int a = 100;
	int b = 200;
	int c = a+b ;
	System.out.println(c);
}
}
