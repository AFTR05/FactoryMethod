package co.edu.cue.impl;

import co.edu.cue.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("Se ha procesado pago por tarjeta de credito");
    }
}
