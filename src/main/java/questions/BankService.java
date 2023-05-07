package questions;

import java.util.HashMap;

public class BankService {

 //   Bank bank = new Bank("1", "newBank" , new HashMap<>());
/*
    public Double getBalance(int customerId) throws Exception {
        if (validateIfExists(customerId)) {
   //         return bank.getMap().get(customerId).getAmount();
        } else {
            throw new Exception("customerId does not exists");
        }
    }

    public Double deposit(int customerId, double amountToDeposit) throws Exception {
        if (validateIfExists(customerId)) {
            Account customerAccount = bank.getMap().get(customerId);

            //syncronize
          //  synchronized (Account);
                customerAccount.setAmount(customerAccount.getAmount() + amountToDeposit);
                bank.getMap().put(customerId,customerAccount);
         //   );

            return customerAccount.getAmount();
        }else {
            throw new Exception("customerId does not exists");
        }

    }

    public Double withdraw( int customerId , double amountToWithdraw ) throws Exception {
        if (validateIfExists (  customerId) ) {
            Account customerAccount = bank.getMap().get(customerId);


            //syncronize
         //   synchronized (Account
            if ( customerAccount.getAmount() < amountToWithdraw ) {
                throw new Exception("customer does not have enougth money");
            }
            double totalAmount = customerAccount.getAmount()-amountToWithdraw;

            customerAccount.setAmount(totalAmount);
         //   )
            return totalAmount;
        }
        else {
            throw new Exception("customerId does not exists");
        }
    }

    public void transfer( int customerIdFrom , int customerIdTo , double moneyToTransfer ) throws Exception {
        if ( validateIfExists (  customerIdFrom) && validateIfExists (  customerIdTo) ) {
            // check From has  enougth money
            Account customerAccountFrom = bank.getMap().get(customerIdFrom);
            Account customerAccountTo = bank.getMap().get(customerIdTo);

          //  synchronized ( customerAccountFrom)
           //     synchronized ( customerAccountTo)
            if  (customerAccountFrom.getAmount() >= moneyToTransfer ) {
                customerAccountFrom.setAmount(customerAccountFrom.getAmount()-moneyToTransfer);
                customerAccountTo.setAmount(customerAccountTo.getAmount()+moneyToTransfer);

            }else {
                throw new Exception("mo money");
            }

        }

    }
    private boolean validateIfExists ( int customerId) {
        if ( bank.getMap().containsKey(customerId) ) {
            return  true;
        }
        return false;
    }
*/

}
