package co.in.an.eye.tech.java.design.patterns;

public class SingleTone {
    private static SingleTone singleTone = null;

    private SingleTone() {
    }

    public static SingleTone getInstance() {
        if (singleTone == null) {
            synchronized (SingleTone.class) {
                if (singleTone == null) {
                    singleTone = new SingleTone();
                }
            }
        }
        return singleTone;
    }
}
