import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Product Name: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double harga = scanner.nextDouble();

            scanner.nextLine(); // Consume newline left-over

            System.out.print("Enter Discount Rate (0 for no discount): ");
            double nilaiDiskon = scanner.nextDouble();

            scanner.nextLine(); // Consume newline left-over

            Barang barang;
            if (nilaiDiskon == 0) {
                barang = new Barang(namaBarang, harga);
            } else {
                barang = new Diskon(namaBarang, harga, nilaiDiskon);
            }

            System.out.println("Jenis Produk: " + barang.getJenisProduk());
            System.out.println("Harga: Rp" + barang.getHarga());

            if (barang instanceof Diskon) {
                Diskon diskonBarang = (Diskon) barang;
                System.out.println("Diskon: Rp" + diskonBarang.hitungDiskon());
                System.out.println("Harga Setelah Diskon: Rp" + (barang.getHarga() - diskonBarang.hitungDiskon()));
            } else {
                System.out.println("Tidak ada diskon untuk produk ini.");
                System.out.println("Total Bayar: Rp" + barang.getHarga());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
