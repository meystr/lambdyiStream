package biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Ksiazka> ksiazki = new ArrayList<>();

    public void dodajKsiazki(Ksiazka ksiazkaDoDodania) {
        ksiazki.add(ksiazkaDoDodania);
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                "ksiazki=" + ksiazki +
                '}';
    }
}
