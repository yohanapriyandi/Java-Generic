package ardhastudio.Application;

import ardhastudio.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<String, String>("Fathar Dhabit Adz-Dzaky", "Ummi & Abi");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
