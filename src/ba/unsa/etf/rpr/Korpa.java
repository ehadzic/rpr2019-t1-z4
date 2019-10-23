package ba.unsa.etf.rpr;

public class Korpa {
    private final int maxBrojArtikala = 50;
    private Artikl[] artikli = new Artikl[maxBrojArtikala];
    private int brojArtikala = 0;

    public int getMaxBrojArtikala() {
        return maxBrojArtikala;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }

    public void setBrojArtikala(int brojArtikala) {
        this.brojArtikala = brojArtikala;
    }

    public boolean dodajArtikl(Artikl artikl){

        if(artikli.length < maxBrojArtikala){
            artikli[brojArtikala] = artikl;
            brojArtikala++;
            return true;
        }
        return false;

    }







}
