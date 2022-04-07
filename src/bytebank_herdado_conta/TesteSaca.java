package bytebank_herdado_conta;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200.0);
        try {
            conta.saca(290.0);
        }catch (SaldoInsuficienteException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
