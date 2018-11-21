package bank;

public class Atm {

    public static void main(String[] args) {

        Account bruno = new BusinessAccount(1234, 5674, 1267);

        bruno.deposita(2000);

        Account guilherme = new BusinessAccount(4569, 84948,9999);

        bruno.transfere(400, guilherme);

        System.out.println("conta transferida: " + guilherme.getSaldo());
        System.out.println("bruno: " + bruno.getSaldo());
    }
}
