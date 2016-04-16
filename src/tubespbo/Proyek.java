package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Biyan Ilham Akbar (1301144319)
 */
public class Proyek {
    private String nama;
    private ArrayList<Programmer> arrayProgrammer;
    private ArrayList<Tugas> arrayTugas;
    private String status; 
    private String perusahaan;
    private int maxAnggota;
    private int maxTugas = 10;
    private int nAnggota;
    private int nTugas = 0;

    public Proyek() {
    }
        
    public Proyek(String nama, String perusahaan) {
        this.nama = nama;
        this.perusahaan = perusahaan;
        maxAnggota = 5;
        nAnggota = 0;
        arrayProgrammer = new ArrayList<>(maxAnggota);
        arrayTugas = new ArrayList<>(maxTugas);
    }
    
    public Proyek(String nama, String perusahaan, int maxAnggota) {
        this.nama = nama;
        this.perusahaan = perusahaan;
        nAnggota = 0;
        this.maxAnggota = maxAnggota;
        arrayProgrammer = new ArrayList<>(maxAnggota);
    }
    
    public void tambahJumlahTugas(){
        nTugas++;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public Programmer getAnggota(String id) {
        for(Programmer p : arrayProgrammer){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    } 

    public int getMaxAnggota() {
        return maxAnggota;
    }

    public void setMaxAnggota(int maxAnggota) {
        this.maxAnggota = maxAnggota;
    }

    public ArrayList<Programmer> getArrayProgrammer() {
        return arrayProgrammer;
    }

    public ArrayList<Tugas> getArrayTugas() {
        return arrayTugas;
    }

    public int getMaxTugas() {
        return maxTugas;
    }

    public int getnAnggota() {
        return nAnggota;
    }

    public int getnTugas() {
        return nTugas;
    }

    public void setnAnggota(int nAnggota) {
        this.nAnggota = nAnggota;
    }

    public void setnTugas(int nTugas) {
        this.nTugas = nTugas;
    }

    public void setArrayTugas(ArrayList<Tugas> arrayTugas) {
        this.arrayTugas = arrayTugas;
    }
    
    public Tugas getTugas(String nama){
        for(Tugas t : arrayTugas){
            if(t.getNama().equals(nama)){
                return t;
            }
        }
        return null;
    }
}