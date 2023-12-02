public class Barang implements ProdukDiskon {
    private String namaBrg;
    private double harga;


    public Barang(String namaBrg, double harga) {
        this.namaBrg = namaBrg;
        this.harga = harga;
    }

    // Implementasi dari ProdukDiskon
    @Override
    public double hitungDiskon() {
        return 0; // Produk standar tidak memiliki diskon
    }


    @Override
    public String getJenisProduk() {
        return "Standard Product";
    }

    // Getters and setters
    public String getNama() {
        return namaBrg;
    }

    public void setNama(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
