import java.util.Scanner;

public class aktör {
	private String ad;
	private String soyad;
	private int maas;
	private int film_sayisi;
	
	public aktör(String ad,String soyad,int maas,int film_sayisi) {
		this.ad=ad;
		this.soyad=soyad;
		this.maas=maas;
		this.film_sayisi=film_sayisi;
	}
	public aktör() {}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public int getFilm_sayisi() {
		return film_sayisi;
	}
	public void setFilm_sayisi(int film_sayisi) {
		this.film_sayisi = film_sayisi;
	}
	public static void bilgi_gir() {
		Scanner scan =new Scanner(System.in);
		String a;
		String b;
		int c;
		int d;
		System.out.println("ad,soyad,maas film sayisi sirasiyla giriniz:\n");
		a=scan.nextLine();
		b=scan.nextLine();
		c=scan.nextInt();
		d=scan.nextInt();
		aktör a2=new aktör(a,b,c,d);
		System.out.println(a2.getAd()+" "+a2.getSoyad()+" "+a2.getMaas()+" "+a2.getFilm_sayisi());	
	}
		
	

}
