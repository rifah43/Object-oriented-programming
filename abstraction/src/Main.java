public class Main {
    public static void main(String[] args) {
        Abstract m1;
        Abstract m2;
        m1 = new Man1();
        m2 = new Man2();
        m1.sendMessage();
        m2.sendMessage();

    }
}
