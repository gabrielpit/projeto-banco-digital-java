public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int saldo;
    protected int numero;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta destino) {
        this.sacar(valor);
        destino.depositar(valor);

    }

    public void imprimirInfoComum() {
        System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " +  this.saldo);

    }

    public static int getAgenciaPadrao() {
        return AGENCIA_PADRAO;
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void imprimirExtrato() {
    }
    
}
