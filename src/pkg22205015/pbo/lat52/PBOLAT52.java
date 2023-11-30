
package pkg22205015.pbo.lat52;

// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Siapa kamu

import java.util.Scanner;

// Deklarasi class Manusia
class Manusia {
    
    protected String nama;
    protected int umur;
       
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama; 
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }

}

class Mahasiswa extends Manusia {
    
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void kelasApa(){
        System.out.println("Saya faqih umur 20 tahun sedang belajar di kelas PBO");
    }

    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}

class Dosen extends Manusia {
    
    private String nip;
    private String matakuliah;
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getMataKuliah(){
        return matakuliah;
    }
    public void setMataKuliah(String matakuliah){
        this.matakuliah = matakuliah;
    }
    public void mengajarApa(){
        setNama("Rizki Adam Kurniawan");
        setMataKuliah("PBO");
        System.out.println("Saya " + getNama() + " umur 27 tahun sedang mengajar matakuliah " + getMataKuliah());
    }
   
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
    
}
// Main method


public class PBOLAT52 {

    public static void main(String[] args) {
        Dosen manusia1;
        Mahasiswa manusia2;
        
        manusia1 = new Dosen();
        manusia1.setNip("41227829930");
        System.out.println("NIP Dosen : " + manusia1.getNip());
        manusia1.siapaKamu();
        manusia1.mengajarApa();
        
        manusia2 = new Mahasiswa();
        manusia2.setNim("22205015");
        System.out.println("\nNIM mahasiswa : " + manusia2.getNim());
        manusia2.siapaKamu();
        manusia2.kelasApa();
    }
    
}
