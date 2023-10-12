public class EstadoAmarelo implements EstadoSemaforo {

    @Override
    public void efetuarTransicao(Semaforo semaforo) {
        // TODO Auto-generated method stub
        semaforo.setup(new EstadoVermelho());
    }

    @Override
    public String getDescricao() {
        // TODO Auto-generated method stub
        return "AMARELO";
    }

    @Override
    public String getAcaoDoSemaforo() {
        return "ATENÇÃO";
    }


    
}
