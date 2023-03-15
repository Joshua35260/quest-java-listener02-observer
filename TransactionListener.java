public interface TransactionListener {
  
  void onLoading();

  void onComplete(Bank account);

  void onError(Exception e);
}
