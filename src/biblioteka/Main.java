package biblioteka;

public class Main {
    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka();

        Wydawnictwo wydawnictwo1 = new Wydawnictwo("PWN","Lublin");
        Wydawnictwo wydawnictwo2 = new Wydawnictwo("27PRESS","Warszawa");
        Wydawnictwo wydawnictwo3 = new Wydawnictwo("2KOLOR","Gdańsk");
        Wydawnictwo wydawnictwo4 = new Wydawnictwo("3DOM","Bydgoszcz");
        Wydawnictwo wydawnictwo5 = new Wydawnictwo("ExLibris","Sochaczew");

        Autor autor1 = new Autor("Zbigniew", "Głowacki",1953);
        Autor autor2 = new Autor("Andrzej", "Saleta",1974);
        Autor autor3 = new Autor("Carlos ", "Zafon",1979);
        Autor autor4 = new Autor("Andrzej", "Saleta",1945);
        Autor autor5 = new Autor("Zygmunt", "Miłoszewski",2001);

        Ksiazka ksiazka1 = new Ksiazka("Labirynt Duchów",1985,autor1,50,wydawnictwo1,4 );
        Ksiazka ksiazka2 = new Ksiazka("Wiedźmin",1983,autor2,150,wydawnictwo2,10 );
        Ksiazka ksiazka3 = new Ksiazka("Czarownica",1983,autor3,150,wydawnictwo3,10 );
        Ksiazka ksiazka4 = new Ksiazka("Gwiazdka z nieba",1983,autor4,150,wydawnictwo4,10 );
        Ksiazka ksiazka5 = new Ksiazka("Gawron",1983,autor5,150,wydawnictwo5,10 );
        Ksiazka ksiazka6 = new Ksiazka("Ostatnia Niedziela",1983,autor5,150,wydawnictwo5,10 );
        Ksiazka ksiazka7 = new Ksiazka("Obcy",1983,autor5,150,wydawnictwo5,10 );
        Ksiazka ksiazka8 = new Ksiazka("Człowiek z Gór",1983,autor5,150,wydawnictwo5,10 );
        Ksiazka ksiazka9 = new Ksiazka("Armageddon",1983,autor5,150,wydawnictwo5,10 );
        Ksiazka ksiazka10 = new Ksiazka("Raz Dwa Trzy",1983,autor5,150,wydawnictwo5,10 );

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
                .filter(ksiazka -> ksiazka.getTytul().toString().length()>0)
                .forEach(System.out::println);



    }
}
