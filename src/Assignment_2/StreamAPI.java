package Assignment_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 2, 2, 4, 7, 9, 11, 44, 23, 12, 12, 34);

        List<Integer> result = numbers.stream()
                .distinct()           // Remove duplicates
                .filter(n -> n % 2 == 0)  // Filter even no.
                .map(n -> n * n)      // Square the no.
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
