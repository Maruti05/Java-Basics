
public class LoopStatements {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Hi Manju, Good evening");
			if (i == 5) {
				break;
			}
		}
		// int i=1; initialization
		// i<=10 ; condition to exit the loop
		// i++/i--/--i/++i step
		System.err.println("================================WHILE LOOP=========================================");
		int j = 14;
		while (j <= 10) {
			System.out.println("Hi Manju, Good evening");
			j++;
		}

		System.out.println(
				"================================DO WHILE LOOP================================================");

		int k = 12;
		do {
			System.out.println("Hi Manju, Good evening");
			k++;
		} while (k <= 10);

		System.err.println("============================CONTINUE====================================");

		for (int i = 0; i < 10; i++) {
           System.out.println("Hiiii");
           if(i>3)
           {
        	   continue;
           }
           System.err.println("Hello");
           
		}
	}
}
