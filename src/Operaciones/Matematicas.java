package Operaciones;
import java.text.DecimalFormat;
import java.util.*;

public class Matematicas {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        double n1 ,n2;
        int seleccion,r=0;
        do {
            System.out.println("Dame un numero joto");
            n1 = sc.nextDouble();
            System.out.println("Dame otro numero putito");
            n2 = sc.nextDouble();
            System.out.println("Seleccion la opcion que desea realizar\n1.Suma\n2.resta\n3.multiplicacion\n4.division");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:System.out.println("La suma es: " + (n1 + n2));break;
                case 2:System.out.println("la resta es: " + (n1 - n2));break;
                case 3:System.out.println("la multiplicacion es: " + (n1 * n2));break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    }else {
                        System.out.println("la division es: " + (n1 / n2));
                        break;
                    }
                default:
                    System.out.println("tas pendejos la opcion no sirve");
                    break;
            }
            System.out.println("¿Quieres realizar otra operacion?\n1.Si\n2.No");
            r = sc.nextInt();

        }while(r==1);
    }
}
