public class PesananDetail {
    private int jumlah;
    private Pelanggan pelanggan;

    public PesananDetail(int jumlah, Pelanggan pelanggan) {
        this.jumlah = jumlah;
        this.pelanggan = pelanggan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }
}
