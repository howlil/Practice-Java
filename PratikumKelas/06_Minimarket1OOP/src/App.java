public class App {
    public static void main(String[]a){
        
        Barang barang = new Barang("INDM002", "Supermie");
        barang.setDiskon(0.5);
        barang.setHargaBeli(7000);
        barang.setHargaJual(10000);
        barang.tampilInfo();
    }
}
