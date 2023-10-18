public class App {
    public static void main(String[] args) throws Exception {
        Barang barang = new Barang("Indomie", 10000);
        Pelanggan user = new Pelanggan(true); 
        Transaksi beli = new Transaksi(user);
    }
}
