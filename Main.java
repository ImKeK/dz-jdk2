public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> intPair = new Pair<>(5, 10);
        System.out.println(PairUtils.processPair(intPair)); // Вывод: Sum: 15.0

        Pair<String, String> stringPair = new Pair<>("Hello, ", "World!");
        System.out.println(PairUtils.processPair(stringPair)); // Вывод: Concatenation: Hello, World!

        Pair<Double, Double> doublePair = new Pair<>(5.5, 4.5);
        System.out.println(PairUtils.processPair(doublePair)); // Вывод: Sum: 10.0

        Pair<String, Integer> mixedPair = new Pair<>("Value: ", 42);
        System.out.println(PairUtils.processPair(mixedPair)); // Вывод: Incompatible types for processing
    }
}