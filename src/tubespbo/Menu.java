/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Scanner;

/**
 *
 * @author biyan
 */
public class Menu {
    private Application app;
    private Proyek project;
    private Scanner s1 = new Scanner(System.in);
    private Scanner s2 = new Scanner(System.in);

    public Menu(Application app) {
        this.app = app;
    }
    
    public void MainMenu() {
        int pil;
        do {
            System.out.println("Menu");
            System.out.println("1. Insert Manajer Proyek");
            System.out.println("2. Insert Programmer");
            System.out.println("3. Lihat Manajer");
            System.out.println("4. Lihat Programmer");
            System.out.println("5. Menu Manajer Proyek");
            System.out.println("6. Menu Programmer");
            System.out.println("0. exit");
            System.out.print("masukkan pilihan : ");
            pil = s1.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    String nama = s2.nextLine();
                    System.out.print("Masukkan Tanggal Lahir : ");
                    String ttl = s2.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    String alamat = s2.nextLine();
                    System.out.print("Masukkan No. HP : ");
                    String noHp = s2.nextLine();
                    System.out.print("Masukkan Email : ");
                    String email = s2.nextLine();
                    //int i = Integer.parseInt(nama);
                    app.insertManajerProyek(nama, ttl, alamat, noHp, email);
                    break;
                case 2:
                    System.out.print("Masukkan Nama : ");
                    String nama2 = s2.nextLine();
                    System.out.print("Masukkan Tanggal Lahir : ");
                    String ttl2 = s2.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    String alamat2 = s2.nextLine();
                    System.out.print("Masukkan No. HP : ");
                    String noHp2 = s2.nextLine();
                    System.out.print("Masukkan Email : ");
                    String email2 = s2.nextLine();
                    app.insertProgrammer(nama2, ttl2, alamat2, noHp2, email2);
                    break;
                case 3:
                    System.out.println("Daftar Manajer Proyek  :");
                    for(ManajerProyek m : app.getListManajer()){
                        System.out.println("  Nama          : "+m.getNama());
                        System.out.println("  Tanggal Lahir : "+m.getTtl());
                        System.out.println("  Alamat        : "+m.getAlamat());
                        System.out.println("  Email         : "+m.getEmail());
                        System.out.println("  No. Telepon   : "+m.getNoHp());
                        System.out.println("========================");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Programmer     :");
                    for(Programmer p : app.getListProgrammer()){
                        System.out.println("  Nama          : "+p.getNama());
                        System.out.println("  Tanggal Lahir : "+p.getTtl());
                        System.out.println("  Alamat        : "+p.getAlamat());
                        System.out.println("  Email         : "+p.getEmail());
                        System.out.println("  No. Telepon   : "+p.getNoHp());
                        System.out.println("========================");
                    }                   
                    break;
                case 5:
                    MenuManajer();
                    break;
                case 6:
                    MenuProgrammer();
                    break;
                default:
                    System.out.println("pilihan salah");
            }
        } while (pil != 0);
    }
    
