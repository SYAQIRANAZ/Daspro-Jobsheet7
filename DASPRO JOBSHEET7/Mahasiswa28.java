import java.util.Scanner;

public class Mahasiswa28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    String nama = "";
    String jnsKelamin = "";
    String output = "";
    int jml = 1;
    while (jml <= 30){
        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();
        jml++;
        System.out.print("Masukkan jenis kelaminmu: ");
        jnsKelamin = sc.nextLine();
        if 
        (jnsKelamin.equalsIgnoreCase("P")) {
            output += nama;
        }
    } System.out.printf("Mahasiswa perempuan: %s\t", output);
    }
}