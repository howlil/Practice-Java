

public class Barang {
    public String nama;
    public String sku;
    public int jumlah;
    private Integer hargaBeli;
    private Integer hargaJual;
    private Double diskon;

    // Constructor tanpa argumen
    public Barang() {
        this.nama = "";
        this.sku = "";
        this.jumlah = 0;
        this.hargaBeli = 0;
        this.hargaJual = 0;
        this.diskon = 0.0;
    }

    // Constructor dengan sku dan nama
    public Barang(String sku, String nama) {
        this.sku = sku;
        this.nama = nama;
        this.jumlah = 0;
        this.hargaBeli = 0;
        this.hargaJual = 0;
        this.diskon = 0.0;
    }

    // Constructor dengan sku, nama, harga jual, dan harga beli
    public Barang(String sku, String nama, Integer hargaJual, Integer hargaBeli) {
        this.sku = sku;
        this.nama = nama;
        this.hargaJual = hargaJual;
        this.hargaBeli = hargaBeli;
        this.jumlah = 0;
        this.diskon = 0.0;
    }

    // Getter dan Setter untuk harga jual, harga beli, dan diskon
    public Integer getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(Integer hargaJual) {
        if (hargaJual >= 0 && hargaJual > this.hargaBeli) {
            this.hargaJual = hargaJual;
        }
    }

    public Integer getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(Integer hargaBeli) {
        if (hargaBeli >= 0) {
            this.hargaBeli = hargaBeli;
        }
    }

    public Double getDiskon() {
        return diskon;
    }

    public void setDiskon(Double diskon) {
        if (diskon >= 0) {
            this.diskon = diskon;
        }
    }

    // Method untuk menampilkan informasi barang
    public void tampilInfo() {
        System.out.println("Kode : " + sku);
        System.out.println("Nama : " + nama);
        System.out.println("Harga Jual : " + hargaJual);
        System.out.println("Harga Beli : " + hargaBeli);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Diskon : " + diskon);
    }
}
