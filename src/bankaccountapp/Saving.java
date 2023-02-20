package bankaccountapp;

public class Saving extends Account{

    // List common properties for saving accounts
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
   
    // Constructor to initialize saving account properties
   
    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" +accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
        System.out.println(safetyDepositBoxID);
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25;
    }

    // List any methods specific to the saving account
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Savings"+
                            "\nSafety Deposit Box ID: " + safetyDepositBoxID+
                            "\nSafety Deposit Box Key: " + safetyDepositBoxKey);
        super.showInfo();
    }
}
