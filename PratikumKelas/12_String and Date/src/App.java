import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan informasi supermarket dan waktu
        System.out.println("SUPERMARKET INDIGOS");
        Date date = new Date();
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss z");
        SimpleDateFormat sdfDate = new SimpleDateFormat("E, dd/MM/yyyy");
        
        System.out.println("Tanggal: " + sdfDate.format(date));
        System.out.println("Waktu: " + sdfTime.format(date));
        System.out.println("========================");

        // Mengumpulkan data pelanggan
        System.out.println("DATA PELANGGAN");
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("No. HP: ");
        String noHp = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.println("++++++++++++++++++++++++");

        // Mengumpulkan data pembelian
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.print("Kode Barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi newline

        // Membuat objek barang dan invoice
        Barang barang = new Barang(namaBarang, hargaBarang);
        Invoice invoice;
        try {
            invoice = new Invoice(namaBarang, hargaBarang, kodeBarang, namaPelanggan, jumlahBeli);
            System.out.println("TOTAL BAYAR: " + invoice.hitungTotalBayar());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("++++++++++++++++++++++++");
        System.out.print("Kasir: ");
        String namaKasir = scanner.nextLine();

        // Menampilkan informasi
        System.out.println("\n--- RINCIAN TRANSAKSI ---");
        System.out.println("Nama Pelanggan \t: " + namaPelanggan);
        System.out.println("Nomor HP \t: " + noHp);
        System.out.println("Alamat   \t: " + alamat);
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Harga Barang \t: " + hargaBarang);
        System.out.println("Jumlah Beli \t: " + jumlahBeli);
        System.out.println("Total Bayar \t: " + invoice.hitungTotalBayar());
        System.out.println("Kasir       \t: " + namaKasir);
    }
}

// Kelas lainnya (Barang, Diskon, Invoice, Penjualan, ProdukDiskon) tetap sama seperti yang Anda berikan.
