public class Pelanggan {
    public String nama; // nama pelanggan
    public String noId; // nomor identitas pelanggan
    public String noHp; // nomor handphone pelanggan
    public String email; // alamat email pelanggan
    public int status; // status pelanggan, 1 = aktif, 0 = non-aktif

    // Method untuk menonaktifkan diri sendiri
    public void deactivate() {
        this.status = 0;
        System.out.println("Pelanggan " + this.nama + " telah dinonaktifkan.");
    }

    // Method untuk mengupdate nomor handphone
    public void updateNoHp(String noHpBaru) {
        this.noHp = noHpBaru;
        System.out.println("Nomor handphone pelanggan " + this.nama + " telah diubah menjadi " + this.noHp + ".");
    }

    // Method untuk mengupdate alamat email
    public void updateEmail(String emailBaru) {
        this.email = emailBaru;
        System.out.println("Alamat email pelanggan " + this.nama + " telah diubah menjadi " + this.email + ".");
    }
}
