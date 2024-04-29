package co.edu.cue;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException{
        FactoryPayment factoryPayment = new FactoryPayment();
        Payment payment = factoryPayment.getPayment(TypePayment.BITCOIN);
        payment.createPayment();
    }
}