package vn.smartJob.demoSpring.annotationBasedAutowiring;

import java.util.Date;

/**
 * Account domain.
 *
 * @author SmartJob
 */
public class Account {

    private long id;
    private String ownerName;
    private double balance;
    private Date accessTime;
    private boolean locked;

    public Account() {

    }

    public Account(long id, String ownerName, double balance, Date accessTime, boolean locked) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
        this.accessTime = accessTime;
        this.locked = locked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

}
