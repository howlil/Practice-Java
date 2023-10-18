public class App 
{
    public static void main( String[] args )
    {
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.nama = "Budi";
        pelanggan.noId = "1234567890";
        pelanggan.noHp = "+628123456789";
        pelanggan.email = "budi@gmail.com";
        pelanggan.status = 1;

        pelanggan.updateNoHp("+628765432109");
        pelanggan.updateEmail("ani@outlook.com");
        pelanggan.deactivate();
    
    }
}
