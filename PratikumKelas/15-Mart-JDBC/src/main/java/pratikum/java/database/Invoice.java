package pratikum.java.database;

public class Invoice extends Barang{
    private String noFaktur;
    private String namaPelanggan;
    private int jumlah;


    public Invoice(String namaBrg, double harga, String noFaktur, String namaPelanggan, int jumlah) {
        super(namaBrg, harga);

        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.jumlah = jumlah;
    }

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