public class Naradi extends Zbozi{
    private int zarucni_doba;
    public Naradi(String nazev, double cena_bezdph, int zarucni_doba){
        super(nazev, cena_bezdph);
        this.zarucni_doba = zarucni_doba;
    }
    public void setZarucni_doba(int zarucni_doba){
        this.zarucni_doba = zarucni_doba;
    }

    public int getZarucni_doba() {
        return zarucni_doba;
    }

    @Override
    public String getJednotka() {
        return "mesicu";
    }
}
