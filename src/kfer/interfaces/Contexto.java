package kfer.interfaces;

public class Contexto {
    
    private citasestrategia estrategia;

    public Contexto(citasestrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutar() {
        this.estrategia.agendarcita();
    }
}
