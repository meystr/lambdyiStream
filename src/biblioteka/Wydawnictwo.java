package biblioteka;

public class Wydawnictwo {
    private String nazwa;
    private String miasto;

    public Wydawnictwo(String nazwa, String miasto) {
        this.nazwa = nazwa;
        this.miasto = miasto;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Wydawnictwo{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
