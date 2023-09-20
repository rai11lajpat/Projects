import java.util.Scanner;
// Banck Aconut class  
class BanckAcount{
    private int initialDepsit;
    BanckAcount(int initialDepsit){
        this.initialDepsit=initialDepsit;
    }
    public void withdraw(int w){
        if(initialDepsit>=w){
            initialDepsit=initialDepsit-w;
            System.out.println(" Successfully done!");
            System.out.println(" Remaining Balance Rs="+initialDepsit);
        }
        else{
            System.out.println(" Transaction failed.");
            System.out.println(" Insficiant balance");
        }
    }
    public void deposit(int deposit){
        initialDepsit=initialDepsit+deposit;
        System.out.println(" Successfully done!");
        System.out.println(" New balance is Rs="+initialDepsit);
    }
    public void checkBalance(){
        System.out.println(" Acount Balance is Rs="+initialDepsit);
    }
}
//ATM class
public class ATM{
    BanckAcount userAcount;
    ATM(BanckAcount userAcount){
        this.userAcount=userAcount;
    }
    public void withdraw(int withdraw){
        userAcount.withdraw(withdraw);
    }
    public void deposit(int deposit){
        userAcount.deposit(deposit);

    }
    public void checkBalance(){
        userAcount.checkBalance();
    }  
    public static void main(String[] args) {
        System.out.println("|----------------------------|");
        System.out.println("       WELCOME TO ATM         ");
        Scanner sc=new Scanner(System.in);
        System.out.print("|Enter initial Deposit Rs:");
        int a=sc.nextInt();
        BanckAcount userAcount=new BanckAcount(a);
        ATM atm=new ATM(userAcount);
        int select=1;
        do{
            System.out.println("|----------------------------|");
            System.out.println("|1:Witdraw                   |");
            System.out.println("|2:Deposit                   |");
            System.out.println("|3:Balance check             |");
            System.out.println("|4:Exit                      |");
            System.out.println("|----------------------------|");
            System.out.print("|Select to Contine=");
            select=sc.nextInt();
            if(select==1||select==2||select==3){
                switch (select) {
                    case 1:
                        System.out.print("|Enter withdraw amount Rs:");
                        int w=sc.nextInt();
                        atm.withdraw(w);
                        break;
                    case 2:
                        System.out.print("|Enter Deposit amount Rs:");
                        int d=sc.nextInt();
                        atm.deposit(d);
                        break;
                    case 3:
                        atm.checkBalance();
                        break;    
                }
            }
            else if(select!=4){
                System.out.println(" Invalid");
            }  
        }while(select!=4);
        sc.close();
    }
}










