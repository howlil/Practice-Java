
import java.time.LocalDate;

public class Transaksi {
    private final String noRef;
    private final String tanggal;
    public Barang barang;
    public int jumlahBarang;
    public Pelanggan pelanggan;

    public Transaksi(){
        noRef = String.valueOf(System.currentTimeMillis());
        tanggal = LocalDate.now().toString();
    }

    public Transaksi(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
        noRef = String.valueOf(System.currentTimeMillis());
        tanggal = LocalDate.now().toString();
    }

    public String getNoRef() {
        return noRef;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public double hitungTotalBayar() {
        double hargaTotal = barang.getHarga() * jumlahBarang;
        if (pelanggan != null && pelanggan.isMember()) {
            double diskon = 0.0;
            if (hargaTotal > 10000000) {
                diskon = 0.05;
            } else if (hargaTotal > 1000000) {
                diskon = 0.03;
            } else if (hargaTotal > 500000) {
                diskon = 0.01;
            }
            return hargaTotal - (hargaTotal * diskon);
        }
        return hargaTotal;
    }

    @Override
    public String toString() {
        String output = "No. Ref : " + noRef + "\n";
        output += "Tanggal : " + tanggal + "\n";
        output += "Barang : " + barang.getNama() + "\n";
        output += "Total Transaksi : Rp. " + hitungTotalBayar() + ",-\n";
        return output;
    }
}
