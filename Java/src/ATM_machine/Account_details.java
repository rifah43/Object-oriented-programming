package ATM_machine;

import java.util.Scanner;

public class Account_details {

    private String name;
    private int phoneNumber;
    private double balance;
    Double cashIn,cash_out;
    private int pIn;

    Scanner input = new Scanner(System.in);
    public void setPin(int pIn)
    {
        this.pIn = pIn;
    }
    //    to input the amount to keep in bank
    public Account_details(String name, int pnoneNumber){
        this.name = name;
        this.phoneNumber = pnoneNumber;
    }
    //    constructor

    public int getPin()
    {
        return this.pIn;
    }
    public String get_name(){
        return this.name;
    }
    //    to get name
    public int get_pnone_number(){
        return this.phoneNumber;
    }
    //    to get number
    public double get_balance(){
        return this.balance;
    }
    //    to get balance
    public void addMoney(){
        System.out.println("Enter the amount to keep");
        cashIn= input.nextDouble();
        this.balance = balance + this.cashIn;
        System.out.println("Balance"+balance);
    }
    //    addmoney
    public void cashOut()
    {
        System.out.println("Enter the amount to cashout");
        cash_out= input.nextDouble();
        if (balance >= cash_out){
            balance = balance - cash_out;
            System.out.println("Cash out done: " + cash_out);
        }

        else {
            System.out.println("Cashout is not possible");
        }
    }
    //    cashout


}
