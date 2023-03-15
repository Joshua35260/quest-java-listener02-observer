import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value, TransactionListener listener) {
        listener.onLoading();
        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                account.setTotal(account.getTotal() - value);
                listener.onComplete(account);
                } catch (Exception e) {
                    listener.onError(e);
                }
            }
        }, time);
    }
}
