import java.util.Scanner;

public class GameSystem {

    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pemain: ");
        String namePlayer = input.nextLine();

        System.out.println("Selamat datang, " + namePlayer + "!");
        System.out.println("Tekan tombol enter untuk melanjutkan...");
        input.nextLine();

        Pemain pemain = new Pemain(namePlayer);

        while (true) {
            System.out.println("===== MAIN MENU =====");
            System.out.println("1. Memulai permainan");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan: ");
            int choice = Integer.parseInt(input.nextLine());

            if (choice == 1) {
                pemain.startGame();
            } else if (choice == 2) {
                System.out.println("Terima kasih telah bermain!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
