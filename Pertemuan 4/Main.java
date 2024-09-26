public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone", "12 Pro");
        smartphone.nyalakan();
        smartphone.kirimPesan("081234567890", "Hai, ini Abner. Bagaimana kabar Anda?");
        smartphone.kirimPesan("example@mail.com", "Tugas PBO 2", "Selamat Siang, Izin mengumpulkan tugas PBO pertemuan 2");
        smartphone.aksesInternet();
        smartphone.matikan();

        System.out.println();

        

        FeaturePhone featurePhone = new FeaturePhone("Nokia", "3310");
        featurePhone.nyalakan();
        featurePhone.mainGameSnake();
        featurePhone.matikan();

        
    }
}
