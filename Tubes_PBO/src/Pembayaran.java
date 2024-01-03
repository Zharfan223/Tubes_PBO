import java.util.Scanner;

public class Pembayaran {
    public void prosesPembayaran(int totalHarga) {
        Scanner scanner = new Scanner(System.in);
        boolean pembayaranSukses = false;

        while (!pembayaranSukses) {
            System.out.print("Uang yang akan dibayarkan ke pengantar: ");
            int jumlahBayar = scanner.nextInt();

            if (jumlahBayar >= totalHarga) {
                int kembalian = jumlahBayar - totalHarga;
                System.out.println("Kembalian yang akan diberikan pengantar: " + kembalian);
                pembayaranSukses = true;
            } else {
                System.out.println("Uang yang dibayarkan masih kurang.");
            }
        }
    }
}
