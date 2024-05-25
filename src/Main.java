import servicios.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String usuario;
        String password;
        String servicio;
        String token;
        Adapter adapter = new Adapter();
        Scanner sc = new Scanner(System.in);
        int salir = 0;

        do {

            System.out.print("INGRESE SUS DATOS DE PAGO\n");
            System.out.print("SERVICIO (paypal/n1co): ");
            servicio = sc.nextLine();
            System.out.print("USUARIO: ");
            usuario = sc.nextLine();
            System.out.print("CONTRASENA: ");
            password = sc.nextLine();

            token = adapter.generarToken(usuario, servicio);

            System.out.print("\nSu token es: " + token);

            System.out.print("\n¿SALIR? (1 = sí / 0 = no) ");
            salir = sc.nextInt();
        } while (salir != 1);



    }
}