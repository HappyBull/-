package dayExercises;

public class Question2043 {
    long[] userMoneys;

    public Question2043(long[] balance) {
        userMoneys = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (userMoneys == null || account1 < 0 || account2 < 0
                || account1 > userMoneys.length || account2 > userMoneys.length
                || account2 > userMoneys.length || money < 0) {
            return false;
        }

        if (money > userMoneys[account1 - 1]) {
            return false;
        }

        userMoneys[account1 - 1] -= money;
        userMoneys[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account < 0 || money < 0 || account > userMoneys.length) {
            return false;
        }
        userMoneys[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account < 0 || money < 0 || account > userMoneys.length) {
            return false;
        }

        if (userMoneys[account - 1] < money) {
            return false;
        }
        userMoneys[account - 1] -= money;
        return true;
    }
}
