package bank;

abstract class Account {

    private int agencia;
    private int conta;
    private int senha;
    private double saldo = 0;


    Account(int agencia, int conta, int senha) {
        this.agencia = agencia;
        this.conta = conta;
        this.senha = senha;
    }


    // getters
    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    void deposita(double valor){
        saldo += valor;
        System.out.println(saldo);
    }

    void transfere(double valor, Account destino){
        if (saldo < valor) {
            System.out.println("Você não tem dinheiro suficiente na conta.");
        } else {
            destino.deposita(valor);
            saldo -= valor;
        }
    }
}
