package ATM_machine;

import java.util.Scanner;
public class Banking {
    public void banking(){
        String name;
        int number;
        int pin,finalPin,inpin;
        Scanner input = new Scanner(System.in);
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
        System.out.println("Enter pin");
        inpin = input.nextInt();
        if (finalPin==inpin) {
            user1.addMoney();
            System.out.println("Name: " + user1.get_name());
            System.out.println("Phone number: " + user1.get_pnone_number());
            System.out.println("Balance: " + user1.get_balance());

            user1.cashOut();
            System.out.println("Balance: " + user1.get_balance());
        }
        else
        {
            System.out.println("Wrong pin");
        }

    }
}
