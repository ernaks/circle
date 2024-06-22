import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        double r = sc.nextDouble();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        double alpha = sc.nextDouble();
        double alan = (pi * (r * r) * alpha) / 360;
        System.out.println("Daire diliminin alanı: " + alan);
    }
}