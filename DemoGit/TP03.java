import java.util.Scanner;

public class TP03 {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int uangNabung = sc.nextInt();
		int cicilan = sc.nextInt();
		sc.close();
		
		System.out.println(uangNabung * cicilan);
	}
}
