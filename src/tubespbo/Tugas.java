package tubespbo;

public class Tugas {
    private Programmer pelaksana;
    private String deadline;
    private String nama;
    private String progress;

    public Tugas(String nama, String deadline) {
        this.nama = nama;
        this.deadline = deadline;
    }

    public void setPelaksana(Programmer pelaksana) {
        this.pelaksana = pelaksana;
    }

    public Programmer getPelaksana() {
        return pelaksana;
    }

    public String getDeadline() {
        return deadline;
    } 

    public String getNama() {
        return nama;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    
}