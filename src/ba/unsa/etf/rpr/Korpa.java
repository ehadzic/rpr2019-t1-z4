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

    public Artikl izbaciArtikl(String kod) {
        Artikl artikl = new Artikl();
        if (0 == artikli.length) System.out.println("Nema dostupnih artikala!");
        for (int i = 0; i < brojArtikala; i++) {
            if (artikli[i].getKod().equals(kod)) {
                artikl = artikli[i];
                for (int j = 0; j < brojArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
                brojArtikala--;
                artikli[brojArtikala] = null;
                break;
            }
        }
        return artikl;
    }

    public int dajUkupnuCijenuArtikala(){
        int suma = 0;
        for(int i = 0; i < brojArtikala; i++){
            suma+=artikli[i].getCijena();
        }
        return suma;
    }


}
