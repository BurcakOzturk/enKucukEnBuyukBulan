import java.util.Scanner;

public class enKucukEnBuyukBulan {

	public static void main(String[] args) {

		int adet,i,sayi,enKucuk=0,enBuyuk=0;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kaç tane sayı gireceksiniz: ");
		adet=input.nextInt();
		
		for (i=1 ; i<=adet ; i++) {
			
			System.out.print(i+". sayıyı giriniz: ");
			sayi=input.nextInt();			
			
			if(sayi<enKucuk) enKucuk=sayi;
			if(sayi>enBuyuk) enBuyuk=sayi;
			
		}
		
		System.out.println("En büyük sayı: "+enBuyuk);
		System.out.println("En küçük sayı: "+enKucuk);
	
	
	}

}