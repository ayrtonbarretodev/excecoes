package bytebank_herdado_conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){}

    public ContaPoupanca(double saldo, int agencia, int numero, Cliente titular) {
        super(saldo, agencia, numero, titular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo+=valor;
    }

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
}
