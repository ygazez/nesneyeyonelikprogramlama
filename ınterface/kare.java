package interfaceler;

public class kare implements şekil {
	public int alan_hesabı(int a,int b) {
		int alan=a*b;
		return alan;
		
	}
	public int çevre_hesabı(int a) {
		int cevre=4*a;
		return cevre;
	}
	private int kenar;
	
	public int getKenar() {
		return kenar;
	}
	public void setKenar(int kenar) {
		this.kenar = kenar;
	}
	public kare(int kenar) {
		this.kenar=kenar;
	}
	public kare() {
		
	}
	


}
