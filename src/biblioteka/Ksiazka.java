package biblioteka;

public class Ksiazka {
    private String tytul;
    private int rokWydania;
    private Autor autor;
    private int cena;
    private Wydawnictwo wydawnictwo;
    private int liczbaSztuk;

    public Ksiazka(String tytul, int rokWydania, Autor autor, int cena, Wydawnictwo wydawnictwo, int liczbaSztuk) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.autor = autor;
        this.cena = cena;
        this.wydawnictwo = wydawnictwo;
        this.liczbaSztuk = liczbaSztuk;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setWydawnictwo(Wydawnictwo wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public void setLiczbaSztuk(int liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", rokWydania=" + rokWydania +
                ", autor=" + autor +
                ", cena=" + cena +
                ", wydawnictwo=" + wydawnictwo +
                ", liczbaSztuk=" + liczbaSztuk +
                '}';
    }
}
