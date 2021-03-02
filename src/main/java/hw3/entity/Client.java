package hw3.entity;

public class Client {
    private String userId;
    private String surname;
    private String accountId;
    private double sum;

    public Client(String userId, String surname, String accountId) {
        this.userId = userId;
        this.surname = surname;
        this.accountId = accountId;
        this.sum = 0;
    }

    public Client(String accountId) {
        this("one", "Public", accountId);
    }

    public String getAccountId() {
        return this.accountId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}