public class Personel {
    private String isim;
    private String soyisim;
    private int yas;

    public Personel() {
        isim = "Henuz girilmedi";
        soyisim = "Henuz girilmedi";
        yas = 0;
    }
    public Personel (String isim, String soyisim, int yas){
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = 0;
        } else {
            this.yas = yas;
        }}
    public String getKimlikBilgileri () {
        return "Kimlik bilgileri: \nIsim: " + isim + "\nSoyisim: " + soyisim + "\nYas: " + yas;
    }

    @Override
    public String toString() {
        return  "Kimlik bilgileri toString: Isim: " + isim + " Soyisim:" + soyisim + " Yas: " + yas;
    }
}
