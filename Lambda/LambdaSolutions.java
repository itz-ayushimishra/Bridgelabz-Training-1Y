import java.util.*;

public class LambdaSolutions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,8,1);
        list.sort((a,b) -> a-b);
        list.forEach(System.out::println);
    }
}
