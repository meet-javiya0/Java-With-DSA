public class AccessModifiers
{
    public static void main(String args[])
    {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "MeetJaviya";
        myAcc.setPassword("abcde@1234");
    }
}
class BankAccount {
    public String username;
    // private String password;
    public String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}