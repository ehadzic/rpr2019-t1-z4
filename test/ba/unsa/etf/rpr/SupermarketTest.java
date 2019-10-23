package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    @Test
    void dodajArtiklTest() {
        Supermarket supermarket = new Supermarket();
        assertTrue(supermarket.dodajArtikl(new Artikl("jabuka", 3,"1")));
        supermarket.dodajArtikl(new Artikl("badem", 5,"2"));
        supermarket.dodajArtikl(new Artikl("cokolada", 2,"3"));

    }

    @Test
    void izbaciArtiklSaKodomTest() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("jabuka", 3,"1"));
        supermarket.dodajArtikl(new Artikl("badem", 5,"2"));
        supermarket.dodajArtikl(new Artikl("cokolada", 2,"3"));
        supermarket.izbaciArtiklSaKodom("2");
        assertEquals(2,supermarket.getBrojArtikala());
    }
}