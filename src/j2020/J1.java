package j2020;
import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int S = in.nextInt();
		int M = in.nextInt();
		int L = in.nextInt();
		int score = S+2*M+3*L;
		
		if (score>=10) {
			System.out.println("happy");
		}else {
			System.out.println("sad");
		}
	}

}
