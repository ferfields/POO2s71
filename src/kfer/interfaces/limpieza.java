package kfer.interfaces;

public abstract class limpieza implements citasestrategia {
    public abstract void agendarcita(); {
        agendar();
        reserva();
        confirmado();
        jornada();
    }

    abstract void agendar();
    abstract void reserva();
    abstract void confirmado();
    abstract void jornada();
}
    

