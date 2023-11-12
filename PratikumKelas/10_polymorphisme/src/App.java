public class App {
    public static void main(String[] args) throws Exception {
         Member andi = new MemberGold();
        andi.hitungTotalBayar(800000); 
        andi.getPoin(); 
        ((MemberGold)andi).hitungOngkir(9.0); 


        Member budi = new MemberPlatinum();
        ((MemberPlatinum)budi).deposit(5000000);
        budi.hitungTotalBayar(900000); 
        budi.getPoin();  
        ((MemberPlatinum)budi).hitungOngkir(15.0); 

        // Menampilkan properti yang diperbarui
        System.out.println("Andi Total Bayar: " + andi.totalBayar);
        System.out.println("Andi Poin: " + andi.getPoin());
        System.out.println("Andi Ongkir: " + ((MemberGold)andi).ongkir);

        System.out.println("\nBudi's Total Bayar: " + budi.totalBayar);
        System.out.println("Budi Poin: " + budi.getPoin());
        System.out.println("Budi Ongkir: " + ((MemberPlatinum)budi).ongkir);
        System.out.println("Budi Saldo: " + ((MemberPlatinum)budi).cekSaldo());        
    }
}

