//Muhammad Raysa Farhan : 227064516100
//Salma Salsabilla : 227064516069
package tugas2;
public class main {
    public static void main(String[] args) {
        karyawan manusia1 = new karyawan ();
        manusia1.NIP      = "MRF10";
        manusia1.nama     = "Muhammad Raysa Farhan";
        manusia1.kelamin  = "Laki - Laki";
        manusia1.jmlhari  = 28;
        manusia1.karyawan ();
        manusia1.AbsenKerja();
        manusia1.HitungGaji();
        System.out.println();
        
        karyawan manusia2 = new karyawan ();
        manusia2.NIP      = "SS30";
        manusia2.nama     = "Salma Salsabilla";
        manusia2.kelamin  = "Perempuan";
        manusia2.jmlhari  = 25;
        manusia2.karyawan();
        manusia2.AbsenKerja();
        manusia2.HitungGaji();
    }
}
