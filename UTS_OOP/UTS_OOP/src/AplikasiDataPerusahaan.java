/**
 *
 * @author Maria Intan Putri Lajar
 * NIM: 2301010638
 * TGL: 23 Mei 2025
 */

import java.util.Scanner;
public class AplikasiDataPerusahaan {
    static Scanner input = new Scanner(System.in);
    static Perusahaan[] daftar = new Perusahaan[100]; // array statis
    static int jumlahData = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU APLIKASI DATA PERUSAHAAN ===");
            System.out.println("1. Tambah Data Perusahaan");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: tambahData(); break;
                case 2: tampilData(); break;
                case 3: ubahData(); break;
                case 4: hapusData(); break;
                case 5: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.println("=== Tambah Data ===");
        System.out.print("Masukkan ID: ");
        int id = input.nextInt(); input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        daftar[jumlahData] = new Perusahaan(id, nama, alamat);
        jumlahData++;
        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilData() {
        System.out.println("=== Data Perusahaan ===");
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + daftar[i]);
            }
        }
    }

    static void ubahData() {
        tampilData();
        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int indeks = input.nextInt() - 1;
        if (indeks >= 0 && indeks < jumlahData) {
            input.nextLine(); // clear buffer
            System.out.print("ID baru: ");
            int id = input.nextInt(); input.nextLine();
            System.out.print("Nama baru: ");
            String nama = input.nextLine();
            System.out.print("Alamat baru: ");
            String alamat = input.nextLine();

            daftar[indeks].setPerusahaan(id, nama, alamat);
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    static void hapusData() {
        tampilData();
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int indeks = input.nextInt() - 1;

        if (indeks >= 0 && indeks < jumlahData) {
            for (int i = indeks; i < jumlahData - 1; i++) {
                daftar[i] = daftar[i + 1];
            }
            daftar[jumlahData - 1] = null;
            jumlahData--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
    
}
