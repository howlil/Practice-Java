package pratikum.java.database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Database {
    private Connection connection;

    public Database() {
        try {
            // Contoh koneksi ke database
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-crud-mart", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void addStruk(Struk struk) throws SQLException {
        String query = "INSERT INTO struk (nama_pembeli, nama_barang, total_harga, jumlah_beli) VALUES (?, ?, ?, ?);";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, struk.getNamaPembeli());
            pstmt.setString(2, struk.getNamaBarang());
            pstmt.setDouble(3, struk.getTotalHarga());
            pstmt.setInt(4, struk.getJumlahBeli());
            pstmt.executeUpdate();
        }
    }

    // Tambah Barang
    public void addBarang(Barang barang) throws SQLException {
        String query = "INSERT INTO barang (nama_barang, harga) VALUES (?, ?);";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, barang.getNama());
            pstmt.setDouble(2, barang.getHarga());
            pstmt.executeUpdate();
        }
    }
    

    // Dapatkan Semua Barang
    public List<Barang> getAllBarang() throws SQLException {
        List<Barang> barangList = new ArrayList<>();
        String query = "SELECT * FROM barang;";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Barang barang = new Barang(rs.getInt("id"), rs.getString("nama_barang"), rs.getDouble("harga"));
                barangList.add(barang);
            }
        }
        return barangList;
    }
    
    // Update Barang
    public void updateBarang(Barang barang) throws SQLException {
        String query = "UPDATE barang SET nama_barang = ?, harga = ? WHERE id = ?;";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, barang.getNama());
            pstmt.setDouble(2, barang.getHarga());
            pstmt.setInt(3, barang.getId());
            pstmt.executeUpdate();
        }
    }

    // Hapus Barang
    public void deleteBarang(int id) throws SQLException {
        String query = "DELETE FROM barang WHERE id = ?;";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    // Close connection
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
