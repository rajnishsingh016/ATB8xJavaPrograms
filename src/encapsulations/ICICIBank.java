package encapsulations;

public class ICICIBank {
    private String username;
    private String balance;

    public ICICIBank(String username, String balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance,boolean isAdmin) {
        if (isAdmin) {
            this.balance = balance;
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed");
        }

    }
}
