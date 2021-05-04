import java.util.List;

public class Exception_handle extends Exception{
    String name;
    List<String> Collect;
    public Exception_handle(List<String> Collect,String name){
        this.name = name;
        if( !(Collect.contains(name)) ){
            System.out.print("The model is out of stock");
        }
    }
}
