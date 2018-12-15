package biblioteka;

public class Autor {


    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private final Plec plec;


    public Autor(String imie, String nazwisko, int rokUrodzenia, Plec plecDoDodania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plecDoDodania;
    }

    public Plec getPlec() {
        return plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", plec=" + plec +
                '}';
    }
}
