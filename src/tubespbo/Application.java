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
    
    public ManajerProyek cariManajerProyek(String id){
        for(ManajerProyek m : listManajer){
            if(m.getId().equals(id)){
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
    
    public Programmer cariProgrammer (String id){
        for(Programmer p : listProgrammer){
            if(p.getId().equals(id)){
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
    
    public Tugas cariTugas(Proyek p, String tgs){
        for(Tugas t : p.getArrayTugas()){
            if(t.getNama().equals(tgs)){
                return t;
            }
        }
        return null;
    }
    
    public String detilTugas(Proyek p, String tgs){
        String tmp = "";
        for(Tugas t : p.getArrayTugas()){
            String nama = t.getPelaksana().getNama(); 
                tmp+="Tugas     : "+t.getNama();   
                tmp+="\nDeadline  : "+t.getDeadline();
                tmp+="\nProgress  : "+t.getProgress();
                tmp+="\nPelaksana : "+t.getPelaksana().getNama();                          
        }
        return tmp;
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
            tmp+="\n  ID            : "+m.getId();
            tmp+="\n  Nama          : "+m.getNama();
            tmp+="\n  Tanggal Lahir : "+m.getTtl();
            tmp+="\n  Alamat        : "+m.getAlamat();
            tmp+="\n  Email         : "+m.getEmail();
            tmp+="\n  No. Telepon   : "+m.getNoHp();
            tmp+="\n========================";
        }
        return tmp;
    }
    
    public String viewProgrammer(){
        String tmp= "";
        tmp+="Daftar Programmer  :";
        for(Programmer m : getListProgrammer()){
            tmp+="\n  ID            : "+m.getId();
            tmp+="\n  Nama          : "+m.getNama();
            tmp+="\n  Tanggal Lahir : "+m.getTtl();
            tmp+="\n  Alamat        : "+m.getAlamat();
            tmp+="\n  Email         : "+m.getEmail();
            tmp+="\n  No. Telepon   : "+m.getNoHp();
            tmp+="\n========================";
        }
        return tmp;
    }
    
    public String viewProyek(ManajerProyek manajer){
        String tmp= "";
        tmp+="Daftar Proyek  :";
        for(Proyek proyek : manajer.getArrayProyek()){
            tmp+="\n  Proyek : "+proyek.getNama();
            tmp+="\n  Client : "+proyek.getPerusahaan();
            tmp+="\n  Status : "+proyek.getStatus();
            tmp+="\n  ============================";
            tmp+="\n  ";
        }
        return tmp;
    }
    
    public String viewTugas(Proyek p){
        String tmp="";
        tmp+="Daftar Tugas :";
        for(Tugas t : p.getArrayTugas()){
            tmp+="\n  -Tugas : "+t.getNama();
            tmp+="\n   Pekerja : "+t.getPelaksana().getNama();
            tmp+="\n   Deadline : "+t.getDeadline();
            tmp+="\n   Progress : "+t.getProgress();
            tmp+="\n  ============================";
        }
        return tmp;
    }
    
    public String viewAnggota(Proyek nmP){
        String tmp = "";
        for(Programmer anggota : nmP.getArrayProgrammer()){
           tmp+="Nama    : "+anggota.getNama();
           tmp+="\nNo Telp : "+anggota.getNoHp();
           tmp+="\n  ============================\n";
        }     
        return tmp;
    }
    
    public String viewTugas2(Programmer prog){
        String tmp="";
        for(ManajerProyek m1 : getListManajer()){
                        for(Proyek p : m1.getArrayProyek()){  
                            for(Tugas t : p.getArrayTugas()){
                                if (t.getPelaksana() == prog){
                                    tmp+="- Nama Tugas :"+t.getNama();
                                    tmp+="\n  Deadline   : "+t.getDeadline();
                                    tmp+="\n  Progress   : "+t.getProgress();
                                    tmp+="\n  Proyek : "+p.getNama();
                                    tmp+="\n  Manajer : "+m1.getNama();
                                    tmp+="\n  Nama Perusahaan : "+p.getPerusahaan();
                                    tmp+="\n================================";
                                    tmp+="\n";
                                }             
                            }
                        }
                    }
        return tmp;
    }
}
