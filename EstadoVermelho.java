public class EstadoVermelho implements EstadoSemaforo{

    @Override
    public void efetuarTransicao(Semaforo semaforo) {
        // TODO Auto-generated method stub
        semaforo.setup(new EstadoVerde());
    }

    @Override
    public String getDescricao() {
        // TODO Auto-generated method stub
        return "VERMELHO";
    }

    @Override
    public String getAcaoDoSemaforo() {
        return "PARE";
    }
}
