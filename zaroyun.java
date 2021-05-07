import java.util.Random;

public class zaroyun {
	private static final Random randNum=new Random();
	private enum Durum{
		devam,kaybet,kazan;
	}
	public static int zarat() {
		int x=randNum.nextInt(5)+1;
		return x;
	}
	
	public static void main(String[] args) {
		int puan=0;
		Durum oyundurumu;
		int zartoplami=zarat();
		switch(zartoplami) {
		
		case 7:
		case 11:oyundurumu=Durum.kazan;break;
		case 2:
		case 3:
		case 12:oyundurumu=Durum.kaybet;break;
		
		default:oyundurumu=Durum.devam;
			puan=zartoplami;
		}
	
		while(oyundurumu==Durum.devam) {
			zartoplami=zarat();
			if(zartoplami==puan) {
				oyundurumu=Durum.kazan;
			}
			else{
				if(zartoplami==7) {
					oyundurumu=Durum.kaybet;
				}
			}
		
		}
		if(oyundurumu==Durum.kazan) {
			System.out.println("kazandın");
		}
		else {
			System.out.println("kaybettin");
		}
	}

}
