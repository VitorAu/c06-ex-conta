import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<Account> accounts = new HashSet<Account>();

        Account ac1 = new Account("Pedro", "123.123.123-12", 500044, 200073);
        Account ac2 = new Account("Marcos", "321.321.321-21", 900674, 403073);
        Account ac3 = null;

        accounts.add(ac1);
        accounts.add(ac2);
        accounts.add(ac3);

        Account.ShowInfo(accounts);
        System.out.println("O programa foi executado com sucesso");
    }
}
