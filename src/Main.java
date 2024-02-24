import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");
        int sicaklik = scanner.nextInt();

        // İlk yöntem: Her durumu ayrı ayrı kontrol etmek
        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öner.");
        } else if (sicaklik >= 5 && sicaklik <15) {
            System.out.println("Sinema etkinliğini öner.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Piknik etkinliğini öner.");
        } else {
            System.out.println("Yüzme etkinliğini öner.");
        }

    }
}
