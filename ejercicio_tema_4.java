//Ejercicio Curso de introduccion a la programación Tema 4 **Sentencias de control**//

public class ejercicio_tema_4 {
    public static void main(String[] args) {
        // Condición con if para comparar si un número es positivo, negativo o cero
        System.out.println("Inicio IF" );
        int numeroIf = -1;
        if (numeroIf > 0) {
            System.out.println("El número "+numeroIf+ " es positivo \n");
        } else if (numeroIf < 0) {
            System.out.println("El número " +numeroIf+" es negativo \n");
        } else {
            System.out.println("El número "+numeroIf+ " es cero \n");
        }
        
        // Bucle While
        System.out.println("\nInicio del bucle While");
        int numeroWhile = -1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        // Bucle Do-While
        System.out.println("\nInicio del bucle Do While");
        int numeroDoWhile = -1;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
        
        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        // Switch
        System.out.println("\nIncio del switch");
        String estacion = "invierno";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera\n");
                break;
            case "verano":
                System.out.println("Estamos en verano\n");
                break;
            case "otoño":
                System.out.println("Estamos en otoño\n");
                break;
            case "invierno":
                System.out.println("Estamos en invierno\n");
                break;
            default:
                System.out.println("Valor inválido para la estación\n");
        }
    }
}