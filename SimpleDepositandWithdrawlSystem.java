package lab7;

import java.util.Scanner;

class date {
    private int day;
    private int month;
    private int year;

    public date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public void setday(int d) {
        this.day = d;
    }

    public void setmonth(int m) {
        this.month = m;
    }

    public void setyear(int y) {
        this.year = y;
    }

    public int getday() {
        return day;
    }

    public int getmonth() {
        return month;
    }

    public int getyear() {
        return year;
    }

}

public class SimpleDepositandWithdrawlSystem {
    private String name;
    private float balance;
    private date d1 = new date();

    public SimpleDepositandWithdrawlSystem() {
        this.name = "abc";
        this.balance = 0;
        d1.setday(0);
        d1.setmonth(0);
        d1.setyear(0);
    }

    public void SetName(String n) {
        this.name = n;
    }

    public void SetDate(int d, int m, int y) {
        d1.setday(d);
        d1.setmonth(m);
        d1.setyear(y);
    }

    public void DepositAmount(float amount) {
        balance = balance + amount;
        System.out.println("........Amount deposited Succesfully.......");
    }

    public void WithdrawAmount(float amount) {
        if (balance < amount) {
            System.out.println("OOPS!!!!! Your balance is less then withdrawl request....");
            System.out.println("Your available balance is:  " + balance);
        } else {
            balance = balance - amount;
            System.out.println(".......Withdrawl Succesfull.....");
        }
    }

    public void DisplayBalance() {
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + d1.getday() + " - " + d1.getmonth() + " - " + d1.getyear());
        System.out.println("Balance: " + balance + "$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam;
       SimpleDepositandWithdrawlSystem a1 = new SimpleDepositandWithdrawlSystem();
        int d;
        int m;
        int y;
        System.out.println("Please Enter your name: ");
        nam = sc.nextLine();
        a1.SetName(nam);

        while (true) {
            System.out.println("Please Enter your birth day: ");
            d = sc.nextInt();
            if (d < 0 || d > 31) {
                System.out.println("Please Enter Valid day");
            } else {
                break;
            }

        }
        while (true) {
            System.out.println("Please Enter your birth month: ");
            m = sc.nextInt();
            if (m < 0 || m > 12) {
                System.out.println("Please Enter Valid month");
            } else {
                break;
            }

        }

        while (true) {
            System.out.println("Please Enter your birth year: ");
            y = sc.nextInt();
            if (y < 0 || y > 2024) {
                System.out.println("Please Enter Valid year");
            } else {
                break;
            }

        }

        a1.SetDate(d, m, y);

        int choice;
        while (true) {
            System.out.println("Please Select from following: ");
            System.out.println("1. Display Balance");
            System.out.println("2.Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                a1.DisplayBalance();
            } else if (choice == 2) {
                float tempAmount;
                System.out.println("Please enter the amount you want to deposit: ");
                tempAmount = sc.nextFloat();
                a1.DepositAmount(tempAmount);
            } else if (choice == 3) {
                float tempAmount;
                System.out.println("Please enter the amount you want to withdraw: ");
                tempAmount = sc.nextFloat();
                a1.WithdrawAmount(tempAmount);

            } else if (choice == 4) {
                System.out.println("Thanks for using my software");
                break;
            } else {
                System.out.println("Please Enetr the valid choice");
            }

        }
        sc.close();

    }

}
