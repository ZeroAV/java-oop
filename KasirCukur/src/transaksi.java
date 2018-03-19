
public class transaksi {

    private tukangCukur dataTukangCukur;
    private pelanggan dataPelanggan;

    public transaksi() {
        dataTukangCukur = new tukangCukur();
        dataPelanggan = new pelanggan();
    }

    public void setPelanggan(pelanggan pelanggan) {
        this.dataPelanggan = pelanggan;
    }

    public void setTukangCukur(tukangCukur tukangCukur) {
        this.dataTukangCukur = tukangCukur;
    }

    public tukangCukur getDataTukangCukur() {
        return dataTukangCukur;
    }

    public pelanggan getDataPelanggan() {
        return dataPelanggan;
    }
}