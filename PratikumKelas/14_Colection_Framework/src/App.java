import java.util.LinkedList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    private static LinkedList<Barang> daftarBarang = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User("admin", "admin123");
        Loginsistem system = new Loginsistem(user);
        Date date = new Date();
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss z");
        SimpleDateFormat sdfDate = new SimpleDateFormat("E, dd/MM/yyyy");

        if (system.login()) {
            int choice;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Hapus Data Barang Pertama");
                System.out.println("3. Hapus Data Barang Terakhir");
                System.out.println("4. Tambah Barang pada Urutan Tertentu");
                System.out.println("5. Transaksi");
                System.out.println("6. Tampilkan Barang");
                System.out.println("7. Logout");
                System.out.print("Pilih menu (1-7): ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Masukkan nama barang: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan harga barang: ");
                        double harga = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline

                        daftarBarang.add(new Barang(nama, harga));
                        System.out.println("Barang berhasil ditambahkan.");
                        break;
                    case 2:
                        if (!daftarBarang.isEmpty()) {
                            daftarBarang.removeFirst();
                            System.out.println("Data barang pertama berhasil dihapus.");
                        } else {
                            System.out.println("Daftar barang kosong.");
                        }
                        break;
                    case 3:
                        if (!daftarBarang.isEmpty()) {
                            daftarBarang.removeLast();
                            System.out.println("Data barang terakhir berhasil dihapus.");
                        } else {
                            System.out.println("Daftar barang kosong.");
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan nama barang: ");
                        String namaBaru = scanner.nextLine();
                        System.out.print("Masukkan harga barang: ");
                        double hargaBaru = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Masukkan urutan penambahan (0 untuk awal): ");
                        int urutan = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (urutan >= 0 && urutan <= daftarBarang.size()) {
                            daftarBarang.add(urutan, new Barang(namaBaru, hargaBaru));
                            System.out.println("Barang berhasil ditambahkan pada urutan " + urutan + ".");
                        } else {
                            System.out.println("Urutan tidak valid.");
                        }
                        break;
                    case 5:
                    System.out.print("Nama Pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("No. HP: ");
                    String noHp = scanner.nextLine();
                    System.out.print("Nama Barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Jumlah Beli: ");
                    int jumlahBeli = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
            
                    boolean found = false;
                    for (Barang barang : daftarBarang) {
                        if (barang.getNama().equalsIgnoreCase(namaBarang)) {
                            double totalBayar = barang.getHarga() * jumlahBeli;
            
                            System.out.println("\n\nSUPERMARKET INDIGOS");
                            System.out.println("Tanggal: " + sdfDate.format(date));
                            System.out.println("Waktu: " + sdfTime.format(date));
                            System.out.println("========================");
                            System.out.println("DATA PELANGGAN");
                            System.out.println("-------------------");
                            System.out.println("Nama Pelanggan\t: " + namaPelanggan);
                            System.out.println("Nomor HP  \t: " + noHp);
                            System.out.println("+++++++++++++++++++");
                            System.out.println("DATA PEMBELIAN BARANG");
                            System.out.println("---------------------");
                            System.out.println("Nama Barang  \t: " + barang.getNama());
                            System.out.println("Harga Barang  \t: " + barang.getHarga());
                            System.out.println("Jumlah Beli  \t: " + jumlahBeli);
                            System.out.println("Total Bayar  \t: " + totalBayar);
                            System.out.println("+++++++++++++++++++++");
            
                            found = true;
                            break;
                        }
                    }
            
                    if (!found) {
                        System.out.println("Barang tidak ditemukan.");
                    }
                        break;
                    case 6:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Daftar barang kosong.");
                        return;
                    }
            
                    System.out.println("Daftar Barang:");
                    for (Barang barang : daftarBarang) {
                        System.out.println(barang);
                    }
                        break;

                    case 7:
                        System.out.println("Logout berhasil. Transaksi selesai.");
                        choice = 0; // Set choice to 0 to exit the loop
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                        break;
                }
            } while (choice != 0);
        } else {
            System.out.println("Login gagal.");
        }

        scanner.close();
    }
}
