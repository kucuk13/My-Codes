package deneme;

public class asalSayi {
	
	public static void main(String args[]){
		
		int asalM� = 14;
				
		for (int i = 2; i < asalM�/2; i++){
			int deneme = asalM� % i;
			if (deneme == 0){
				System.out.print("asal de�ildir");
				return;
			}	
		}
		
		System.out.print("asald�r");
	
	}
	
}