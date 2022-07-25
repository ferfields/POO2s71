import kfer.*;
import kfer.interfaces.*;
;

public class App {
    public static void main(String[] args) throws Exception {
        Contexto contexto = new Contexto(new Agendaytratamiento());
        contexto.ejecutar();
    }
}
