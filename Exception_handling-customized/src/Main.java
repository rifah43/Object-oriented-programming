import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Mobile_collection user = new Mobile_collection();
        try{
            user.list();
        }
        catch(Exception_handle e) {
            System.out.println (".");
        }
    }
}