package operator;

public class Pbo1Pertemuan03 {
    public static void main(String[] args) {
        String nama = "Jihad Lutfian Ardana";
        String kota = "Banjarbaru";
        
        System.out.println(nama);
        System.out.println(kota);
        
        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        
        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,6));
    }
}
