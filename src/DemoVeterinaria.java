import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoVeterinaria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<PacienteMascota> listaPacientes = new ArrayList<>();

        System.out.println("___ Ingreso Canino ___");
        System.out.print("Nombre de mascota: ");
        String n1 = s.nextLine();
        System.out.print("Dueño: ");
        String d1 = s.nextLine();
        System.out.print("Peso: ");
        double p1 = s.nextDouble();
        s.nextLine();
        listaPacientes.add(new PacienteMascota(n1, Especie.CANINO, p1, d1, LocalDate.of(2026, 4, 15)));

        System.out.println("___ Ingreso Felino ___");
        System.out.print("Nombre de mascota: ");
        String n2 = s.nextLine();
        System.out.print("Dueño: ");
        String d2 = s.nextLine();
        System.out.print("Peso: ");
        double p2 = s.nextDouble();
        s.nextLine();
        listaPacientes.add(new PacienteMascota(n2, Especie.FELINO, p2, d2, LocalDate.of(2026, 5, 10)));

        System.out.println("___ Ingreso Exotico ___");
        System.out.print("Nombre de mascota: ");
        String n3 = s.nextLine();
        System.out.print("Dueño: ");
        String d3 = s.nextLine();
        System.out.print("Peso: ");
        double p3 = s.nextDouble();
        s.nextLine();
        listaPacientes.add(new PacienteMascota(n3, Especie.EXOTICO, p3, d3, LocalDate.of(2026, 6, 5)));

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n___ MENU VETERINARIA ___");
            System.out.println("1. Listar Pacientes");
            System.out.println("2. Dias Para Vacuna");
            System.out.println("3. Actualizar Nombre Red");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = s.nextInt();

            if (opcion == 1) {
                System.out.println("Lista tota:");
                for (int i = 0; i < listaPacientes.size(); i++) {
                    listaPacientes.get(i).imprimirDatos();
                }

            } else if (opcion == 2) {
                for (int i = 0; i < listaPacientes.size(); i++) {
                    listaPacientes.get(i).DiasParaVacuna();
                }

            } else if (opcion == 3) {
                PacienteMascota.ActualizarNombreRed("Leterinaria");
                System.out.println("Nombre cambiado a Leterinaria exitosamente.");

            } else if (opcion == 4) {
                System.out.println("Cerrando programa.");

            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
