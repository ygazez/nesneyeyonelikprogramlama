package interfaceler;

public class üçgen implements şekil {
	private int taban;
	private int yükseklik;
	public üçgen(int taban,int yükseklik) {
		this.yükseklik=yükseklik;
		this.taban=taban;
	}
	public üçgen() {
		
	}
	public int getTaban() {
		return taban;
	}
	public void setTaban(int taban) {
		this.taban = taban;
	}
	public int getYükseklik() {
		return yükseklik;
	}
	public void setYükseklik(int yükseklik) {
		this.yükseklik = yükseklik;
	}
	@Override
	public int alan_hesabı(int a, int b) {
		int alan=a*b/2;
		
		return alan;
	}
	@Override
	public int çevre_hesabı(int a) {
		int cevre=a*3;
		return cevre;
	}

	
}
