import java.util.Scanner;

public class permen {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan jumplah permen yang dimiliki Dira: ");
		int bulat1 = input.nextInt();
		
		System.out.println("Masukan jumplah teman Dira: ");
		int bulat2 = input.nextInt();
		
		int hasil = bulat1 / bulat2;
		int hasil2 = bulat1 % bulat2;
	
		System.out.println("Hasil Bagi = " + hasil);
		System.out.println("Hasil Sisa Bagi = " + hasil2);
	}
}