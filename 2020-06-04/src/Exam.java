import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		System.out.print("아동 수:");
		int a = A.nextInt();
		
		System.out.print("성인 수:");
		int b = A.nextInt();
	
		int hap = a+b;
		System.out.println("총수량:"+hap);
		
		int total;
		total = a*6000+b*8000;
		System.out.println("금액:"+total);
	
		int d = A.nextInt();
		
		
		
		
		

	}

}
