package pratikum.java.database;

public class Struk {
    private int strukID;
    private String namaPembeli;
    private int barangID;
    private double totalHarga;
    private int jumlahBeli;

    public Struk(String namaPembeli, int barangID, double totalHarga, int jumlahBeli) {
        this.namaPembeli = namaPembeli;
        this.barangID = barangID;
        this.totalHarga = totalHarga;
        this.jumlahBeli = jumlahBeli;
    }

    // Getters
    public int getStrukID() {
        return strukID;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public int getBarangID() {
        return barangID;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    // Setters
    public void setStrukID(int strukID) {
        this.strukID = strukID;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setBarangID(int barangID) {
        this.barangID = barangID;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
}