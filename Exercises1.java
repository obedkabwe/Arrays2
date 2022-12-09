import java.util.Scanner;

public class Exercises1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum = 0;
		int [] vect = new int[10];
		
		for (int i = 0; i < vect.length; i++) {
			 vect[i]= sc.nextInt();
			 //System.out.println(vect[i]);
		}
		
		for (int i : vect) {
		 sum = sum + i;
		 System.out.println(sum);
		}
		
		
		
		
		
		
		
		
		

	}

}
