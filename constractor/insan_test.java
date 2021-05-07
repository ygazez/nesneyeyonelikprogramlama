import java.util.Scanner;

public class insan_test {

	public static void main(String[] args) {
		String ad;
		String soyad;
		int yas;
		int maas;
		
	
		Scanner scan= new Scanner(System.in);
		int i=0;
		while(i<2) {
			
			
			
			if(i==0) {
				System.out.println("bilgileri sirasiyla giriniz=ad,soyad,yas,maas");
				ad=scan.nextLine();
				soyad=scan.nextLine();
				yas=scan.nextInt();
				maas=scan.nextInt();
				insan p1=new insan(ad,soyad,yas,maas);
				
				System.out.println("p1in bilgileri..");
				System.out.println("ad="+p1.getAd());
				System.out.println("soyad="+p1.getSoyad());
				System.out.println("yas="+p1.getYas());
				System.out.println("maas="+p1.getMaas());
				i++;
		}
			else{
				
			
				insan p2=new insan("veli","dsf",13,1000);
				System.out.println("p2in bilgileri..");
				System.out.println("ad="+p2.getAd());
				System.out.println("soyad="+p2.getSoyad());
				System.out.println("yas="+p2.getYas());
				System.out.println("maas="+p2.getMaas());
				i++;
				
		}
			
			
			
		}
	
	}}
