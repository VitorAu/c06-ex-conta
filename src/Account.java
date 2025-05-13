import java.util.HashSet;

public class Account {
  String name;
  String cpf;
  Integer balance;
  Integer limit;

  public Account(String name, String cpf, Integer balance, Integer limit) {
    this.name = name;
    this.cpf = cpf;
    this.balance = balance;
    this.limit = limit;
  }

  public void PrintInfo() {
    System.out.println("-------------");
    System.out.println("Nome:" + this.name);
    System.out.println("CPF:" + this.cpf);
    System.out.println("Saldo" + this.balance / 100);
    System.out.println("Limite:" + this.limit / 100);
    System.out.println("-------------");
  }

  public static void ShowInfo(HashSet<Account> accounts) {
    for (Account account : accounts) {
      try {
        account.PrintInfo();
      } catch (NullPointerException e) {
        System.out.println("-------------");
        System.out.println("Error: " + e);
        System.out.println("-------------");
      }
    }
  }
}
