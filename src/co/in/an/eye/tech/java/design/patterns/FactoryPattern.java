package co.in.an.eye.tech.java.design.patterns;

public class FactoryPattern {
    public Object createString (String title){
        if(title == null || title.isBlank()){
            return null;
        }
        return switch (title) {
            case "String" -> new String("using string");
            case "Buffer" -> new StringBuffer("using StringBuffer");
            case "Builder" -> new StringBuilder("using StringBuilder");
            default -> throw new IllegalArgumentException("Unknown channel " + title);
        };
    }

    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();
        Object string = factoryPattern.createString("Builder");
        System.out.println(string);
    }
}