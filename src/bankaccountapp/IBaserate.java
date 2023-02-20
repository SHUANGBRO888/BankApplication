package bankaccountapp;

public interface IBaserate {

    // Write a method that returns the baserate
    default double getBaseRate(){
        return 2.5;
    }
}
