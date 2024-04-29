package co.edu.cue.impl;

import co.edu.cue.Payment;

public class GooglePayPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("Se ha procesado pago por Google pay");
    }
}
