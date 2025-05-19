import java.util.Scanner;

public class Estaciones{
     private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

    System.out.println("Ingresa un numero para ver la estacion del año: ");
    int mes = scanner.nextInt();

    switch(mes){
        case 1:
        case 2:
        case 12:
            System.out.println("Estacion del año: Invierno");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Estacion del año: Primavera");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Estacion del año: Verano");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Estacion del año Otoño");
            break;

    }


}

}