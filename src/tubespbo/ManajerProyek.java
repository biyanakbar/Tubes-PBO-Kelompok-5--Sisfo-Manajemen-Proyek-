package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Biyan Ilham Akbar (1301144319)
 */
public class ManajerProyek extends Orang{
    private ArrayList<Proyek> arrayProyek;
    private int nProyek;

    public ManajerProyek(String nama, String ttl, String alamat, String noHp, String email, String pass) {
        super(nama, ttl, alamat, noHp, email, pass);
        arrayProyek = new ArrayList<>();
        nProyek = 0;
    }  

    public Proyek getProyek(String nama){
        for(Proyek p : arrayProyek){
            if(p.getNama().equals(nama)){
                return p;
            }
        }
        return null;
    }

    public void setnProyek(int nProyek) {
        this.nProyek = nProyek;
    }
    
    public int getJumlahProyek(){
        return nProyek;
    }

    public ArrayList<Proyek> getArrayProyek() {
        return arrayProyek;
    }
    
    public void setArrayProyek(ArrayList<Proyek> arrayProyek){
        this.arrayProyek = arrayProyek;
    }
}