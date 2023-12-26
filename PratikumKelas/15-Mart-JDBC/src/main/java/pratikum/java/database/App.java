package pratikum.java.database;


import java.util.Scanner;
import java.lang.invoke.VarHandle.AccessMode;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class App 
{

    private static Scanner scanner = new Scanner(System.in);
    private static final Database dbHelper = new Database();
    
    public static void main( String[] args )
    {
        Admin admin = new Admin("admin", "admin");
        LoginSistem system = new LoginSistem(admin);
        Date date = new Date();
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss z");
        SimpleDateFormat sdfDate = new SimpleDateFormat("E, dd/MM/yyyy");

      

        if (!system.login()) {
            System.out.println("Login Gagal.");
            return;
        }

        int option;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Semua Barang");
            System.out.println("3. Ubah Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Transaksi");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1: addBarang(); break;
                case 2: showAllBarang(); break;
                case 3: updateBarang(); break;
                case 4: deleteBarang(); break;
                case 5: transaksi(); break;
                case 6: System.out.println("Keluar."); break;
                default: System.out.println("Opsi Tidak");
            }
        } while (option != 6);

        try {
            dbHelper.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printStruk(Struk struk) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("E, dd/MM/yyyy HH:mm:ss z");
        Date date = new Date();
        System.out.println("\nSTRUK TRANSAKSI");
        System.out.println("Tanggal: " + sdfDate.format(date));
        System.out.println("Nama Pembeli: " + struk.getNamaPembeli());
        System.out.println("Nama Barang: " + struk.getNamaBarang());
        System.out.println("Harga Satuan: " + struk.getTotalHarga() / struk.getJumlahBeli());
        System.out.println("Jumlah Beli: " + struk.getJumlahBeli());
        System.out.println("Total Harga: " + struk.getTotalHarga());
        System.out.println("Terima Kasih!");
    }

    private static void transaksi() {
        System.out.print("Nama Pembeli: ");
        String namaPembeli = scanner.nextLine();
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Satuan: ");
        double harga = scanner.nextDouble();
        System.out.print("Jumlah Beli: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        double totalHarga = harga * jumlah;
        Struk struk = new Struk(namaPembeli, namaBarang, totalHarga, jumlah);

        try {
            dbHelper.addStruk(struk);
            printStruk(struk);
        } catch (SQLException e) {
            System.out.println("Gagal melakukan transaksi: " + e.getMessage());
        }
    }

   private static void addBarang() {
    System.out.println("Masukkan detail barang:");
    System.out.print("Nama Barang: ");
    String nama = scanner.nextLine();
    System.out.print("Harga Barang: ");
    while (!scanner.hasNextDouble()) {
        System.out.println("Input harus berupa angka. Masukkan harga barang:");
        scanner.next(); // consume the invalid input
    }
    double harga = scanner.nextDouble();
    scanner.nextLine(); // Consume newline

    Barang barang = new Barang(0, nama, harga);
    try {
        dbHelper.addBarang(barang);
        System.out.println("Barang berhasil ditambahkan.");
    } catch (SQLException e) {
        System.out.println("Gagal menambahkan barang: " + e.getMessage());
    }
}


private static void showAllBarang() {
    try {
        List<Barang> barangList = dbHelper.getAllBarang();
        if (barangList.isEmpty()) {
            System.out.println("Tidak ada barang.");
            return;
        }
        System.out.println("Daftar Barang:");
        for (Barang barang : barangList) {
            System.out.println("ID: " + barang.getId() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil data barang: " + e.getMessage());
    }
}

    private static void updateBarang() {
        System.out.print("Masukkan ID barang yang akan diperbarui: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    System.out.print("Nama Barang baru: ");
    String nama = scanner.nextLine();
    System.out.print("Harga Barang baru: ");
    double harga = scanner.nextDouble();
    scanner.nextLine(); // Consume newline

    Barang barang = new Barang(id, nama, harga);
    try {
        dbHelper.updateBarang(barang);
        System.out.println("Barang berhasil diperbarui.");
    } catch (SQLException e) {
        System.out.println("Gagal memperbarui barang: " + e.getMessage());
    }
    }

    private static void deleteBarang() {
        System.out.print("Masukkan ID barang yang akan dihapus: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    try {
        dbHelper.deleteBarang(id);
        System.out.println("Barang berhasil dihapus.");
    } catch (SQLException e) {
        System.out.println("Gagal menghapus barang: " + e.getMessage());
    }
    }
}
 

