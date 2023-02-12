package conditions;

public class Ifelse {

	public static void main(String[] args) {
		int marks = 68;
		
		if (marks>= 75)
		{
			System.out.println("distinction" + marks);
		}
		else if ((marks>= 65) && (marks<75))
		{
			System.out.println("First" + marks);
		}
		else if ((marks>= 55) && (marks<65))
		{
			System.out.println("Second" + marks);
		}
		else if ((marks>= 35) && (marks<55))
		{
			System.out.println("pass" + marks);
		}
		else 
		{
			System.out.println("Failed");
		}
	}

}
