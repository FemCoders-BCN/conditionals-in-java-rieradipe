import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        // Escribe un programa que pida al usuario que ingrese la temperatura en celcius
        // de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y
        // según ello devuelva lo siguiente:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura celsius: ");
        int temperatura = scanner.nextInt();

        if (temperatura < 0) {
            System.out.println("Te estas congelando");
        } else if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("Hace mucho frio");
        } else if (temperatura >= 11 && temperatura <= 17) {
            System.out.println("Con un abrigo estas bien");
        } else if (temperatura >= 18 && temperatura <= 25) {
            System.out.println("Parece que ha llegado el verano");
        } else if (temperatura >= 26 && temperatura <= 35) {
            System.out.println("¡Qué calooooor!");
        } else {
            System.out.println("Aquí no hay quien viva");
        }
        scanner.close();
    }
}