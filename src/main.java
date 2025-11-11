import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int eleccionUsuario;
        boolean estadoAplicacion=true;

        while (estadoAplicacion){
            System.out.println("Digite la pelicula que desea consultar: ");
            System.out.println("1. The Phantom Menace");
            System.out.println("2. Attack of the Clones");
            System.out.println("3. Revenge of the Sith");
            System.out.println("4. A New Hope");
            System.out.println("5. The Empire Strikes Back");
            System.out.println("6. Return of the Jedi");
            System.out.println("7. Salir");
            eleccionUsuario = entrada.nextInt();

            switch (eleccionUsuario){
                case 1:
                    eleccionUsuario=4;
                    break;
                case 2:
                    eleccionUsuario=5;
                    break;
                case 3:
                    eleccionUsuario=6;
                    break;
                case 4:
                    eleccionUsuario=1;
                    break;
                case 5:
                    eleccionUsuario=2;
                    break;
                case 6:
                    eleccionUsuario=2;
                    break;
                case 7:
                    estadoAplicacion=false;
                default:
                    System.out.println("No es una opcion valida");



            }

            LlamadoAPI.ConsultaUsuario(eleccionUsuario,estadoAplicacion);
            if (estadoAplicacion){
                System.out.println("********************************");
                System.out.println("Presiona enter para continuar...");
                entrada.nextLine();
                entrada.nextLine();
            }



        }




    }
}
