public class Urun {
    private String urunAdi;
    private String urunTuru;
    private  Zaman skt;

    public Urun(Zaman skt, String urunAdi, String urunTuru) {
        this.urunAdi=urunAdi;
        this.urunTuru=urunTuru;
        this.skt = skt;

    }

    public Zaman getSkt() {

        return skt;
    }

    public void setSkt(Zaman skt) {
        this.skt = skt;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunTuru() {
        return urunTuru;
    }

    public void setUrunTuru(String urunTuru) {
        this.urunTuru = urunTuru;
    }
}
