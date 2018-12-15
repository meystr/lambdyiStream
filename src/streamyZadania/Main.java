package streamyZadania;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        IntStream.range(0, 10)
                .filter(liczbyniep -> liczbyniep % 2 == 1)
               // .filter(liczbyniep -> liczbyniep+ liczbyniep)
                .forEach(System.out::println);



    }
}
