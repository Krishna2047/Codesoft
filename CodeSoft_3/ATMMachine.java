import java.util.Scanner;
class ATM{
    private double balance;

    public  ATM(){
        this.balance = 00.00;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
            System.out.println("Successfully deposit amount"+amount);
        } else if (amount<=0) {
            System.out.println("invalid input");
        }else{
            System.out.println("deposit amount must be positive");
        }
    }

    public void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("insufficient amount entered");
        } else if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdraw successfully the current balance is "+this.balance);
        }
    }

    public void balance(){
        System.out.println("Balance is "+this.balance);
    }

    public static class main{
        public static void main(String[] args){
            ATM atm = new ATM();
            Scanner scan = new Scanner(System.in);
            int choise;
            do{
                System.out.println("\nATM Menu:");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choise = scan.nextInt();

                switch (choise){
                    case 1:
                        System.out.println("Enter the amount to deposit");
                        double deposit = scan.nextInt();
                        atm.deposit(deposit);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw");
                        double withdraw = scan.nextDouble();
                        atm.withdraw(withdraw);
                        break;
                    case 3:
                        atm.balance();
                        break;
                    case 4:
                        System.out.println("Exiting....");
                    default:
                        System.out.println("unable to access the atm");
                }

            }while(choise!=4);
            scan.close();
        }
    }
}
