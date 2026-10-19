public class Tarea {
    public class Tarea {
        public String titulo;
        public String responsable;
        double horasEstimadas;
        boolean completada;

        public void completar(){
            completada = true;
        }

        void mostrarResponsable(){
            System.out.println("Responsable: " + responsable);
        }

        void mostrarEstado(){
            System.out.println("Estado: " + (completada ? "Completada" : "No completada"));
        }
    }
}
