
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Input harus besar dari 0");
        }
        else{
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
        
          if (num % i == 0) {
            flag = true;
            break;
          }
        }
    
        if (!flag){
          System.out.println(num + " adalah bilangan prima");
        }
          
        else{
          System.out.println("Jawaban : " + num + " bukan bilangan prima");
        }
        sc.close();
      }
    }
}
