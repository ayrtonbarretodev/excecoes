package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(){}

    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);
    }

    public ContaCorrente(double saldo, int agencia, int numero, Cliente titular) {
        super(saldo, agencia, numero, titular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo+=valor;
    }

    @Override
    public boolean saca(double valor){
            double valorASacar = valor + 0.2;
            return super.saca(valorASacar);

    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
