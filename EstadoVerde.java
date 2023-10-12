public class EstadoVerde implements EstadoSemaforo {
    
    @Override
    public void efetuarTransicao(Semaforo semaforo) {
        // TODO Auto-generated method stub
        semaforo.setup(new EstadoAmarelo());
    }

    @Override
    public String getDescricao() {
        // TODO Auto-generated method stub
        return "VERDE";
    }

    @Override
    public String getAcaoDoSemaforo() {
        return "SIGA";
    }
}
