package bankaccountapp;

public abstract class Account implements IBaserate{
    
    // List common properties for savings and checking accounts
    private String name;
    private String sSN;
    protected String accountNumber;

    static int index = 10000;

    private double balance;
    protected double rate;
    
    // Constructor to set base properties and initialize the account

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
           
        // Set account number
        index++;
        this.accountNumber =setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest: $ " + accruedInterest);
    }

    // List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    
    public void transfer(String towhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + towhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: $ " + balance);
        printBalance();
    }

    




    public void showInfo(){
        System.out.println("NAME: "+name
                            +"\nSSN: "+sSN
                            +"\nBALANCE: $ "+balance
                            +"\nRATE: "+rate+"%");
    }




}
