package deneme;

import java.util.Scanner;

public class ikinciDerecedenDenklem {

	public static void main(String[] args) {

		Scanner oku = new Scanner(System.in);
		System.out.println("�kinci dereceden denklemin k�klerini bulan program");
		System.out.print("Denklemin ba� kat say�s�n� giriniz : ");
		int a = oku.nextInt();
		System.out.print("Denklemin x li terimin kat say�s�n� giriniz : ");
		int b = oku.nextInt();
		System.out.print("Denklemin sabit terimini giriniz : ");
		int c = oku.nextInt();

		double delta = +(b * b - 4 * a * c);

		if (delta > 0) {
			System.out.println("�ki reel k�k� var");
			System.out.println("x1 =" + ((-b - Math.sqrt(delta)) / (a * 2)));
			System.out.println("x2 =" + ((-b + Math.sqrt(delta)) / (a * 2)));
		} else if (delta == 0) {
			System.out.println("Tek reel k�k� var");
			System.out.println("x = " + (-b / (a * 2)));
		} else if (delta < 0) {
			System.out.println("Reel k�k� yok");
		}
	}

}
