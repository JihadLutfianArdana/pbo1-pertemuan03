package percabangan;

public class IfElse2 {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;
        
        if(uangDiDompet<totalBelanja){
            System.out.println("Uang Kurang, Kurangi Jajan Anda");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, Angsul = " + angsul);
            System.out.println("");
        }else {
            System.out.println("Uang Pas");
        }
    }
}
