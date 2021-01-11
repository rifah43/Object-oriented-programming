package mobile_banking;

import java.util.Scanner;

public class Nagad extends Account_details{
    final double cashoutCharge = 9.9;
    private int accountNumber;
    double balance;
    int pin;

    @Override
    public double get_balance() {
        balance = super.get_balance();
        return balance;
    }
    public Nagad(String name,int number,double balance, int pin){
        super(name,pin);
        this.pin = getPin();
        this.accountNumber = number;
    }

    public Nagad(String name,int number){
        super(name);
        this.accountNumber=number;
    }

    public void cashInNagad(double amount) {
        if(amount<=30000)
        super.addMoney(amount);
        else
        System.out.println("Sorry.Cash in limit exceeded");
    }
    public void cash_OutN() {

        cashOutBkash(cashoutCharge);
    }

}
