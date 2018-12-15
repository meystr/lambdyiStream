package pl.sda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


    public void sortuj(List<Integer> lista1, List<Integer> lista2) {
        lista1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);

            }
        });

        lista2.sort((o1, o2) -> o1.compareTo(o2));


        System.out.println(lista1);
        System.out.println(lista2);
    }

    interface funkcyjny {
        int dodaj(int a, int b);
    }

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        Main main = new Main();
        lista1.add(4);
        lista1.add(7);
        lista1.add(-21);
        lista1.add(6);
        lista1.add(53);

        lista2.add(2);
        lista2.add(10);
        lista2.add(45);
        lista2.add(0);
        lista2.add(-3);
        lista2.add(111);

        main.sortuj(lista1, lista2);


        new funkcyjny() {
            @Override
            public int dodaj(int a, int b) {
                return a + b;
            }
        };
        (a, b) -> System.out.println(a + b);
    }
}


