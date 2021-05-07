public class Ogrenci {
    private String isim;
    private String soyisim;
    private int yas;
    private int ogrenciNo;

    public Ogrenci() {
        isim="Henuz girilmedi";
        soyisim="Henuz girilmedi";
        yas=0;
        ogrenciNo=0;
    }

    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        this.isim = isim;
        this.soyisim=soyisim;
        this.yas=yas;
        this.ogrenciNo=ogrenciNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if (ogrenciNo<0){
            this.ogrenciNo=0;
        }
        else {
        this.ogrenciNo = ogrenciNo;
    }}

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
        this.yas = yas;
    }
    public String getKimlikBilgileri () {
        return "Kimlik bilgileri: \nIsim: " + isim + "\nSoyisim: " + soyisim + "\nYas : " + yas + "\nOgrenci No : " + ogrenciNo ;
    }
    @Override
    public String toString() {
        return  "Kimlik bilgileri toString: Isim: " + isim + "Soyisim" + soyisim + "Yas: " + yas + "Ogrenci No: " + ogrenciNo ;
    }
}
