package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpica = new Korpa();
        assertTrue(korpica.dodajArtikl(new Artikl("jabuka", 3,"1")));
        assertTrue(korpica.dodajArtikl(new Artikl("badem", 3,"2")));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpica = new Korpa();
        korpica.dodajArtikl(new Artikl("jabuka", 3,"1"));
        korpica.dodajArtikl(new Artikl("badem", 3,"2"));
        korpica.izbaciArtiklSaKodom("1");
        assertEquals(1, korpica.getBrojArtikala());

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpica = new Korpa();
        korpica.dodajArtikl(new Artikl("jabuka", 3,"1"));
        korpica.dodajArtikl(new Artikl("badem", 3,"2"));
        assertEquals(6,korpica.dajUkupnuCijenuArtikala());
    }
}