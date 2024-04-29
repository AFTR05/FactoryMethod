package co.edu.cue.impl;

import co.edu.cue.Payment;

public class ApplePayPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("Se ha procesado pago por Apple Pay");
    }
}
