package structural.proxy;

public record TransactionalBankServiceProxy(
        BankService realService
        , TransactionManager txManager
) implements BankService {
    @Override
    public void transfer(TransferRequest request) {
        txManager.begin();
        try {
            realService.transfer(request);
            txManager.commit();
        } catch (Exception e) {
            txManager.rollback();
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
