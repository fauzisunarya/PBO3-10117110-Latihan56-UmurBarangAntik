
/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Barang Antik Dengan Menggunakan Konsep OOP inheritance,olymorphism dan constructor
 */

package pbo3.pkg10117110.latihan56.umurbarangantik;


public class PBO310117110Latihan56UmurBarangAntik {


    public static void main(String[] args) {
        
        Radio obj = new Radio(234);
        obj.setName("Radio AM");
        System.out.println("Nama barang Antik : "+obj.getName());
        obj.tampilUmur();

        
 
    }
    
}
