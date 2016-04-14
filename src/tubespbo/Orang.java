package tubespbo;

public abstract class Orang {
    private static int id = 0;
    private String nama;
    private String ttl;
    private String alamat;
    private String noHp;
    private String email;

    public Orang(String nama, String ttl, String alamat, String noHp, String email) {
        setId(++id);
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
    }

    public static void setId(int id) {
        Orang.id = id;
    }

    public int getId() {
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
}
