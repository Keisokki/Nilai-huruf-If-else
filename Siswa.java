// Object Class
public class Siswa {
    private int id;
    private String nama;
    private double ipk;

    /*Constructor nama sama dgn nama Class
    */
    public Siswa(){
        id = 0;
        nama = "";
        ipk = 0.0;
    }
    //Constructor Parameter
    public Siswa(int id, String nama, Double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    /* Getter --> Mendapatkan nilai --> tipe data

    */
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public double getIpk() {
        return ipk;
    }
    /*  Setter --> Mengubah nilai --> Void

    */
    public void setId(int id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method yg tdk mnenghasilkan value
    public void print() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Data Siswa " + nama);
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
        System.out.println("----------------------------------------------------------------");
    }
    //Method yg mnenghasilkan value
    public String print2() {
        return "ID : " + id
        + "\nNama : " + nama
        + "\nIPK : " + ipk;
    }
}