import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        
            System.out.print("Masukan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukan Harga Barang : ");
            double harga = scanner.nextDouble();

            scanner.nextLine(); 

            System.out.print("Masukan Diskon (0 jika tidak ada): " );
            double nilaiDiskon = scanner.nextDouble();

            scanner.nextLine(); 
            Barang produk = new Diskon(namaBarang, harga, nilaiDiskon);
        
            if(nilaiDiskon ==0){
                try {
           
                scanner.nextLine(); 
                System.out.print("Masukkan Nomor Faktur: ");
                String noFaktur = scanner.nextLine();

                System.out.print("Masukkan Nama Pelanggan: ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("Masukkan Jumlah: ");
                int jumlah = scanner.nextInt();

                //polimorpisme
                Barang produk2 = new Invoice(namaBarang, harga, noFaktur, namaPelanggan, jumlah);

                System.out.println("\nJenis Produk: " + produk2.getJenisProduk());
                System.out.println("Nama Barang: "+ produk2.getNama());
                System.out.println("Harga: Rp" + harga);
                System.out.println("Nomor Faktur: " + ((Invoice) produk2).getNoFaktur());
                System.out.println("Nama Pelanggan: " + ((Invoice) produk2).getNamaPelanggan());
                System.out.println("Jumlah: " + ((Invoice) produk2).getJumlah());    

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }else{

                try {
                System.out.println("\nJenis Produk: " + produk.getJenisProduk());
                System.out.println("Harga: Rp" + harga);

                double diskon = produk.hitungDiskon();
                if (diskon > 0) {
                    System.out.println("Diskon: Rp" + diskon);
                    System.out.println("Harga Setelah Diskon: Rp" + (harga - diskon));
                } else {
                    System.out.println("Tidak ada diskon untuk produk ini.");
                }

                System.out.println("Total Bayar: Rp" + (harga - diskon));

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

          
        }
               
         }catch(Exception e){
           System.out.println("Error: " + e.getMessage());
        } 
        finally{
            scanner.close();
        }
    }
}

