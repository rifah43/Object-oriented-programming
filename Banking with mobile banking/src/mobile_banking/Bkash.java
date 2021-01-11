package mobile_banking;

import java.util.Scanner;

public class Bkash extends Account_details{
    final double cashoutCharge = 18.5;
    private int accountNumber;
    int pin;
    int inpin;


    public Bkash(String name,int number,double balance, int pin){
        super(name,pin);
        this.pin = getPin();
        this.accountNumber = number;
    }

    public Bkash(String name,int number){
        super(name);
        this.accountNumber=number;
    }

    public void cashInBkash(double amount) {
        if(amount<=25000)
            super.addMoney(amount);
        else
            System.out.println("Sorry.Cash in limit exceeded");
    }

        public void cash_OutB() {

        cashOutBkash(cashoutCharge);
    }

}
