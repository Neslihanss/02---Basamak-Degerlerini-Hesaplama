import java.util.Scanner;

public class BasamakSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavye=new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz:");
		int sayi=klavye.nextInt();
		
		
		int binler,yuzler,onlar, birler;
		
		binler=sayi/1000;
		yuzler=sayi/100-10*binler;
		onlar=sayi/10-100*binler-10*yuzler;
		birler=sayi-(binler*1000+yuzler*100+onlar*10);
		
		System.out.println("Sayýnýn Birler Basamaðý : "+birler);
		System.out.println("Sayýnýn Onlar Basamaðý : "+  onlar);
		System.out.println("Sayýnýn Yüzler Basamaðý : "+yuzler);
		System.out.println("Sayýnýn Binler Basamaðý : "+binler);
		
		int toplam=birler+onlar+yuzler+binler;
		System.out.println("Basamak Deðerlerinin Toplamý : "+toplam);
		
		
	}

}
