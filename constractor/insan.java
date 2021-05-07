
public class insan {
	private String ad;
	private String soyad;
	private int yas;
	private int maas;
	public int ekstra=10;
	
public insan(String ad,String soyad,int yas,int maas) {
	this.ad=ad;
	this.soyad=soyad;
	this.yas=yas;
	this.maas=maas;
}
public insan() {}
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
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}
public int getMaas() {
	return maas;
}
public void setMaas(int maas) {
	this.maas = maas;
}


public int maasyeni(int maas,int ekstra) {
	int maasyeni;
	maasyeni=maas+(ekstra*2);
	return maasyeni;
}

}
