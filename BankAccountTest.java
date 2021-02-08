import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            BankAccount bankAccount = new BankAccount();
            System.out.println("Name of bank holder is  "+bankAccount.Name);
            System.out.println("Current Balance is "+ bankAccount.balance);
            System.out.println("Press 1: To Deposit an amount");
            System.out.println("Press 2: To withdraw an amount");
            System.out.println("Press 3: To view the balance");
            System.out.println("Press 4: To exit the program");
            int dec = scanner.nextInt();
            if(dec==1){
                System.out.println("Enter the amount you want to deposit");
                int amount= scanner.nextInt();
                bankAccount.deposit(amount);
            }else if(dec==2){
                System.out.println("Enter the amount you want to withdraw");
                int amount= scanner.nextInt();
                bankAccount.withdraw(amount);
            }else if(dec==3){
                System.out.println("Your current balance is "+bankAccount.balance);
            }else if(dec==4){
                System.exit(0);
            }else{
                System.out.println("Invalid input");
            }


            }

        }

    }

