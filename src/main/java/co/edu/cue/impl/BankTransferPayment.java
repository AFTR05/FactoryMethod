package co.edu.cue.impl;

import co.edu.cue.Payment;

public class BankTransferPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("Se ha procesado pago por transferencia de banco");
    }
}
