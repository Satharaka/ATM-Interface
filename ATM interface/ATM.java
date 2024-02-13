import java.util.Scanner;

public class ATM 
{
    public static void displayMenu() 
    {
        System.out.println("**************************************");
        System.out.println("* 1 ----------- Check the balance    *");
        System.out.println("* 2 ----------- Deposit money        *");
        System.out.println("* 3 ----------- Withdraw money       *");
        System.out.println("* 4 ----------- Exit                 *");
        System.out.println("**************************************");
    }

    public static double checkBalance(double balance) 
    {
        return balance;
    }

    public static double depositMoney(double balance) 
    {
        double deposit = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your deposit amount: ");
        deposit = input.nextInt();

        balance =  balance + deposit ;
        System.out.println("Your current balance is: " + balance);
        System.out.println();
        return balance;
    }

    public static double withdrawMoney(double balance) 
    {
        double withdraw = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your withdrawal amount: ");
        withdraw = input.nextInt();

        if (withdraw < balance) 
        {
            balance = balance - withdraw;
            System.out.println("Your current balance is: " + balance);
            System.out.println();
            return balance;
        } 
        else 
        {
            System.out.println("Insufficient funds. Check your balance!!");
            System.out.println();
            return -1;
        }
    }

    public static void exit() 
    {
        System.out.println();
        System.out.println("***************");
        System.out.println("*  THANK YOU  *");
        System.out.println("*   WELCOME   *");
        System.out.println("***************");
    }

    public static void main(String[] args) 
    {
        int choice;
        double balance = 1000;

        while (true) 
        {
            displayMenu();

            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Your current balance is: " + checkBalance(balance));
                    System.out.println();
                    break;

                case 2:
                    balance = depositMoney(balance);
                    break;
                case 3:

                    double result = withdrawMoney(balance);

                    if (result != -1)
                     {
                        balance = result;
                    }
                    break;

                case 4:
                    exit();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }
        }
    }
}


