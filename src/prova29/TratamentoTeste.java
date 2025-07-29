package prova29;

public class TratamentoTeste extends Exception{
    public TratamentoTeste(String mensagem) {
        super(mensagem);
        throw new TratamentoTeste();
    }
}
