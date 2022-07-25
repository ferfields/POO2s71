package kfer.interfaces;

public abstract class tratamiento implements citasestrategia {
    public abstract void agendarcita(); {

    agendar();
    odontolog();
    tratamin();
    reserva();
    confirmado();
    jornada();

    }

    abstract void agendar();
    abstract void odontolog();
    abstract void tratamin();
    abstract void reserva();
    abstract void confirmado();
    abstract void jornada();
}
