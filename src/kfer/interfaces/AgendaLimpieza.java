package kfer.interfaces;

public class AgendaLimpieza extends limpieza {

    @Override
    public void agendar() {
        System.out.println("Agendar Cita de limpieza dental");
    }

    @Override
    public void reserva() {
        try {
            System.out.println("Fijando fecha en el calendario...");
            Thread.sleep(2500);
            System.out.println("Se ha fijado la fecha en el calendario");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          
    }

    @Override
    public void confirmado() {
        System.out.println("Cita de limpieza dental confirmada");
        
    }

    @Override
    public void jornada() {
        System.out.println("Jornada tarde 14:00 - 18:00");
        
    }

    @Override
    public void agendarcita() {
        
        
    }
}
