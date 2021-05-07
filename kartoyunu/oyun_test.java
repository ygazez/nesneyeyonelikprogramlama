
public class oyun_test {

	public static void main(String[] args) {
		kartdestesi yenideste=new kartdestesi();
		yenideste.kart_karistir();
		int i;
		for(i=0;i<52;i++) {
			System.out.println(yenideste.kart_dagit());
			if(i%4==0) {
				System.out.println();
			}
		}
		

	}

}
