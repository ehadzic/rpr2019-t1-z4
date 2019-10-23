package ba.unsa.etf.rpr;

public class Supermarket {
    private final int maxBrojArtikala = 1000;
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

    public boolean dodajArtikl(Artikl artikl) {

        if (brojArtikala < maxBrojArtikala) {
            artikli[brojArtikala] = artikl;
            brojArtikala++;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl artikl = new Artikl();
        if(0 == artikli.length) System.out.println("Nema dostupnih artikala!");
        for(int i = 0; i < brojArtikala; i++){
            if (artikli[i].getKod().equals(kod)){
                artikl = artikli[i];
                for(int j = i; j < brojArtikala - 1; j++){
                    artikli[j] = artikli[j+1];
                }
                brojArtikala--;
                artikli[brojArtikala] = null;
                break;
            }
        }
        return artikl;

    }



}
