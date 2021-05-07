package interfaceler;

public class main {
	public static void main(String[] args) {
		şekil a1=new kare(3);
		şekil a2=new üçgen(4,4);
		System.out.println(a1.alan_hesabı(3,3));
		System.out.println(a2.çevre_hesabı(4));
	}
}
