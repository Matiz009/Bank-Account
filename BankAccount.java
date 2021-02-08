public class BankAccount {
    String Name="Mati";
    double balance=1000.67;

    void deposit(double amount){
        balance+=amount;
        System.out.println("Your new balance is "+balance);
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("Your balance is "+balance);
    }

}
