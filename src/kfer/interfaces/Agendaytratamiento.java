package kfer.interfaces;

public class Agendaytratamiento extends tratamiento {
    public void agendarcita() {
        agendar();
        odontolog();
        tratamin();
        reserva();
        confirmado();
    }
    
    @Override
    void agendar() {
        System.out.println("Agendar Cita de Tratamiento");
        
    }

    @Override
    void odontolog() {
        try {
            System.out.println("Buscando Odontologo disponible...");
            Thread.sleep(1000);
            System.out.println("Se ha encontrado un Odontologo disponible");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    void tratamin() {
        try {
            System.out.println("Asignando tratamiento...");
            Thread.sleep(2500);
            System.out.println("Se ha asignado el tratamiento");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    void reserva() {
        try {
            System.out.println("Fijando fecha en el calendario...");
            Thread.sleep(2500);
            System.out.println("Se ha fijado la fecha en el calendario");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    @Override
    void jornada() {
        System.out.println("Jornada manana 09:00 - 13:00");
        
    }
    @Override
    void confirmado() {
        System.out.println("Cita de tratamiento dental confirmada");
        
    }
    
}
    

