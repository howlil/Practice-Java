
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NAMA SUPERMARKET/MINI MARKET");
        Date date = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat(" hh:mm:ss:zzz");
        SimpleDateFormat tahun = new SimpleDateFormat(" E, dd/mm/yy");
        String formatDate = tanggal.format(date);
        System.out.println("================================");
        

    }

}
