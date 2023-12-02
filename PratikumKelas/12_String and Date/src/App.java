import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Date date = new Date();
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss z");
        SimpleDateFormat sdfDate = new SimpleDateFormat("E, dd/MM/yyyy");
    
        try{

        System.out.print("Nama Pelanggan\t: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("No. HP\t: ");
        String noHp = scanner.nextLine();
        System.out.print("Alamat\t: ");
        String alamat = scanner.nextLine();

        System.out.print("Kode Barang\t: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang\t: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang\t: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Jumlah Beli\t: ");
        int jumlahBeli = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi newline
        System.out.print("Kasir\t: ");
        String namaKasir = scanner.nextLine();
        


        // Membuat objek barang dan invoice
        Barang barang = new Barang(namaBarang, hargaBarang);
        Invoice invoice;
        try {
            invoice = new Invoice(noHp, alamat, namaBarang, hargaBarang, kodeBarang, namaPelanggan, jumlahBeli);
            System.out.println("TOTAL BAYAR \t: " + invoice.hitungTotalBayar());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

     
      
        // Menampilkan informasi
        System.out.println("\n\nSUPERMARKET INDIGOS");
         System.out.println("Tanggal: " + sdfDate.format(date));
        System.out.println("Waktu: " + sdfTime.format(date));
        System.out.println("========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("-------------------");
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("Nomor HP  \t: " + noHp);
        System.out.println("Alamat  \t: " + alamat);
        System.out.println("+++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("---------------------");
        System.out.println("Nama Barang  \t: " + namaBarang);
        System.out.println("Harga Barang  \t: " + hargaBarang);
        System.out.println("Jumlah Beli  \t: " + jumlahBeli);
        System.out.println("Total Bayar  \t: " + invoice.hitungTotalBayar());
        System.out.println("+++++++++++++++++++++");
        System.out.println("Kasir        \t: " + namaKasir);

         } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                }
    }
}

// Kelas lainnya (Barang, Diskon, Invoice, Penjualan, ProdukDiskon) tetap seperti yang Anda berikan.
