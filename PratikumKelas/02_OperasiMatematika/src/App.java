import java.util.Scanner;

//TODO: Lengkapilah Driver Class berikut sehingga mampu meminta bilangan dan menghitung selisih dari kuadrat jumlah dengan jumlah kuadrat

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka :");
        Integer n = sc.nextInt();
        Integer kuadrat=0;
        Integer jumlah = 0;
        Integer tot = 0;

        if(n <=0){
            System.out.println("Invalid input");
        }else{

        
        for(Integer i = 1 ; i<= n ; i++){
            kuadrat += i*i;
            jumlah += i;
        }   

        tot = Math.abs(kuadrat - jumlah*jumlah);
        System.out.println("hasilnya adalah " + tot);

        sc.close();
        }


    }
    
}
