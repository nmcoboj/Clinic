
package examenparciall2;


public class Principal {

    public static void main(String[] args) {

        int entrada = 0;
        Menu menu = new Menu();
        entrada = menu.MenuPrincipal();

        while (entrada != 6) {
            switch (entrada) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Opción 1: Registrar empleados.");
                        //empleado    
                    entrada = menu.MenuPrincipal();
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("Opción 2: Registrar pacientes.");

                    entrada = menu.MenuPrincipal();
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Opción 3: Registrar médicos.");

                    entrada = menu.MenuPrincipal();
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Opción 4: Listar médicos.");

                    entrada = menu.MenuPrincipal();
                    break;                          
                case 5:
                    System.out.println(" ");
                    System.out.println("Opción 5: Listar pacientes.");

                    entrada = menu.MenuPrincipal();
                    break;
            }
        }
    }
    
}
