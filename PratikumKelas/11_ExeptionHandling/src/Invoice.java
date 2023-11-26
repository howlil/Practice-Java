public class Invoice extends Barang implements Penjualan {
    private String noFaktur;
    private String namaPelanggan;
    private int jumlah;

    public Invoice(String namaBrg, double harga, String noFaktur, String namaPelanggan, int jumlah) {
        super(namaBrg, harga);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        if (jumlah <= 0 || jumlah > 1000) {
            throw new IllegalArgumentException("Invalid quantity: " + jumlah);
        }
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
