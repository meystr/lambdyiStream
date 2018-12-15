package biblioteka;

public class Main {
    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka();

        Wydawnictwo wydawnictwo1 = new Wydawnictwo("PWN","Lublin");
        Wydawnictwo wydawnictwo2 = new Wydawnictwo("27PRESS","Warszawa");
        Wydawnictwo wydawnictwo3 = new Wydawnictwo("2KOLOR","Gdańsk");
        Wydawnictwo wydawnictwo4 = new Wydawnictwo("3DOM","Bydgoszcz");
        Wydawnictwo wydawnictwo5 = new Wydawnictwo("ExLibris","Sochaczew");

        Autor autor1 = new Autor("Zbigniew", "Głowacki",1953,Plec.MĘŻCZYZNA);
        Autor autor2 = new Autor("Andrzej", "Saleta",1974, Plec.MĘŻCZYZNA);
        Autor autor3 = new Autor("Carlos ", "Zafon",1979, Plec.MĘŻCZYZNA);
        Autor autor4 = new Autor("Andrzej", "Saleta",1945, Plec.MĘŻCZYZNA);
        Autor autor5 = new Autor("Anna", "Miłoszewska",2001, Plec.KOBIETA);

        Ksiazka ksiazka1 = new Ksiazka("Labirynt Duchów",1985,autor1,50,wydawnictwo1,4 );
        Ksiazka ksiazka2 = new Ksiazka("Wiedźmin",1983,autor2,150,wydawnictwo2,10 );
        Ksiazka ksiazka3 = new Ksiazka("Czarownica",1983,autor3,75,wydawnictwo3,9 );
        Ksiazka ksiazka4 = new Ksiazka("Gwiazdka z nieba",1983,autor4,32,wydawnictwo4,6 );
        Ksiazka ksiazka5 = new Ksiazka("Gawron",1983,autor5,150,wydawnictwo5,0 );
        Ksiazka ksiazka6 = new Ksiazka("Ostatnia Niedziela",1983,autor5,200,wydawnictwo5,2 );
        Ksiazka ksiazka7 = new Ksiazka("Obcy",1983,autor4,150,wydawnictwo4,15 );
        Ksiazka ksiazka8 = new Ksiazka("Człowiek z Gór",1983,autor3,543,wydawnictwo3,3 );
        Ksiazka ksiazka9 = new Ksiazka("Armageddon",1983,autor2,123,wydawnictwo2,5 );
        Ksiazka ksiazka10 = new Ksiazka("Raz Dwa Trzy",1983,autor1,175,wydawnictwo1,30 );

        biblioteka.dodajKsiazki(ksiazka1);
        biblioteka.dodajKsiazki(ksiazka2);
        biblioteka.dodajKsiazki(ksiazka3);
        biblioteka.dodajKsiazki(ksiazka4);
        biblioteka.dodajKsiazki(ksiazka5);
        biblioteka.dodajKsiazki(ksiazka6);
        biblioteka.dodajKsiazki(ksiazka7);
        biblioteka.dodajKsiazki(ksiazka8);
        biblioteka.dodajKsiazki(ksiazka9);
        biblioteka.dodajKsiazki(ksiazka10);

        biblioteka.getKsiazki().stream()
                .filter(ksiazka -> ksiazka.getTytul().length()>0)
                .forEach(ksiazka -> System.out.println(ksiazka.getTytul()));



    }
}
