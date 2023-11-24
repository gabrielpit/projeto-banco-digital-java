public class Main {
    public static void main(String[] args) {
        Cliente jarda = new Cliente();
        jarda.setNome("jardas");

        Conta poupanca1 = new ContaPoupanca(jarda);
        Conta corrente1 = new ContaCorrente(jarda);

        poupanca1.depositar(100);
        poupanca1.imprimirExtrato();
        poupanca1.transferir(100, corrente1);
        poupanca1.imprimirExtrato();
        corrente1.imprimirExtrato();
        corrente1.sacar(100);
        poupanca1.imprimirExtrato();
        corrente1.imprimirExtrato();
    }
}
