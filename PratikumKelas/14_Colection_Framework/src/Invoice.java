public class Invoice extends Barang implements Penjualan {
    private String noFaktur;
    private String namaPelanggan;
    private int jumlah;
    private String noHP;
    private String alamat;

    public Invoice(String noHP,String alamat, String namaBrg, double harga, String noFaktur, String namaPelanggan, int jumlah) {
        super(namaBrg, harga);
        this.noHP = noHP;
        this.alamat = alamat;
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotalBayar() {
        return getHarga() * jumlah;
    }

    // Getters
    public String getNoFaktur() {
        return noFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getJumlah() {
        return jumlah;
    }
}
