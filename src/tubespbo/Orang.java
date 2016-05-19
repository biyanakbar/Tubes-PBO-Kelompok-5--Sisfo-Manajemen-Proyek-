package tubespbo;

public abstract class Orang {
    private static int count;
    private String id;
    private String nama;
    private String ttl;
    private String alamat;
    private String noHp;
    private String email;
    private String pass;

    public Orang(String nama, String ttl, String alamat, String noHp, String email, String pass) {
        id = "EMP" + (++count);
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat+"we";
        this.noHp = noHp;
        this.email = email;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPass(){
        return pass;
    }
}
