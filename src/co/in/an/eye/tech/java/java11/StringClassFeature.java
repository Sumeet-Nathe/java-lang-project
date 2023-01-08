package co.in.an.eye.tech.java.java11;

public class StringClassFeature {
    public static void main(String[] args) {
        String sample = "Sumeet\nManoj\nNathe\nChandori";
        sample.lines().forEach(System.out::println);
    }
}
