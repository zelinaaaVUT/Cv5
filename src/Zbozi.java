public abstract class Zbozi {
    private String nazev;
    private double cena_bezdph;
    private final double DPH = 0.21;

    public Zbozi(String nazev, double cena_bezdph){
        this.nazev = nazev;
        this.cena_bezdph = cena_bezdph;
    }

    public void setNazev(String nazev){
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }
    public void setCena_bezdph(double cena_bezdph){
        this.cena_bezdph = cena_bezdph;
    }

    public double getCena_bezdph() {
        return cena_bezdph * (DPH + 1);
    }

    public abstract String getJednotka();
}
