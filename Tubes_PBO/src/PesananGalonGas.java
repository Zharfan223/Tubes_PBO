public class PesananGalonGas extends GalonGas {
    private Pekerja pekerja;
    private Pesanan pesanan;
    private int[] hargaBarang = {17500, 21000, 45000, 105000};

    public PesananGalonGas(Pekerja pekerja) {
        this.pekerja = pekerja;
        this.pesanan = new Pesanan(pekerja);
    }

    @Override
    void tampilkanDaftarBarang() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                Pilihan Jenis Barang                ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("[1]. Isi Ulang Galon Aqua       = Rp 17,500");
        System.out.println("[2]. Isi Ulang Tabung Gas 3 Kg  = Rp 21,000");
        System.out.println("[3]. Beli Galon Aqua            = Rp 45,000");
        System.out.println("[4]. Beli Gas 3 Kg              = Rp 105,000");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void pesanBarang(int nomorBarang, Pelanggan pelanggan) {
        pesanan.tambahBarang(nomorBarang, 1, pelanggan);
    }

    public int[] dapatkanHargaBarang() {
        return hargaBarang;
    }

    public Pekerja getPekerja() {
        return pekerja;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public void tampilkanPesanan() {
        pesanan.tampilkanPesanan();
    }
}
