public class Barang{
    private String nama;
    public double hargaJual;
    public Barang (){
        
    }
    public Barang(String nama, double harga) {
        this.nama = nama;
        this.hargaJual = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return hargaJual;
    }
}
