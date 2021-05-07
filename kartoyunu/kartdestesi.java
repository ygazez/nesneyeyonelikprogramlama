import java.util.Random;

public class kartdestesi {
	private static final int kart_sayisi=52;
	private kart deste[]=new kart[kart_sayisi];
	int i;
	private int siradakikart=0;
	private static final Random randNum=new Random();
	public kartdestesi() {
		String []no= {"as","papaz","kız","vale","iki","uc","dort","bes","altı","yedi","sekiz","dokuz","on"};
		String tur[]= {"kupa","karo","maca","sinek"};
		for(i=0;i<deste.length;i++) {
			deste[i]=new kart(no[i%13],tur[i%4]);
		}
	}
	public void kart_karistir() {
		int birinci;
		for(birinci=0;birinci<deste.length;birinci++) {
			int ikinci=randNum.nextInt(kart_sayisi);
			kart temp=deste[birinci];
			deste[ikinci]=deste[birinci];
			deste[ikinci]=temp;
		}
		
	}
	
	public kart kart_dagit() {
		if(siradakikart<deste.length) {
			return deste[siradakikart++];
		}
		else {
			return null;
		}
	}
}
