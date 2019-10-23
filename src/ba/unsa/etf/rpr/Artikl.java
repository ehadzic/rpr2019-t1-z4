package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;

    public Artikl(String ime, int i, String s) {
        naziv = ime;
        cijena = i;
        kod = s;
    }

    public Artikl() {
        naziv="";
        cijena = 0;
        kod="";

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
}
