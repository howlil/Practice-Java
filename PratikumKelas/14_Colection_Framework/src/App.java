import java.util.LinkedList;
import java.util.Scanner;

public class App {
    private static LinkedList<Barang> daftarBarang = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User("admin", "admin123");
        Loginsistem system = new Loginsistem(user);

        if (system.login()) {
            int choice;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Hapus Data Barang Pertama");
                System.out.println("3. Hapus Data Barang Terakhir");
                System.out.println("4. Tambah Barang pada Urutan Tertentu");
                System.out.println("5. Transaksi");
                System.out.println("6. Logout");
                System.out.print("Pilih menu (1-6): ");
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
                        
                        break;
                    case 6:
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
