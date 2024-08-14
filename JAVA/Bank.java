import java.util.Scanner;
public class Bank{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    BankAccount bank = new BankAccount("Customer" , "01");
    bank.showMenu();
    sc.close();

  }
}
class BankAccount{
  int balance;
  int previousTransaction;
  String customerName;
  String customerId;

  BankAccount(String cname, String cid){            //constructor
    customerName = cname;
    customerId = cid;
  }

  void deposit(int amount){
    if(amount!=0){
      balance+=amount;
      previousTransaction = amount; 
    }
  }
  void withdraw(int amount){
    if(amount!=0){
      balance-=amount;
      previousTransaction = - amount;
    }
  }
  void getPreviousTransaction(){
    if(previousTransaction >0){
      System.out.println("Deposited :" +previousTransaction);
    }
    else if (previousTransaction <0){
      System.out.println("Withdraw :" +Math.abs(previousTransaction));
    }
    else{
      System.out.println("No transaction is occured");
    }
  }
  void showMenu(){
    char option = '\0';
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome "+customerName);
    System.out.println("Your ID is : " + customerId);
    System.out.println("You can perform following operations: ");
    System.out.println();
    System.out.println("A. Check Balance");
    System.out.println("B. Deposit");
    System.out.println("C. Withdraw");
    System.out.println("D. Previous Transaction ");
    System.out.println("E. Exit");

    do{
      System.out.println("===============");
      System.out.println("Enter the option");
      System.out.println("================");
      option = sc.next().charAt(0);

      switch(option){
        case '1':
        System.out.println("=============");
        System.out.println("Balance is: "+balance);
        System.out.println("================");
        System.out.println();
        break;

        case '2':
        System.out.println("=============");
        System.out.println("Enter the amount to be deposit");
        System.out.println("================");
        int amount = sc.nextInt();
        deposit(amount);
        System.out.println();
        break;

        case '3':
        System.out.println("=============");
        System.out.println("Enter the amount to withdraw");
        System.out.println("================");
        int amount2 = sc.nextInt();
        withdraw(amount2);
        break;

        case '4':
        System.out.println("=============");
        getPreviousTransaction();
        System.out.println("================");
        System.out.println();
        break;
        
        case '5':
        System.out.println("=============");
        break;

        default:
        System.out.println("Invalid option! Please try again");
        break;
      }
    }while (option!='E');
  }
}

    

    



 

