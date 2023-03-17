public class KecepatanBeraksi {
    public static void main(String[] args) {
        // membuat object'
        Kendaraan mobil = new Kendaraan();
        Kendaraan motor = new Kendaraan();
        Kendaraan sepeda = new Kendaraan();

        motor.warna = "Hitam";
        motor.merk = "yamaha mio";
        motor.roda = 2;
        motor.infoKendaraan();
        mobil.warna = "merah";
        mobil.merk = "Toyota Inova";
        mobil.roda = 4;
        mobil.infoKendaraan();
        mobil.berjalan("depan");
        mobil.berhenti();
        mobil.kecepatan = 20;
        sepeda.kecepatan = 5;
        System.out.println("kecepatan awal " + mobil.kecepatan);
        int kecepatan = mobil.kecepatanSekarang(10, "lambat");
        System.out.println("Kecepatan kendaraan adalah " + kecepatan);
        mobil.mundur();
        ;
        System.out.println("Kecepatan sekarang setelah mundur " + mobil.kecepatan);

    }

}
