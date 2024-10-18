public class PairUtils {

    public static <T, U> String processPair(Pair<T, U> pair) {
        T first = pair.getFirst();
        U second = pair.getSecond();

        if (first instanceof Number && second instanceof Number) {
            double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue();
            return "Sum: " + sum;
        } else if (first instanceof String && second instanceof String) {
            return "Concatenation: " + first.toString() + second.toString();
        } else {
            return "Incompatible types for processing";
        }
    }
}
