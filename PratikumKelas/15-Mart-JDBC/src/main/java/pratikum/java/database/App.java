package pratikum.java.database;


import java.util.Scanner;
import java.lang.invoke.VarHandle.AccessMode;
import java.text.SimpleDateFormat;
import java.util.Date;
public class App 
{

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main( String[] args )
    {
        Admin admin = new Admin("admin", "admin");
        LoginSistem system = new LoginSistem(admin);
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
              
                        break;
                    case 2:
                
                        break;
                    case 3:
                
                        break;
                    case 4:
                        
                        break;
                    case 5:
                  
            
                   
                        break;
                    case 6:
                  
                        break;

                    case 7:
                       
                }
            } while (choice != 0);
        } else {
            System.out.println("Login gagal.");
        }

        scanner.close();
    }
} 

