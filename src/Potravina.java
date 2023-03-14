public class Potravina extends Zbozi{
    private int trvanlivost;

    public Potravina(String nazev, double cena_bez_dph, int trvanlivost){
        super(nazev, cena_bez_dph);
        this.trvanlivost = trvanlivost;
    }
    public void setTrvanlivost(int trvanlivost){
        this.trvanlivost = trvanlivost;
    }

    public int getTrvanlivost() {
        return trvanlivost;
    }

    @Override
    public String getJednotka() {
        return "dnu";
    }
}
