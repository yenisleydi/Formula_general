import java.util.Scanner;

public class Principal {
    Operacion operacion=new Operacion();
    int a,b,c;
    public void principal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor A:");
        a = scanner.nextInt();
        System.out.println("Ingresa el valo B");
        b = scanner.nextInt();
        System.out.println("Ingresa el valor C");
        c = scanner.nextInt();
        if (a == 0) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("|     A   D E B E   D E   S E R   D I F E R E N T E   D E   C E R O    |");
            System.out.println("------------------------------------------------------------------------");
        }
        else {
            operacion.operacion(a, b, c);
        }
    }
}
