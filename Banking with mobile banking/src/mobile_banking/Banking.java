package mobile_banking;

import java.util.Scanner;


    public class Banking {
        public void banking(){
            String name;
            int number;
            int pin,finalPin,inpin;
            double cashin,cash_out;
            Scanner input = new Scanner(System.in);
//        for 1st user
            System.out.println("Enter the Username");
            name = input.next();
            //        input of name
            System.out.println("Enter the Number");
            number = input.nextInt();
            //        input of number
            System.out.println("Enter pin to set pin");
            pin = input.nextInt();
            //        input of pin
            Account_details user1 = new Account_details(name, number);
            user1.setPin(pin);
            finalPin = user1.getPin();
//        setting pin
            Bkash user1b = new Bkash(name, number);
            System.out.println("Enter the amount to keep in Bkash");
            cashin= input.nextDouble();
            user1b.cashInBkash(cashin);

            Rocket user1r = new Rocket(name, number);
            System.out.println("Enter the amount to keep in Rocket");
            cashin= input.nextDouble();
            user1r.cashInRocket(cashin);

            Nagad user1n = new Nagad(name, number);
            System.out.println("Enter the amount to keep in Nagad");
            cashin= input.nextDouble();
            user1n.cashInNagad(cashin);

            System.out.println("Enter the amount to keep in bank");
            cashin= input.nextDouble();
            user1.addMoney(cashin);
            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                System.out.println("Name: " + user1.get_name());
                System.out.println("Phone number: " + user1.get_pnone_number());
                System.out.println("Balance: " + user1.get_balance());

                System.out.println("Enter the amount to cashout");
                cash_out= input.nextDouble();
                user1.cashOut();
                System.out.println("Balance: " + user1.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }
            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user1b.cash_OutB();
                System.out.println("Balance: " + user1b.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user1r.cash_OutR();
                System.out.println("Balance: " + user1r.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user1n.cash_OutN();
                System.out.println("Balance: " + user1n.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

//        for second user
            System.out.println("Enter the Username");
            name = input.next();
            //        input of name
            System.out.println("Enter the Number");
            number = input.nextInt();
            //        input of number
            System.out.println("Enter pin to set pin");
            pin = input.nextInt();
            //        input of pin
            Account_details user2 = new Account_details(name, number);
            user2.setPin(pin);
            finalPin = user2.getPin();
//        setting pin

            Bkash user2b = new Bkash(name, number);
            System.out.println("Enter the amount to keep in Bkash");
            cashin= input.nextDouble();
            user2b.cashInBkash(cashin);

            Rocket user2r = new Rocket(name, number);
            System.out.println("Enter the amount to keep Rocket");
            cashin= input.nextDouble();
            user2r.cashInRocket(cashin);

            Nagad user2n = new Nagad(name, number);
            System.out.println("Enter the amount to keep in Nagad");
            cashin= input.nextDouble();
            user2n.cashInNagad(cashin);

            System.out.println("Enter the amount to keep in bank");
            cashin= input.nextDouble();
            user2.addMoney(cashin);
            System.out.println("Enter the amount to keep in bank");
            cashin= input.nextDouble();
            user2.addMoney(cashin);
            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                System.out.println("Name: " + user2.get_name());
                System.out.println("Phone number: " + user2.get_pnone_number());
                System.out.println("Balance: " + user2.get_balance());

                user2.cashOut();
                user2.cashOut();
                System.out.println("Balance: " + user2.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2b.cash_OutB();
                System.out.println("Balance: " + user2b.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2r.cash_OutR();
                System.out.println("Balance: " + user2r.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2n.cash_OutN();
                System.out.println("Balance: " + user2n.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }


            user2.changePin(pin);
//        pin change

            finalPin = user2.getPin();

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2.cashOut();
                System.out.println("Balance: " + user2.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2b.cash_OutB();
                System.out.println("Balance: " + user2b.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2r.cash_OutR();
                System.out.println("Balance: " + user2r.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

            System.out.println("Enter pin");
            inpin = input.nextInt();
            if (finalPin==inpin) {
                user2n.cash_OutN();
                System.out.println("Balance: " + user2n.get_balance());
            }
            else
            {
                System.out.println("Wrong pin");
            }

        }
}
