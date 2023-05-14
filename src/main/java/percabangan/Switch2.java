package percabangan;

public class Switch2 {
    public static void main(String[] args) {
        char nilai='C';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   :\"Terima kasih pak\" ");
                System.out.println("Dosen :\"Selamat Ya!");
                break;
            case 'B':
                System.out.println("Mhs   :\"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen :\"....\"");
                break;
            case 'C':
                System.out.println("Mhs   :\"Ulun Turun tarus pak ai, tugas ya jua\" ");
                System.out.println("Dosen :\"Tapi bisa lah menjawab ujian?");
                System.out.println("Mhs   :\"Hqhqhq\"");
                break;
            default:
                System.out.println("Mhs   :\"Pinanya Ulun Ngulang pak Semester Depan\"");
                break;
        }
    }
}
