import java.util.Scanner;

public class Dira {
	public static void main(String[] args) {
		// deklarasi variabel
		String nama ;
		int usia;
			
		//scanner baru
		Scanner keyboard = new Scanner(System.in);
			
		// Tampilkan output ke user
		System.out.print("Nama: ");
		// menggunakan scanner dan menyiapkan apa yang diketik di variable nama
		nama = keyboard.nextLine();
		// Tampilkan output lagi
		System.out.println("Usia: ");
		usia = keyboard.nextInt();
			
		//Menampilkan apa yang sudah di simpan di variabel
		System.out.println("Hallo, " + nama);
		System.out.println("Ternyata usiamu baru " + usia + "tahun ya!");
	}
}