public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        tarea1.titulo = "Implementar la clase Tarea";
        tarea1.responsable = "Juan Pérez";
        tarea1.horasEstimadas = 5.0;
        tarea1.completada = false;

        System.out.println("Título: " + tarea1.titulo);
        tarea1.mostrarResponsable();
        System.out.println("Horas estimadas: " + tarea1.horasEstimadas);
        tarea1.mostrarEstado();

        System.out.println("\nCompletando la tarea...");
        tarea1.completar();
        tarea1.mostrarEstado();

        Tarea tarea2 = new Tarea();
        tarea2.titulo = "Revisar el código";
        tarea2.responsable = "María López";
        tarea2.horasEstimadas = 2.0;
        tarea2.completada = false;

        System.out.println("\nTítulo: " + tarea2.titulo);
        tarea2.mostrarResponsable();
        System.out.println("Horas estimadas: " + tarea2.horasEstimadas);
        tarea2.mostrarEstado();

        tarea2.completar();
        tarea2.mostrarEstado();
        System.out.println("Tarea completada!");

        Tarea tarea3 = new Tarea();
        tarea3.titulo = "Revisar el codigo";
        tarea3.responsable  = "José Ayora";
        tarea3.horasEstimadas = 2.0;
        tarea3.completada = false;

        System.out.println("\nTítulo: " + tarea3.titulo);
        tarea3.mostrarResponsable();
        System.out.println("Horas estimadas: " + tarea3.horasEstimadas);
        tarea3.mostrarEstado();

        tarea3.completar();
        tarea3.mostrarEstado();
        System.out.println("Tarea completada!");

    }
}
