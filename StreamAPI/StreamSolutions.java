import java.util.*;
import java.util.stream.*;

public class StreamSolutions {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,2,9,1,7,6);
        nums.stream().sorted().limit(5).forEach(System.out::println);

        List<String> names = Arrays.asList("ayushi","rahul","zara");
        names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
