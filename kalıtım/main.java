public class Main {
    public static void main(String[] args){
        Personel ayse=new Personel("ayse", "yılms", 21);
        System.out.println(ayse.getKimlikBilgileri());
        System.out.println(ayse.toString());
        Ogrenci ece = new Ogrenci("ece", "sasd", 22, 1234);
        System.out.println(ece.getKimlikBilgileri());

        Ogrenci burak = new Ogrenci("burak", "sadsd", 21, 1235);
        System.out.println(burak.getKimlikBilgileri());

        Ogrenci ahmet = new Ogrenci("ahmet", "sjssn", 21, 1236);
        System.out.println(ahmet.getKimlikBilgileri());

        Ogrenci ceylan = new Ogrenci("ceylan", "asdsa", 22, 1237);
        System.out.println(ceylan.getKimlikBilgileri());

}}
