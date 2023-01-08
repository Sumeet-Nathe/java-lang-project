package co.in.an.eye.tech.java.java8.streams;

public class Salary {
    double payment;

    public Salary() {
    }

    public Salary(double salary) {
        this.payment = salary;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "payment=" + payment +
                '}';
    }
}
