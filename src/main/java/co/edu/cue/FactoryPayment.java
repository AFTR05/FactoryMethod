package co.edu.cue;

import co.edu.cue.impl.*;

public class FactoryPayment {
    public Payment getPayment(TypePayment  typePayment) throws NoSuchFieldException{
        return switch (typePayment){
            case PAYPAL -> new PaypalPayment();
            case APPLE_PAY -> new ApplePayPayment();
            case BITCOIN -> new BitcoinPayment();
            case EFECTIVO -> new CashPayment();
            case TARJETA_CREDITO -> new CreditCardPayment();
            case TARJETA_DEBITO -> new DebitCardPayment();
            case GOOGLE_PAY -> new GooglePayPayment();
            case TRANSFERENCIA_BANCARIA -> new BankTransferPayment();
            default -> throw new NoSuchFieldException("Tipo de pago no admitido");
        };
    }
}
