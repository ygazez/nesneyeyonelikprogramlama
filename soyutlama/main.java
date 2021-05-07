public class Main {
    public static void main(String[] args){

        Araba f = new Ford();
        f.setAgirlik(1500);
        f.setModel("fiesta");
        f.setRenk("Siyah");

        goster(f);
        Araba h=new Honda();
        h.setAgirlik(1000);
        h.setModel("civic");
        h.setRenk("lacivert");

        goster(h);


    }
    public static void goster(Araba a){
        System.out.println("AÄŸÄ±rlÄ±k: " + a.getAgirlik());
        System.out.println("Model: " + a.getModel());
        System.out.println("Renk: " + a.getRenk());
        System.out.println("Benzin: " + a.saatlikBenzin());
    }
}
