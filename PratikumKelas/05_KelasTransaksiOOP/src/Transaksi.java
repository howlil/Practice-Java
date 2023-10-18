public class Transaksi {
   public int jumlahBarang;
   public int hargaBarang;
   Pelanggan pelanggan;

   public Transaksi(Pelanggan pelanggan) {
      this.pelanggan = pelanggan;
   }

   public int hitungTotalBayar() {
    int totalBelanja = jumlahBarang * hargaBarang;
      double diskon =0;
      if (this.pelanggan.member == true) {
        if (totalBelanja >= 50000 && totalBelanja < 100000) {
            diskon = 0.01;
        } else if (totalBelanja >= 100000 && totalBelanja <= 1000000) {
            diskon = 0.03;
        } else if (totalBelanja > 1000000) {
            diskon = 0.05;
        }
    }
    int totalBayar = (int) (totalBelanja * (1 - diskon));
    return totalBayar;
   }
}