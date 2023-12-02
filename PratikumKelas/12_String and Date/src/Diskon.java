public class Diskon extends Barang {
    private double nilai; // Diskon dalam persentase

    public Diskon(String namaBrg, double harga, double nilai) {
        super(namaBrg, harga);
        this.nilai = nilai;
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * (nilai / 100);
    }

    @Override
    public String getJenisProduk() {
        return "Discounted Product";
    }
}
