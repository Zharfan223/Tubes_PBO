import java.util.HashMap;
import java.util.Map;

public class Pesanan {
    private Pekerja pekerja;
    private Map<Integer, PesananDetail> daftarBarang = new HashMap<>();

    public Pesanan(Pekerja pekerja) {
        this.pekerja = pekerja;
    }

    public void tambahBarang(int nomorBarang, int jumlah, Pelanggan pelanggan) {
        PesananDetail pesananDetail = new PesananDetail(jumlah, pelanggan);
        daftarBarang.put(nomorBarang, pesananDetail);
    }

    public void tampilkanPesanan() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                          Detail Pesanan Pelanggan                         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Map.Entry<Integer, PesananDetail> entry : daftarBarang.entrySet()) {
            int nomorBarang = entry.getKey();
            PesananDetail pesananDetail = entry.getValue();
            System.out.println("Pelanggan: " + pesananDetail.getPelanggan().getNama() +
                    ", Alamat: " + pesananDetail.getPelanggan().getAlamat() +
                    ", Nomor Telepon: " + pesananDetail.getPelanggan().getNomorTelepon());
            System.out.println("Nomor Barang: " + nomorBarang + ", Jumlah: " + pesananDetail.getJumlah());

        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
