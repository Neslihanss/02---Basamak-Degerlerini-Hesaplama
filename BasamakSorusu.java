import java.util.Scanner;

public class BasamakSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavye=new Scanner(System.in);
		System.out.println("Bir Say� Giriniz:");
		int sayi=klavye.nextInt();
		
		
		int binler,yuzler,onlar, birler;
		
		binler=sayi/1000;
		yuzler=sayi/100-10*binler;
		onlar=sayi/10-100*binler-10*yuzler;
		birler=sayi-(binler*1000+yuzler*100+onlar*10);
		
		System.out.println("Say�n�n Birler Basama�� : "+birler);
		System.out.println("Say�n�n Onlar Basama�� : "+  onlar);
		System.out.println("Say�n�n Y�zler Basama�� : "+yuzler);
		System.out.println("Say�n�n Binler Basama�� : "+binler);
		
		int toplam=birler+onlar+yuzler+binler;
		System.out.println("Basamak De�erlerinin Toplam� : "+toplam);
		
		
	}

}
