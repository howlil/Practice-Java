package id.ac.unand.fti.si.pbo;

public class App {
    public static void main(String[] args) {
        // Contoh penggunaan Member
        Member memberReguler = new Member();
        System.out.println("Total Bayar Member Reguler: " + memberReguler.hitungTotalBayar(750000));
        System.out.println("Poin Member Reguler: " + memberReguler.getPoin());

        // Contoh penggunaan MemberPlatinum
        MemberPlatinum memberPlatinum = new MemberPlatinum();
        System.out.println("Total Bayar Member Platinum: " + memberPlatinum.hitungTotalBayar(750000));
        System.out.println("Poin Member Platinum: " + memberPlatinum.getPoin());
    }
}
