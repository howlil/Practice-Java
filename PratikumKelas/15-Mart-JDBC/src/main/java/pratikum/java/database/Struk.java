package pratikum.java.database;

public class Struk {
    private int strukID;
    private String namaPembeli;
    private String namaBarang;
    private double totalHarga;
    private int jumlahBeli;

    public Struk(String namaPembeli, String namaBarang, double totalHarga, int jumlahBeli) {
        this.namaPembeli = namaPembeli;
        this.namaBarang = namaBarang;
        this.totalHarga = totalHarga;
        this.jumlahBeli = jumlahBeli;
    }

    // Getters and Setters
    public int getStrukID() {
        return strukID;
    }

    public void setStrukID(int strukID) {
        this.strukID = strukID;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
}
