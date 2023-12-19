public class Barang{
    private String namaBrg;
    private double harga;


    public Barang(String namaBrg, double harga) {
        this.namaBrg = namaBrg;
        this.harga = harga;
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
