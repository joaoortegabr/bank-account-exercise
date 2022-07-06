package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please type your bank branch number:");
        Integer bankBranch = sc.nextInt();
        
        System.out.println("Please type your bank account number:");
        Integer bankAccount= sc.nextInt();

        System.out.println("Please type your name:");
        String customerName = sc.next();
        
        System.out.println("Please type your balance:");
        Double balance = sc.nextDouble();

        sc.close();

        System.out.println("-----------------------");
        System.out.println("Greetings " + customerName + ", welcome to our bank.");
        System.out.println("Your bank branch is " + bankBranch + "and your account number is " + bankAccount + ".");
        System.out.println("Your balance is " + balance + ".");
    

    }
}
