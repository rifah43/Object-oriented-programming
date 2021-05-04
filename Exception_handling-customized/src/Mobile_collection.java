import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mobile_collection{

    public void list() throws Exception_handle{

        List<String> Collection = new ArrayList<>();
        Collection.add("Xiaomi");
        Collection.add("Samsung");
        Collection.add("Vivo");
        Collection.add("Oppo");
        Collection.add("Nokia");
        int num;
        String name;
        System.out.println("Enter the name of the company:");
        Scanner S = new Scanner(System.in);
        name = S.nextLine();
        if (Collection.contains(name)) {
            System.out.println("The model is available");
        }
        else{
            throw new Exception_handle(Collection,name);
        }
    }
}
