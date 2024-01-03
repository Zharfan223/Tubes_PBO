import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pekerja pekerja = new Pekerja("Muhammad Rizaldi", "Jln. Kecipir 1");
        PesananGalonGas pesananGalonGas = new PesananGalonGas(pekerja);

        boolean inginPesananLagi = true;

        while (inginPesananLagi) {
            System.out.println("\nMenu Toko ALAM SINARSARI:");
            System.out.println("1. List Harga");
            System.out.println("2. Beli");
            System.out.println("3. History Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    pesananGalonGas.tampilkanDaftarBarang();
                    break;
                case 2:
                    beliBarang(scanner, pesananGalonGas);
                    break;
                case 3:
                    lihatPesanan(pesananGalonGas);
                    break;
                case 4:
                    inginPesananLagi = false;
                    System.out.println("\"Terima kasih telah berbelanja ditoko ALAM SINARSARI !<^0^>!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }

    private static void beliBarang(Scanner scanner, PesananGalonGas pesananGalonGas) {
        pesananGalonGas.tampilkanDaftarBarang();

        // Memasukkan informasi pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan Alamat Pelanggan: ");
        String alamatPelanggan = scanner.nextLine();
        System.out.print("Masukkan Nomor Telepon Pelanggan: ");
        String nomorTeleponPelanggan = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, alamatPelanggan, nomorTeleponPelanggan);

        System.out.print("Pilih mau pesan apa (1-4): ");
        int pilihanBarang = scanner.nextInt();
        scanner.nextLine();

        pesananGalonGas.pesanBarang(pilihanBarang, pelanggan);

        int hargaPerBarang = pesananGalonGas.dapatkanHargaBarang()[pilihanBarang - 1];

        System.out.print("Masukkan jumlah barang yang dipesan: ");
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine();

        pesananGalonGas.getPesanan().tambahBarang(pilihanBarang, jumlahBarang, pelanggan);

        int totalHarga = hargaPerBarang * jumlahBarang;

        System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);

        Pembayaran pembayaran = new Pembayaran();
        pembayaran.prosesPembayaran(totalHarga);

        // Menampilkan konfirmasi setelah pembayaran
        System.out.print("Lanjutkan Pesanan? [Ya/Tidak]: ");
        String jawaban = scanner.next();
        scanner.nextLine();

        if (jawaban.equalsIgnoreCase("Tidak")) {
            System.out.println("Terima kasih telah berbelanja ditoko ALAM SINARSARI !<^0^>! ");
        }
    }

    private static void lihatPesanan(PesananGalonGas pesananGalonGas) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pekerja yang akan mengantar pesanan: " + pesananGalonGas.getPekerja().getNama());
        pesananGalonGas.getPesanan().tampilkanPesanan();
    }
}
