import java.util.Scanner;

public class KafeDoWhile13 {

    public static void main(String[] args) {
        Scanner input13 =new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        String namaPelanggan; 
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000; 

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' unruk keluar): ");
            namaPelanggan = input13.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan.");
                break;

            }
            System.out.println("Jumlah Kopi: ");
            kopi = input13.nextInt();
            System.out.println("Jumlah teh: ");
            teh = input13.nextInt();
            System.out.println("Jumlah roti: ");
            roti = input13.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input13.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai");
        input13.close();
    } 
}