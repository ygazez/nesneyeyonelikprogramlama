public class Ford extends Araba {
    private int jantKalÄ±nlÄ±gÄ±;

    public int getJantKalÄ±nlÄ±gÄ±() {
        return jantKalÄ±nlÄ±gÄ±;
    }

    public void setJantKalÄ±nlÄ±gÄ±(int jantKalÄ±nlÄ±gÄ±) {
        this.jantKalÄ±nlÄ±gÄ± = jantKalÄ±nlÄ±gÄ±;
    }

    @Override
    public int saatlikBenzin() {
        return getAgirlik()*2;
    }
}
