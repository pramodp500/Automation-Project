package doconditions;

public class While {

	public static void main(String[] args) {
		int a = 4;
		int x = 1;
		int i = 1;
		while (i<=a)
		{
			x=i*x;
			i++;
		}
System.out.println("the factorial is"  +  x);
	}

}
