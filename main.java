package Zadanie1;

import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        List<Product> produkty = new ArrayList<>();
        produkty.add(new Product("Deska", "description", 1000));
        produkty.add(new Product("Kanapka", "Z szynką", 200));
        produkty.add(new Product("bułka", "costam", 12));
        produkty.add(new Product("Mleko", "Biale", 501));
        produkty.add(new Product("chleb", "krojony", 5));

        List<Product> produkty2 = produkty.stream()
                .filter((x) -> x.name().startsWith("D"))
                .filter((x) -> x.quantity() > 500).toList();

        System.out.print(produkty2);
    }
}

/*
dodaj 5 nowych produktow > sreeam odfiltruj rekordy, ktore maja:
D jako 1 litere
x>500
 */