import java.util.Scanner;

public class Pemain {
    private String nama;

    public Pemain (String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void startGame() {
        Scanner input = new Scanner(System.in);

        GenerateAngka generateAngka = new GenerateAngka();
        int angka = generateAngka.getNumber();
        while (true) {
            System.out.print("Tebak angka (1-9): ");
            int tebakan = input.nextInt();
            if(tebakan < 0 || tebakan > 9) {
                System.out.println("Tebakan harus antara 1-9 !");
            } else if (tebakan > angka ) {
                System.out.println("Tebakan anda terlalu besar");
            } else if (tebakan < angka) {
                System.out.println("Tebakan anda terlalu kecil");
            } else {
                System.out.println("Selamat, tebakan anda benar!");
                break;
            }
        }
    }
}