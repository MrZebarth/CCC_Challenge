package j2021;
import java.util.Scanner;
public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int B = in.nextInt();
		int P = 5*B-400;
		System.out.println(P);
		if (P>100) {
			System.out.println(-1);
		}else if (P<100) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		in.close();
	}

}
