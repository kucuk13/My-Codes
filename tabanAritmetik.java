package deneme;

public class tabanAritmetik {
	
	public static void main (String args[]){
		
		//x taban�nda girilen y say�s�n� z taban�ndaki de�erini �evirir
		
		int x = 4, y = 11, z = 2;
		
		// y ka� basamakl�?
		int basamakSayisi = 0;
		for (int a = 1; a < 15; a++){
			int sonuc1 = (int) (y / (Math.pow(10, a)));
			if (sonuc1 == 0){
				basamakSayisi = a;
				break;
			}
		}
		
		int onlukTaban = 0;
		//x taban�ndaki y say�s�n� 10 taban�na �evirme
		for (int i = basamakSayisi - 1; i >= 0; i--){
			int sonuc2 = (int)(+ y / (Math.pow(10,i)));
			int sonuc3 = (int)(sonuc2 * (Math.pow(x, i)));
			y = (int) (y - (sonuc2 * (Math.pow(10, i))));
			onlukTaban += sonuc3;
		}
			
		//10 taban�na �evrilen say�y� z taban�na �evirme
		String sonuc = "";
		int sonuc4 = + onlukTaban;
		for (int d = 0; d < 15; d++){
			sonuc4 = sonuc4/z;
			if (sonuc4 < z){
				sonuc = + sonuc4/z + sonuc4%z + sonuc + onlukTaban%z;
				break;
			}else if (sonuc4 >= z){
				sonuc = + sonuc4%z + sonuc;
			}
		}	
		System.out.println (sonuc);	
		
		//kural, virg�ll�
		
	}
}
