/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubespbo.Application;
import tubespbo.ManajerProyek;
import tubespbo.Proyek;
import view.*;
import javax.swing.JOptionPane;
import tubespbo.Programmer;

/**
 *
 * @author biyan
 */
public class Controller implements ActionListener{
    private Application app;
    private View view;
    String namaManager;
    Proyek nmP;
    
    public Controller(Application app) {
        this.app = app;
        viewMenu m = new viewMenu();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (view instanceof viewMenu){
            viewMenu m = (viewMenu) view;
            if (source.equals(m.getBtnInsManPro())){
                /* 
                pindah view insertManajerProyek
                */
                insertManajerProyek gMan = new insertManajerProyek();
                gMan.setVisible(true);
                gMan.addListener(this);
                m.dispose();
                view = gMan;
            }else if(source.equals(m.getBtnInsProg())){
                /*
                pindah view insertProgrammer
                */
                insertProgrammer gProg = new insertProgrammer();
                gProg.setVisible(true);
                gProg.addListener(this);
                m.dispose();
                view = gProg;
            }else if(source.equals(m.getBtnLihatManPro())){
                /*
                pindah view lihatManajer
                */
                lihatManajer gLihatManajer = new lihatManajer();
                gLihatManajer.setVisible(true);
                gLihatManajer.addListener(this);
                m.dispose();
                view = gLihatManajer;
                gLihatManajer.setTxAreaManPro(app.viewManager());
            }else if(source.equals(m.getBtnLihatProg())){
                /*
                pindah view lihatProgrammer
                */
                lihatProgrammer gLihatProgrammer = new lihatProgrammer();
                gLihatProgrammer.setVisible(true);
                gLihatProgrammer.addListener(this);
                m.dispose();
                view = gLihatProgrammer; 
                gLihatProgrammer.setTxAreaProgrammer(app.viewProgrammer());
            }else if(source.equals(m.getBtnMenuManPro())){
                /*
                pindah view menuManajerProyek
                */
                menuManajerProyek gMenuManajer = new menuManajerProyek();
                gMenuManajer.setVisible(true);
                gMenuManajer.addListener(this);
                m.dispose();
                view = gMenuManajer;  
            }else if(source.equals(m.getBtnMenuProg())){
                /*
                pindah view menuProgrammer
                */
                menuProgrammer gMenuProgrammer = new menuProgrammer();
                gMenuProgrammer.setVisible(true);
                gMenuProgrammer.addListener(this);
                m.dispose();
                view = gMenuProgrammer;  
            }
        }
        
        else if (view instanceof insertManajerProyek){
            insertManajerProyek gMan = (insertManajerProyek) view;
            if(source.equals(gMan.getBtnBack())){
                /*
                pindah view viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gMan.dispose();
                view = m; 
            }else if(source.equals(gMan.getBtnSubmit())){
                /*
                input ManajerProyek
                */
                String nama = gMan.getTextNama();
                String alamat = gMan.getTextAlamat();
                String ttl = gMan.getTextTTL();
                String email = gMan.getTextEmail();
                String noTelp = gMan.getTextTelp();

                app.insertManajerProyek(nama, ttl, alamat, noTelp, email);
                gMan.reset();
                notifBerhasilManajerProyek gNotif = new notifBerhasilManajerProyek();
                gNotif.setVisible(true);
                gNotif.addListener(this);
                gMan.dispose();
                view = gNotif;
                
            }
        }
        
        else if (view instanceof insertProgrammer){
            insertProgrammer gProg = (insertProgrammer) view;
            if(source.equals(gProg.getBtnBack())){
                /*
                pindah view viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gProg.dispose();
                view = m; 
            }else if(source.equals(gProg.getBtnSubmit())){
                /*
                input ManajerProyek
                */
                String nama = gProg.getTextNama();
                String alamat = gProg.getTextAlamat();
                String ttl = gProg.getTextTTL();
                String email = gProg.getTextEmail();
                String noTelp = gProg.getTextTelp();
                app.insertProgrammer(nama, ttl, alamat, noTelp, email);
                gProg.reset();
                notifBerhasilProgrammer gNotif = new notifBerhasilProgrammer();
                gNotif.setVisible(true);
                gNotif.addListener(this);
                gProg.dispose();
                view = gNotif;
            }
        }
        
        else if (view instanceof lihatManajer){
            lihatManajer gLihatManajer = (lihatManajer) view;
            if(source.equals(gLihatManajer.getBtnOk())){
                /*
                pindah view viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gLihatManajer.dispose();
                view = m; 
            }
        }
        
        else if (view instanceof lihatProgrammer){
            lihatProgrammer gLihatProgrammer = (lihatProgrammer) view;
            if(source.equals(gLihatProgrammer.getBtnOk())){
                /*
                pindah view viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gLihatProgrammer.dispose();
                view = m; 
            }
        }
        
        else if(view instanceof menuManajerProyek){
            menuManajerProyek gMenuManajerProyek = (menuManajerProyek) view;
            
            if(source.equals(gMenuManajerProyek.getBtnBack())){
                /*
                pindah view viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gMenuManajerProyek.dispose();
                view = m;
            }else if (source.equals(gMenuManajerProyek.getBtnBuatProyek())){
                /*
                pindah view buatProyek
                */
                namaManager = gMenuManajerProyek.getTextManajerProyek();
                buatProyek gBuatProyek = new buatProyek();
                gBuatProyek.setVisible(true);
                gBuatProyek.addListener(this);
                gMenuManajerProyek.dispose();
                view = gBuatProyek;
            }else if(source.equals(gMenuManajerProyek.getBtnUpdateProyek())){
                /*
                pindah view updateProyek
                */
                namaManager = gMenuManajerProyek.getTextManajerProyek();
                updateProyek gUpdateProyek = new updateProyek();
                gUpdateProyek.setVisible(true);
                gUpdateProyek.addListener(this);
                gMenuManajerProyek.dispose();
                view = gUpdateProyek;
            }else if(source.equals(gMenuManajerProyek.getBtnLihatProyek())){
                /*
                pindah view lihatProyek
                */
                lihatProyek gLihatProyek = new lihatProyek();
                
                namaManager = gMenuManajerProyek.getTextManajerProyek();
                ManajerProyek manajer = app.cariManajerProyek(namaManager);
                
                gLihatProyek.setTxAreaProyek(app.viewProyek(manajer));
                
                gLihatProyek.setVisible(true);
                gLihatProyek.addListener(this);
                gMenuManajerProyek.dispose();
                view = gLihatProyek;
            }else if(source.equals(gMenuManajerProyek.getBtnCariProyek())){
                /*
                pindah view cariProyek
                */
                cariProyek gCariProyek = new cariProyek();
                gCariProyek.setVisible(true);
                gCariProyek.addListener(this);
                gMenuManajerProyek.dispose();
                view = gCariProyek;
            }else if (source.equals(gMenuManajerProyek.getBtnCek())){
                /*
                mengecek Data Manajer
                */
                String nmManajer = gMenuManajerProyek.getTextManajerProyek();
                if(app.cariManajerProyek(nmManajer) == null){                        
                    gMenuManajerProyek.setTxNotif("Manajer Tidak Ada !");
                    gMenuManajerProyek.setDisableBtn();  
                }else {
                    gMenuManajerProyek.setTxNotif("Manajer Ada !");
                    gMenuManajerProyek.setDisableTextManajerProyek();
                    gMenuManajerProyek.setEnableBtn();
                }
            }
        }
        
        else if(view instanceof menuProgrammer){
            menuProgrammer gMenuProgrammer = (menuProgrammer) view;
            if(source.equals(gMenuProgrammer.getBtnLihatTugas())){
                /*
                pindah view lihatTugas
                */
                lihatTugas gLihatTugas = new lihatTugas();
                gLihatTugas.setVisible(true);
                gLihatTugas.addListener(this);
                gMenuProgrammer.dispose();
                view = gLihatTugas;
            }else if(source.equals(gMenuProgrammer.getBtnUpdateTugas())){
                /*
                pindah view updateTugas
                */
                updateTugas gUpdateTugas = new updateTugas();
                gUpdateTugas.setVisible(true);
                gUpdateTugas.addListener(this);
                gMenuProgrammer.dispose();
                view = gUpdateTugas;         
            }else if(source.equals(gMenuProgrammer.getBtnBack())){
                /*
                pindah view viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gMenuProgrammer.dispose();
                view = m;
            }else if(source.equals(gMenuProgrammer.getBtnCek())){
                /*
                mengecek programmer
                */
                String nmProgrammer = gMenuProgrammer.getTextManajer();
                if(app.cariProgrammer(nmProgrammer) == null){                        
                    gMenuProgrammer.setTxNotif("Programmer Tidak Ada !");
                    gMenuProgrammer.setDisableBtn();  
                }else {
                    gMenuProgrammer.setTxNotif("Programmer Ada !");
                    gMenuProgrammer.setDisableTextProgrammer();
                    gMenuProgrammer.setEnableBtn();
                }
                
            }
        }
        
        else if (view instanceof buatProyek){
            buatProyek gBuatProyek = (buatProyek) view;
            if(source.equals(gBuatProyek.getBtnCancel())){
                /*
                pindah view menuManajerProyek
                */
                menuManajerProyek gMenuManajerProyek = new menuManajerProyek();
                gMenuManajerProyek.setVisible(true);
                gMenuManajerProyek.addListener(this);
                gBuatProyek.dispose();
                view = gMenuManajerProyek;
            }else if(source.equals(gBuatProyek.getBtnCreate())){
                /*
                membuat Proyek
                */
                //menuManajerProyek gMenuManajerProyek = new menuManajerProyek();
                app.cariManajerProyek(namaManager);
                ManajerProyek manajer = app.cariManajerProyek(namaManager);
                notifBuatProyek gNotif = new notifBuatProyek();
                
                String proyek = gBuatProyek.getTextProyek();
                String perusahaan = gBuatProyek.getTextPerusahaan();
                try{
                app.createProyek(manajer, proyek, perusahaan);
                gNotif.setVisible(true);
                gNotif.addListener(this);
                gBuatProyek.dispose();
                view = gNotif;
                }catch(NullPointerException e){
                    System.out.println("Manajer Proyek Belum Ada !");
                }
            }
        }
        
        else if (view instanceof updateProyek){
            updateProyek gUpdateProyek = (updateProyek) view;
            if(source.equals(gUpdateProyek.getBtnCancel())){
                /*
                pindah view menuManajerProyek
                */
                menuManajerProyek gMenuManajerProyek = new menuManajerProyek();
                gMenuManajerProyek.setVisible(true);
                gMenuManajerProyek.addListener(this);
                gUpdateProyek.dispose();
                view = gMenuManajerProyek;
            }if(source.equals(gUpdateProyek.getBtnUpdate())){
                /*
                mengupdate proyek
                */
                app.cariManajerProyek(namaManager);
                ManajerProyek manajer = app.cariManajerProyek(namaManager);
                
                String pyk = gUpdateProyek.getTxProyek();
                Proyek proyek = manajer.getProyek(pyk);
                
                String status = gUpdateProyek.getCmbBoxStatus();
                
                try{
                    app.updateProyek(manajer, proyek, status);
                    notifUpdateProyek gNotif = new notifUpdateProyek();
                    gNotif.setVisible(true);
                    gNotif.addListener(this);
                    gUpdateProyek.dispose();
                    view = gNotif;              
                }catch(NullPointerException e){
                    gUpdateProyek.setTxProyekUpdate("Proyek Tidak Ada !");
                }
                
            }
            
        }
        
        else if (view instanceof lihatProyek){
            lihatProyek gLihatProyek = (lihatProyek) view;
            if(source.equals(gLihatProyek.getBtnOk())){
                /*
                pindah view menuManajerProyek
                */
                menuManajerProyek gMenuManajerProyek = new menuManajerProyek();
                gMenuManajerProyek.setVisible(true);
                gMenuManajerProyek.addListener(this);
                gLihatProyek.dispose();
                view = gMenuManajerProyek;
            }
        }
        
        else if (view instanceof cariProyek){
            cariProyek gCariProyek = (cariProyek) view;
            if(source.equals(gCariProyek.getBtnBack())){
                /*
                pindah view menuManajerProyek
                */
                menuManajerProyek gMenuManajerProyek = new menuManajerProyek();
                gMenuManajerProyek.setVisible(true);
                gMenuManajerProyek.addListener(this);
                gCariProyek.dispose();
                view = gMenuManajerProyek;
            }else if(source.equals(gCariProyek.getBtnCari())){
                /*
                Mencari Proyek
                */               
                String nmProyek = gCariProyek.getTextProyek();
                ManajerProyek manajer = app.cariManajerProyek(namaManager);
                nmP = manajer.getProyek(nmProyek);
                if(nmP == null){
                    gCariProyek.setTxNotif("Proyek Tidak ditemukan !");
                }else{
                    gCariProyek.setTxNotif("Proyek Ada !");
                    gCariProyek.setDisableTxProyek();
                    gCariProyek.setEnableNext();
                }
            }else if(source.equals(gCariProyek.getBtnNext())){
                /*
                pindah view menuProyek
                */
                menuProyek gMenuProyek = new menuProyek();
                gMenuProyek.setVisible(true);
                gMenuProyek.addListener(this);
                gCariProyek.dispose();
                view = gMenuProyek;
            }
                    
        }
                
        else if (view instanceof updateTugas){
            updateTugas gUpdateTugas = (updateTugas) view;
            if(source.equals(gUpdateTugas.getBtnCancel())){
                /*
                pindah view menuProgrammer
                */
                menuProgrammer gMenuProgrammer = new menuProgrammer();
                gMenuProgrammer.setVisible(true);
                gMenuProgrammer.addListener(this);
                gUpdateTugas.dispose();
                view = gMenuProgrammer;
            }
        }
        
        else if(view instanceof menuProyek){
            menuProyek gMenuProyek = (menuProyek) view;
            if(source.equals(gMenuProyek.getBtnTambahTugas())){
                /*
                pindah view tambahTugas
                */
                tambahTugas gTambahTugas = new tambahTugas();
                gTambahTugas.setVisible(true);
                gTambahTugas.addListener(this);
                gMenuProyek.dispose();
                view = gTambahTugas;
            }else if(source.equals(gMenuProyek.getBtnLihatTugas())){
                /*
                pindah view lihatTugas
                */
                lihatTugas gLihatTugas = new lihatTugas();
                gLihatTugas.setVisible(true);
                gLihatTugas.addListener(this);
                
                gLihatTugas.setTxAreaTugas(app.viewTugas(nmP));
                
                gMenuProyek.dispose();
                view = gLihatTugas;
            }else if(source.equals(gMenuProyek.getBtnHapusTugas())){
                /*
                pindah view hapusTugas
                */
                hapusTugas gHapusTugas = new hapusTugas();
                gHapusTugas.setVisible(true);
                gHapusTugas.addListener(this);
                gMenuProyek.dispose();
                view = gHapusTugas;
            }
        }
        
        else if(view instanceof tambahTugas){
            tambahTugas gTambahTugas = (tambahTugas) view;
            if(source.equals(gTambahTugas.getBtnBack())){
                /*
                pindah view menuProyek
                */
                menuProyek gMenuProyek = new menuProyek();
                gMenuProyek.setVisible(true);
                gMenuProyek.addListener(this);
                gTambahTugas.dispose();
                view = gMenuProyek;
            }else if(source.equals(gTambahTugas.getBtnAdd())){
                /*
                menambah tugas pada proyek
                */
                notifTambahTugas gNotif = new notifTambahTugas();
                
                String tugas = gTambahTugas.getTxTugas();
                String deadline = gTambahTugas.getTxDeadline();
                                
                app.createTugas(nmP, tugas, deadline);
                
                String programmer = gTambahTugas.getTxPelaksana();
                
                Programmer pelaksana = app.cariProgrammer(programmer);
                app.addAnggota(nmP, pelaksana);
                nmP.getTugas(tugas).setPelaksana(pelaksana);
                
                gNotif.setVisible(true);
                gNotif.addListener(this);
                gTambahTugas.dispose();
                view = gNotif;
            }else if(source.equals(gTambahTugas.getBtnCek())){
                /*
                mengecek programmer
                */
                String p = gTambahTugas.getTxPelaksana();
                Programmer programmer = app.cariProgrammer(p);
                
                if(programmer == null){
                    gTambahTugas.setTxNotif("Programmer Tidak ditemukan !");
                    gTambahTugas.setDisableAdd();
                }else{
                    gTambahTugas.setTxNotif("Programmer Ada !");
                    gTambahTugas.setDisableTxPelaksana();
                    gTambahTugas.setEnableAdd();
                }                             
            }
            
        }
        
        else if(view instanceof lihatTugas){
            lihatTugas gLihatTugas = (lihatTugas) view;
            if(source.equals(gLihatTugas.getBtnOk())){
                /*
                pindah view menuProyek
                */
                menuProyek gMenuProyek = new menuProyek();
                gMenuProyek.setVisible(true);
                gMenuProyek.addListener(this);
                gLihatTugas.dispose();
                view = gMenuProyek;
            }
        }
        
        else if(view instanceof hapusTugas){
            hapusTugas gHapusTugas = (hapusTugas) view;
            if(source.equals(gHapusTugas.getBtnHapus())){
                /*
                menghapus tugas
                */
                String tugas = gHapusTugas.getTxTugas();
                app.delTugas(nmP, tugas);
                gHapusTugas.setTxNotif("Data Telah Terhapus !");
                System.out.println("Data tugas Terhapus....");
            }else if(source.equals(gHapusTugas.getBtnBack())){
                /*
                pindah view menuProyek
                */
                menuProyek gMenuProyek = new menuProyek();
                gMenuProyek.setVisible(true);
                gMenuProyek.addListener(this);
                gHapusTugas.dispose();
                view = gMenuProyek;
            }
        }
        
        
        
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv FRAME UNTUK SEMUA NOTIFIKASI vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        else if(view instanceof notifBuatProyek){
            notifBuatProyek gNotif = (notifBuatProyek) view;
            if(source.equals(gNotif.getBtnOk())){
                menuManajerProyek m = new menuManajerProyek();
                m.setVisible(true);
                m.addListener(this);
                gNotif.dispose();
                view = m; 
            }
        }
        else if(view instanceof notifBerhasilManajerProyek){
            notifBerhasilManajerProyek gNotif = (notifBerhasilManajerProyek) view;
            if(source.equals(gNotif.getBtnOk())){
                /*
                pindah view menuManajerProyek
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gNotif.dispose();
                view = m; 
            }  
        }
        else if(view instanceof notifBerhasilProgrammer){
            notifBerhasilProgrammer gNotif = (notifBerhasilProgrammer) view;
            if(source.equals(gNotif.getBtnOk())){
                /*
                kembali ke viewMenu
                */
                viewMenu m = new viewMenu();
                m.setVisible(true);
                m.addListener(this);
                gNotif.dispose();
                view = m; 
            }
        }
        else if(view instanceof notifUpdateProyek){
            notifUpdateProyek gNotif = (notifUpdateProyek) view;
            if(source.equals(gNotif.getBtnOk())){
                /*
                pindah view menuManajerProyek
                */
                menuManajerProyek m = new menuManajerProyek();
                m.setVisible(true);
                m.addListener(this);
                gNotif.dispose();
                view = m; 
            }
        }
        else if(view instanceof notifTambahTugas){
            notifTambahTugas gNotif = (notifTambahTugas) view;
            if(source.equals(gNotif.getBtnOk())){
                /*
                pindah view menuProyek
                */
                menuProyek m = new menuProyek();
                m.setVisible(true);
                m.addListener(this);
                gNotif.dispose();
                view = m; 
            }
        }
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

            
    }
}