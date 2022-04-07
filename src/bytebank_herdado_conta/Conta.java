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

    public boolean saca(double valor){
        if (this.saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public boolean transfere (Conta contaDestino, double valor){
        if (valor<=this.saldo){
            contaDestino.deposita(valor);
            saca(valor);
            return true;
        }
        return false;
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
