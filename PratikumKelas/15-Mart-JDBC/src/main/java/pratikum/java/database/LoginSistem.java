package pratikum.java.database;

import java.util.Scanner;


public class LoginSistem {
    private Admin admin;
    private Captcha captcha;

    public LoginSistem(Admin admin) {
        this.admin = admin;
        this.captcha = new Captcha();
    }
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("username : ");
        String username = scanner.nextLine();

        System.out.print("Password :");
        String password = scanner.nextLine();

        if (admin.check(username, password)) {
            System.out.println("Masukkan captcha berikut: " + captcha.getCaptcha());
            String captchaInput = scanner.nextLine();

            if (captcha.verifyCaptcha(captchaInput)) {
                System.out.println("Login berhasil! \n");
                return true;
            }
        }
        return false;
    }

}