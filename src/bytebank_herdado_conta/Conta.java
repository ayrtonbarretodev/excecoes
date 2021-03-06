package bytebank_herdado_conta;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(){

    }

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.total++;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo<valor){
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        saldo-=valor;
    }

    public void transfere (Conta contaDestino, double valor) throws SaldoInsuficienteException {
        this.saca(valor);
        contaDestino.deposita(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setAgencia(int agencia) {
        if (agencia<=0){
            System.out.println("O número da agência é maior que do zero, informe novamente!");
            return;
        }
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        if (numero<=0){
            System.out.println("O número deve ser maior que do zero, informe novamente!");
            return;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getTotal() {
        return total;
    }
}
