import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PacienteMascota {

    String nombreMascota;
    Especie especie;
    double pesoIdeal;
    String nombreDueño;
    LocalDate fechaProximaVacuna;

    static String nombreRedVeterinaria = "VetPlus";

    public PacienteMascota(String nombre, Especie esp, double peso, String dueño, LocalDate fecha) {
        nombreMascota = nombre;
        especie = esp;
        pesoIdeal = peso;
        nombreDueño = dueño;
        fechaProximaVacuna = fecha;
    }

    public void DiasParaVacuna() {
        LocalDate hoy = LocalDate.now();
        long diasFaltantes = ChronoUnit.DAYS.between(hoy, fechaProximaVacuna);
        System.out.println("Faltan " + diasFaltantes + " dias para vacunar a " + nombreMascota);
    }

    public static void ActualizarNombreRed(String nuevoNombre) {
        nombreRedVeterinaria = nuevoNombre;
    }

    public void imprimirDatos() {
        System.out.println("Red: " + nombreRedVeterinaria + " | Mascota: " + nombreMascota + " | Especie: " + especie + " | Dueño: " + nombreDueño + " | Peso: " + pesoIdeal);
    }
}
