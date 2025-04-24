package structural.proxy;

public class RealBankService implements BankService {
    public void transfer(TransferRequest request) {
        System.out.println("Transferring $" + request.amount() +
                " from " + request.fromAccount() + " to " + request.toAccount());
        if (request.amount() > 1000) {
            throw new RuntimeException("Transfer amount too high!");
        }
    }
}

