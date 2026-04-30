import java.util.regex.*;
public class RegexSolutions {
    public static void main(String[] args) {
        String username = "user_123";
        System.out.println(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));

        String plate = "AB1234";
        System.out.println(plate.matches("^[A-Z]{2}\d{4}$"));

        String hex = "#FFA500";
        System.out.println(hex.matches("^#[0-9A-Fa-f]{6}$"));
    }
}
