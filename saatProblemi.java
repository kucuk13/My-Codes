package deneme;

public class saatProblemi {
	
	public static void main (String args[]){
		
		// x saniye sonra saat ka� olur
		int s�reSaat = 23; int s�reDakika = 40; int s�reSaniye = 45; int x = 4996;
		
		// saniyeyi saate �evir
		int saniye = x %60;
		x = x/60;
		int dakika = x%60;
		int saat = x/60;
		System.out.println(saat + " " + dakika + " " + saniye);
		
		s�reSaniye += saniye;
		if (s�reSaniye > 60) {
			s�reDakika++;
			s�reSaniye = s�reSaniye % 60;
		}
		
		s�reDakika += dakika;
		if (s�reDakika > 60){
			s�reSaat++;
			s�reDakika = s�reDakika % 60;
		}
		
		s�reSaat += s�reDakika;
		if (s�reSaat > 24) {
			s�reSaat = s�reSaat % 24;
		}

		System.out.println(s�reSaat);
		System.out.println(s�reDakika);
		System.out.println(s�reSaniye);
			
	}

}
