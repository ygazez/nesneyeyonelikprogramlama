
public class kart {
	private String kartno;
	private String kartturu;
	public kart(String no,String tur) {
		kartno=no;
		kartturu=tur;
	}
	public String toString() {
		return kartturu+" "+kartno;
	}	
}
