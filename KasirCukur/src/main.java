
public class main {

    public static void main(String[] args) {
        tukangCukur t1 = new tukangCukur();
        t1.setNama("A");
        t1.setHarga("10000");
        tukangCukur t2 = new tukangCukur();
        t2.setNama("B");
        t2.setHarga("5000");

        pelanggan p1 = new pelanggan();
        p1.setNamaPelanggan("Andi");
        p1.setModelRambut("Rapih");

        transaksi trx1 = new transaksi();
        trx1.setTukangCukur(t1);
        trx1.setPelanggan(p1);

        pelanggan p2 = new pelanggan();
        p2.setNamaPelanggan("Boni");
        p2.setModelRambut("Botak");

        transaksi trx2 = new transaksi();
        trx2.setTukangCukur(t2);
        trx2.setPelanggan(p2);

        transaksi[] arrTRX = new transaksi[2];
        arrTRX[0] = trx1;
        arrTRX[1] = trx2;

        System.out.println("===Barbershop===");
        System.out.println("Transaksi 1");
        System.out.println("Nama Pelanggan    : " + arrTRX[0].getDataPelanggan().getNamaPelanggan());
        System.out.println("Model rambut      : " + arrTRX[0].getDataPelanggan().getModelRambut());
        System.out.println("Nama tukang cukur : " + arrTRX[0].getDataTukangCukur().getNama());
        System.out.println("Harga             : " + arrTRX[0].getDataTukangCukur().getHarga());

        System.out.println("\nTransaksi 2");
        System.out.println("Nama Pelanggan    : " + arrTRX[1].getDataPelanggan().getNamaPelanggan());
        System.out.println("Model rambut      : " + arrTRX[1].getDataPelanggan().getModelRambut());
        System.out.println("Nama tukang cukur : " + arrTRX[1].getDataTukangCukur().getNama());
        System.out.println("Harga             : " + arrTRX[1].getDataTukangCukur().getHarga());

    }

}