package deneme;

import java.util.Random;
import java.util.Scanner;

public class say�TahminOyunu {
	
	public static void main (String[]args){
				
		Random r = new Random();
		int cevap = (r.nextInt(99)+1);
		
		Scanner oku = new Scanner(System.in);
		
		int odul = 0;
		for (int i = 0; i < 5;i++){
			System.out.print(+ i + 1 + ". Tahminin : ");
			int tahmin = oku.nextInt();
			if (tahmin == cevap){
				System.out.println(+ i + 1 + ". ad�mda bildin. Tebrikler!");
				odul = i + 1;
				break;
			} else if (tahmin < cevap & i < 4){
				System.out.println("Say�y� b�y�lt.");
			} else if (tahmin > cevap & i < 4){
				System.out.println("Say�y� k���lt.");
			}
		}
		
		switch(odul){
		case 0: System.out.println("Kaybettin. Cevap : " + cevap); break;
		case 1: System.out.println("Bilgisayar kazand�n."); break;
		case 2: System.out.println("iPad kazand�n."); break;
		case 3: System.out.println("Cep telefonu kazand�n."); break;
		case 4: System.out.println("X-BOX One kazand�n."); break;
		case 5: System.out.println("Bisiklet kazand�n."); break;
		}
		
	}

}
