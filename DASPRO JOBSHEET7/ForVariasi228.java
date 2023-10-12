import java.util.Scanner;

public class ForVariasi228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1;
        boolean berhenti = false;
        for (; !berhenti; ) {
            System.out.print("Masukkan bilangan: ");
            bil1 = sc.nextInt();
            System.out.println("Bilangan yang anda masukkan: " +bil1);
            if (bil1 == 1) {
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");
    }
}