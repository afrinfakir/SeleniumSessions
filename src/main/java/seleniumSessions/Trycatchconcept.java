package seleniumSessions;

public class Trycatchconcept {

	public static void main(String[] args) {


		try {
			System.out.println("hi1");
			//int i= 9/0;
			//System.out.println(i);
			System.exit(1);
		}
		catch(Exception e){
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
			//System.exit(1);
		}
	}

}
