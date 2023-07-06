package tugas2;
public class karyawan {
    String NIP;
    String nama;
    String kelamin;
    int jmlhari;
    int totalgaji;
void karyawan(){
    System.out.println ("NIP : " + NIP);
    System.out.println ("Nama : " + nama);
    System.out.println ("Jenis Kelamin : " + kelamin);
        }
void AbsenKerja (){
    System.out.println ("Absen Kerja : " + jmlhari);
}
void HitungGaji (){
    System.out.println ("Gaji : " + (jmlhari*100000));
}
}
class Dosen extends karyawan{
    String golongan;
    int SKS;
    int upahtotal;
    void HitungGaji(){
        System.out.println ("Total Gaji : " + (SKS*upahtotal*jmlhari));
    }
}
class staff extends karyawan{    
}