    public void MenuManajer(){
        try{
        System.out.print("Masukkan Nama Manajer : ");
        String nmManajer = s2.nextLine();
        if (app.cariManajerProyek(nmManajer).getNama().equals(nmManajer)){
        ManajerProyek manajer = app.cariManajerProyek(nmManajer);   //Biar dicari dulu bagaimana ???
        int pil;
        do {
            System.out.println("=====Menu Manajer Proyek=====");
            System.out.println("1. Buat Proyek");
            System.out.println("2. Update Proyek");
            System.out.println("3. Lihat Proyek");
            System.out.println("4. Cari Proyek");
            System.out.println("0. exit");
            System.out.print("masukkan pilihan : ");
            pil = s1.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama Proyek : ");
                    String p = s2.nextLine();
                    System.out.print("Masukkan Nama Perusahaan : ");
                    String kantor = s2.nextLine();
                    app.createProyek(manajer, p, kantor);
                    break;
                case 2:
                    System.out.print("Masukkan Proyek : ");
                    String proyek1 = s2.nextLine();
                    Proyek pyk = manajer.getProyek(proyek1);
                    System.out.print("Masukkan Status (Sudah Selesai/Belum Selesai) : ");
                    String status = s2.nextLine();
                    app.updateProyek(manajer, pyk, status);
                    break;
                case 3:
                    for(Proyek proyek : manajer.getArrayProyek()){
                        System.out.println("Proyek : "+proyek.getNama());
                        System.out.println("Client : "+proyek.getPerusahaan());
                        System.out.println("Status : "+proyek.getStatus());
                        System.out.println("============================");
                        System.out.println();
                    }
                    break;
                case 4:
                    try{
                    System.out.print("Masukkan Nama Proyek : ");
                    String pro = s2.nextLine();
                    Proyek nmP = manajer.getProyek(pro);
                    System.out.println("Nama Proyek : "+nmP.getNama());
                    System.out.println("Perusahaan  : "+nmP.getPerusahaan());
                    System.out.println();
                    MenuProyek(nmP);
                    }catch(NullPointerException e){
                        System.out.println("Nama proyek tidak ditemukan !!!");
                        System.out.println();
                     }
                    break;
                default:
                    System.out.println("pilihan salah");
            }
        } while (pil != 0);
        }
        }catch(NullPointerException e){
            System.out.println("Nama manajer tidak ditemukan !");
            System.out.println();
         }
    }
    
    public void MenuProgrammer(){
        System.out.print("Masukkan Nama Programmer : ");
        String p1 = s2.nextLine();
        Programmer prog = app.cariProgrammer(p1);
        int pil;
        do {
            System.out.println("=====Menu Programmer=====");
            System.out.println("1. Lihat Tugas");
            System.out.println("2. Update Tugas");
            System.out.println("0. Exit");                         
            System.out.print("masukkan pilihan : ");
            pil = s1.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama Manajer Proyek : ");
                    String m = s2.nextLine();
                    ManajerProyek m1 = app.cariManajerProyek(m);
                    try {
                    for(Proyek p : m1.getArrayProyek()){
                        System.out.println("Proyek : "+p.getNama());
                        System.out.println("Manajer : "+m1.getNama());
                        System.out.println("Nama Perusahhan : "+p.getPerusahaan());
                        System.out.println("Tugas : ");
                        for(Tugas t : p.getArrayTugas()){
                            if (t.getPelaksana() == prog){
                                System.out.println("- Nama Tugas :"+t.getNama());
                                System.out.println("  Deadline   : "+t.getDeadline());
                                System.out.println("  Progress   : "+t.getProgress());
                            }else{System.out.println("Tidak ada tugas");}                
                        }
                    System.out.println(" ");
                    }
                    } catch (NullPointerException e){
                        System.out.println("Nama Manajer Salah !");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan Nama Manajer Proyek : ");
                    String m2 = s2.nextLine();
                    ManajerProyek m3 = app.cariManajerProyek(m2);
                    System.out.print("Masukkan Proyek : ");
                    String pro = s2.nextLine();
                    Proyek pro1 = m3.getProyek(pro);
                    System.out.print("Masukkan Tugas : ");
                    String t = s2.nextLine();
                    Tugas t1 = pro1.getTugas(t);
                    System.out.print("Masukkan Progress Tugas : ");
                    String progress = s2.nextLine();
                    app.updateProgress(prog, t1, progress);
                    break;
                default:
                    System.out.println("pilihan salah");
            }
        } while (pil != 0);
    }
    
    public void MenuProyek(Proyek nmP){
        int pil;
        do{
        System.out.println("=====Menu Proyek=====");
        System.out.println("1. Tambah Tugas");
        System.out.println("2. Lihat Tugas");
        System.out.println("3. Hapus Tugas");
        System.out.println("4. Lihat Anggota");
        System.out.println("0. Exit");  
        System.out.print("Masukkan Pilihan : ");
        pil = s1.nextInt();
        switch (pil){
            case 1:
                System.out.print("Masukkan Nama Tugas : ");
                String tugas = s2.nextLine();
                System.out.print("Masukkan Deadline Tugas : ");
                String deadline = s2.nextLine();
                app.createTugas(nmP, tugas, deadline);
                System.out.print("Masukkan Programmer : ");
                String nmPro = s2.nextLine();
                Programmer pelaksana = app.cariProgrammer(nmPro);
                app.addAnggota(nmP, pelaksana);
                nmP.getTugas(tugas).setPelaksana(pelaksana);
                break;
            case 2:
                System.out.println("Daftar Tugas :");
                for(Tugas t : nmP.getArrayTugas()){
                    System.out.println("  -Tugas : "+t.getNama());
                    System.out.println("   Pekerja : "+t.getPelaksana().getNama());
                    System.out.println("   Perusahaan : "+t.getDeadline());
                    System.out.println("   Progress : "+t.getProgress());
                    System.out.println("============================");
                }
                System.out.println();
                break;
            case 3:
                System.out.print("Masukkan Tugas : ");
                String t = s2.nextLine();
                app.delTugas(nmP, t);
                break;
            case 4:
                for(Programmer anggota : nmP.getArrayProgrammer()){
                   System.out.println("Nama    : "+anggota.getNama());
                   System.out.println("No Telp : "+anggota.getNoHp());
                }
                System.out.println();
                break;
            case 5:
                System.out.print("Masukkan Nama Anggota : ");
                String pr = s2.nextLine();
                System.out.print("Masukkan Tugas Anggota : ");
                String nmTugas = s2.nextLine();
                app.delAnggota(nmP, pr, nmTugas);
                break;
                  
            default:
                System.out.println("pilihan salah");
        }
        }while (pil != 0);
    }
    
}
