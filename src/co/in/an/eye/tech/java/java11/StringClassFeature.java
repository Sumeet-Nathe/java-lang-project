package co.in.an.eye.tech.java.java11;

public class StringClassFeature {
    public static void main(String[] args) {
        String s = "  Sumeet  ";
        System.out.println("strip() : Remove white-spaces throughout the string");
        System.out.println(s.strip());

        System.out.println("stripLeading() : Remove white-spaces from beginning of the string");
        System.out.println(s.stripLeading());

        System.out.println("stripTrailing() : Remove white-spaces from ending of the string");
        System.out.println(s.stripTrailing());

        System.out.println("repeat() :  repeat the string specified number of times :");
        System.out.println(s.repeat(3));

        String sample = "Sumeet\nManoj\nNathe\nChandori";
        sample.lines().forEach(System.out::println);
    }
}
