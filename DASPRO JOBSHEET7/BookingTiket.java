import java.util.Scanner;

public class BookingTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTiket = 0;
        double totalHarga = 0.0;
        
        System.out.println("Selamat datang di Aplikasi Booking Tiket!");
        
        do {
            System.out.print("Masukkan jumlah tiket yang ingin Anda beli (0 untuk selesai): ");
            int jumlahTiket = input.nextInt();
            
            if (jumlahTiket == 0) {
                break; 
            }
            
            System.out.print("Masukkan harga tiket per unit: ");
            double hargaTiket = input.nextDouble();

            totalTiket += jumlahTiket;
            totalHarga += jumlahTiket * hargaTiket;
        } while (true);
        
        System.out.println("Total tiket yang Anda beli: " + totalTiket);
        System.out.println("Total harga yang harus Anda bayar: " + totalHarga + " Rupiah");
        
        System.out.println("Terima kasih telah menggunakan Aplikasi Booking Tiket!");
    }
}