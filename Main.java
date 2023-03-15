public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);

          // TODO : create and use a TransactionListener interface with onComplete method

        TransactionListener listener = new TransactionListener() {
            @Override
            public void onLoading() {
                System.out.println("Loading...");
            }

            @Override
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }

            @Override
            public void onError(Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
    
        };
        Transactions.withdraw(account, 300, listener);
    }
}

