/**
 *
 * @author Maria Intan Putri Lajar
 * NIM: 2301010638
 * TGL: 23 Mei 2025
 */
public class Perusahaan {
    private int id;
    private String nama;
    private String alamat;

    // Constructor default
    public Perusahaan() {
        this.id = 0;
        this.nama = "Tanpa Nama";
        this.alamat = "Tanpa Alamat";
    }

    // Constructor overloading
    public Perusahaan(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Setter untuk mengubah data
    public void setPerusahaan(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter untuk ID
    public int getId() {
        return id;
    }

    // Method overriding
    @Override
    public String toString() {
        return "ID: " + id + " | Nama: " + nama + " | Alamat: " + alamat;
    }
    
}
