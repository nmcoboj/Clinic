package examenparciall2;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }
    
    public int MenuPrincipal() {
        int entrada;
        Scanner opcion = new Scanner(System.in);   
        do{ 
           System.out.println(" ");
           System.out.println("Ingresa el numero de la accion que quieres relizar");
           System.out.println("1. Registrar los datos de los empleados.");
           System.out.println("2. Registrar los datos de los pacientes.");
           System.out.println("3. Registrar los datos de los médicos.");
           System.out.println("4. Listar médicos.");
           System.out.println("5. Listar pacientes.");
           System.out.println("6. Salir del programa.");
           entrada =opcion.nextInt();
        }while(entrada>6 || entrada <1 );


        return entrada;
    }
     
}
