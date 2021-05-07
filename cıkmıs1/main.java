import java.util.*;
public class Main {

        public static void main(String[] args) {
        Urun [] dizi1 = new Urun [2];
        String ad;
        String tur;
        int ay=0;
        int yil=0;

        Scanner tara=new Scanner(System.in);

        for(int i=0; i<dizi1.length; i++){
            System.out.println("ÃœrÃ¼n adini giriniz: ");
            ad=tara.next();
            System.out.println("ÃœrÃ¼n tÃ¼rÃ¼nÃ¼ giriniz: ");
            tur=tara.next();
            System.out.println("Ayi giriniz: ");
            ay=tara.nextInt();
            if(ay<0 && ay>12){
                System.out.println("AykÄ±rÄ± giriÅŸ yaptÄ±nÄ±z program sonlanÄ±yor");
                break;
            }
            System.out.println("Yili giriniz: ");
            yil=tara.nextInt();
            if(yil<0 && yil>10){
                System.out.println("AykÄ±rÄ± giriÅŸ yaptÄ±nÄ±z program sonlanÄ±yor");
                break;
            }
            Zaman skt=new Zaman(ay,yil);

            dizi1[i] = new Urun(skt,ad,tur);

        }
        dizi1=Sirala(dizi1);
        for(int i=0; i<dizi1.length; i++){
            System.out.println(dizi1[i].getUrunAdi());
        }



        }
        public static Urun[] Sirala(Urun[] dizi){

            Urun u1 = null;

            for(int i=0; i<dizi.length-1; i++){
                for(int j=0; j<dizi.length-1; j++){
                    if(dizi[i].getSkt().getYÄ±l() > dizi[i+1].getSkt().getYÄ±l()){

                        u1=dizi[i];
                        dizi[i]=dizi[i+1];
                        dizi[i+1]=u1;
                    }
                    else if(dizi[i].getSkt().getYÄ±l() == dizi[i+1].getSkt().getYÄ±l()){
                        if(dizi[i].getSkt().getAy() > dizi[i+1].getSkt().getAy()){

                            u1=dizi[i];
                            dizi[i]=dizi[i+1];
                            dizi[i+1]=u1;
                        }
                    }

                }
            }
            return dizi;
        }



    }
