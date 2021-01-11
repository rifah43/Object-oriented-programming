package mobile_banking;

import java.util.Scanner;

    public class Account_details {

        private String name;
        private int phoneNumber;
        private double balance;
        Double cashIn,cash_out;
        private int pIn;

        Scanner input = new Scanner(System.in);

        public Account_details(String name) {
            this.name = name;
        }

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
        public int changePin(int pIn)
        {
            int p;
            System.out.println("Enter old pin");
            p = input.nextInt();
            if (p==pIn)
            {
                System.out.println("Enter new pin:");
                this.pIn = input.nextInt();
            }
            else
            {
                System.out.println("The pin you have entered is wrong. Use your old pin");
            }
            return  this.pIn;
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
        public void addMoney(double cashIn){
            this.balance = balance + cashIn;
            System.out.println("Balance"+balance);
        }
        //    addmoney
        public double cashOut()
        {
            System.out.println("Enter the amount to cashout");
            cash_out= input.nextDouble();
            if (balance >= cash_out){
                balance = balance - cash_out;
                System.out.println("Cash out done: ");
            }

            else {
                System.out.println("Cashout is not possible");
            }
            return balance;
        }
        public void cashOutBkash( double charge)
        {
            System.out.println("Enter the amount to cashout");
            cash_out= input.nextDouble();
            if (cash_out <= 25000 && cash_out<=balance) {
                balance = balance - cash_out-((cash_out * charge) / 1000);
            }
            else {
                System.out.println("Cashout is not possible :(");
            }
        }
        public void cashOutRocket(double charge)
        {
            System.out.println("Enter the amount to cashout");
            cash_out= input.nextDouble();
            if (cash_out <= 50000 && cash_out<=balance) {
                balance = balance - cash_out- ((cash_out * charge) / 1000);
            }
            else {
                System.out.println("Cashout is not possible :(");
            }
        }
        public void cashOutNagad(double charge)
        {
            System.out.println("Enter the amount to cashout");
            cash_out= input.nextDouble();
            if (cash_out <= 30000 && cash_out<=balance) {
                balance = balance - cash_out - ((cash_out * charge) / 1000);
            }
            else {
                System.out.println("Cashout is not possible :(");
            }
        }
        //    cashout

    }
