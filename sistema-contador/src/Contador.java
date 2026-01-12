import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int b = sc.nextInt();

            if (a > b) {
                throw new IllegalArgumentException("El segundo número debe ser mayor que el primero");
            }

            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
