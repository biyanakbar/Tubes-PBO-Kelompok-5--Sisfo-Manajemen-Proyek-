/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author biyan
 */
public class Application {
    private ArrayList<Programmer> listProgrammer = new ArrayList();
    private ArrayList<ManajerProyek> listManajer = new ArrayList();
    
    public void insertManajerProyek (String nama, String ttl, String alamat, String noHp, String email){
        listManajer.add(new ManajerProyek(nama, ttl, alamat, noHp, email));
    }
    
    public void insertProgrammer (String nama, String ttl, String alamat, String noHp, String email){
        listProgrammer.add(new Programmer(nama, ttl, alamat, noHp, email));
    }
    
    public ManajerProyek cariManajerProyek(String nama){
        for(ManajerProyek m : listManajer){
            if(m.getNama().equals(nama)){
                return m;
            }
        }
        return null;
    }

    public ArrayList<Programmer> getListProgrammer() {
        return listProgrammer;
    }

    public ArrayList<ManajerProyek> getListManajer() {
        return listManajer;
    }
    
    public ManajerProyek getManajerProyek (int i){
        return listManajer.get(i);
    }
    
    public Programmer cariProgrammer (String nama){
        for(Programmer p : listProgrammer){
            if(p.getNama().equals(nama)){
                return p;
            }
        }
        return null;
    }

    public Programmer getProgrammer(int i) {
        return listProgrammer.get(i);
    }
    
    public void createProyek(ManajerProyek m, String nama, String kantor){
        if(m.getJumlahProyek()<=3){
            Proyek p = new Proyek(nama, kantor);
            m.getArrayProyek().add(p);
            m.setnProyek(m.getJumlahProyek() + 1);
        }
        else{
            System.out.println("---Jumlah proyek sudah melebihi batas---");
        }
    }
    
    public void createTugas(Proyek p, String nama, String deadline){
        Tugas tugas = new Tugas(nama, deadline);
        p.getArrayTugas().add(tugas);
        p.tambahJumlahTugas();
    }
    
    public void addAnggota(Proyek p, Programmer pro){
        if(p.getnAnggota()<=p.getMaxAnggota()){
            p.getArrayProgrammer().add(pro);
            p.setnTugas(p.getnAnggota() + 1);
        }
        else{
            System.out.println("---Jumlah Anggota Melebihi Batas---");
        }
    }
    
    public void delAnggota(Proyek p, String nama, String tugas){
        for(Programmer pro : p.getArrayProgrammer()){
            if(pro.getNama().equals(nama)){
                p.getArrayProgrammer().remove(pro);
                return;
            }
        }
    }
    
    public void delTugas(Proyek p, String nmTgs){
        for(Tugas t : p.getArrayTugas()){
            String nama = t.getPelaksana().getNama(); 
            if(t.getNama().equals(nmTgs)){
                p.getArrayTugas().remove(t);
                delAnggota(p, nama, nmTgs);
                System.out.println("Tugas Telah Terhapus !");
                return;
            }                           
        }        
    }
    
    public void updateProgress(Programmer p, Tugas t,String progress){
        t.setProgress(progress);
    }
    
    public void updateProyek(ManajerProyek m, Proyek pyk, String status){
        pyk.setStatus(status);
    } 
    
    public String viewManager(){
        String tmp= "";
        tmp+="Daftar Manajer Proyek  :";
        for(ManajerProyek m : getListManajer()){

            tmp+="\n  Nama          : "+m.getNama();
            tmp+="\n  Tanggal Lahir : "+m.getTtl();
            tmp+="\n  Alamat        : "+m.getAlamat();
            tmp+="\n  Email         : "+m.getEmail();
            tmp+="\n  No. Telepon   : "+m.getNoHp();
            tmp+="\n========================";
        }
        return tmp;
    }
    
    public String detilProyek(){
        String tmp= "";
        tmp+="\n Daftar Manajer Proyek  :";
        //tmp+="\n Nama Proyek : "+nmP.getNama();
        //tmp+="\n Perusahaan  : "+nmP.getPerusahaan()+"\n";
        return tmp;
    }
}
