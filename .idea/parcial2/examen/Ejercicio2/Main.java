package parcial2.examen.Ejercicio2;

public class Main {

    public static void main(String[]args) throws ClassNotFoundException {
        ChatJuego mediator = new ChatJuego();

        Estudiante estudiante1 = new Estudiante(mediator, "JAVI", "Javier", "RASO");
        Estudiante estudiante2 = new Estudiante(mediator, "Angi", "Angela", "SARGENTO");
        Estudiante estudiante3 = new Estudiante(mediator, "Cuba", "Emiliano", "CORONEL");

        Docente docente1 = new Docente(mediator, "jHN", "jOHN", "CADETE");
        Docente docente2 = new Docente(mediator, "JOAN", "JOEL", "ANTIGUO");
        Docente docente3 = new Docente(mediator, "JULI", "JULIA", "SUBOFICIAL");

        mediator.addJugador(estudiante1);
        mediator.addJugador(estudiante2);
        mediator.addJugador(estudiante3);
        mediator.addJugador(docente1);
        mediator.addJugador(docente2);
        mediator.addJugador(docente3);

        docente1.sendTeam("VAMOS EQUIPO DE DOCENTES");

        estudiante1.sendTeam("VAMOS EQUIPO DE ESTUDIANTES");

        estudiante3.sendAll("VAMOS EQUIPOS");


    }

}
