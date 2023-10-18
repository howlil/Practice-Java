public class App {

    public static void main(String[] args) {
       Pelanggan pelanggan1 = new Pelanggan();
       Transaksi transaksi1 = new Transaksi(pelanggan1);
       pelanggan1.nama = "aul";
       pelanggan1.email="aha@gmail.com";
       pelanggan1.member = true;
       transaksi1.jumlahBarang = 9;
       transaksi1.hargaBarang = 60000000;
       int totalBayar = transaksi1.hitungTotalBayar();
       System.out.println("Total yang harus dibayar: Rp" + totalBayar);
    }
 }