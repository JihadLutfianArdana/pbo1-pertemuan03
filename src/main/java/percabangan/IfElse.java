package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double ttlbelanja = 10000;
        double duitdompet = 50000;
        
        if (ttlbelanja<duitdompet){
            System.out.println("Uang kurang, kurangi Belanja");
        }
        else {
            System.out.println("Uang Cukup, Aman");
        }
    }
}
