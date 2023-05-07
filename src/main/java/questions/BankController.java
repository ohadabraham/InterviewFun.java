package questions;

import lombok.RequiredArgsConstructor;

//@RestController
//@RequestMapping ( "/bank/actions")
@RequiredArgsConstructor
public class BankController {


 //   private final BankService bankService;

   // @PostMapping ( "/balance")
    private Double getBalance( int customerId ) throws Exception {
        return null;//bankService.getBalance(customerId);
    }
//    @PostMapping ( "/deposit")

    private Double deposit( int customerId , double amountToDeposit ) {
        return null;
        //bankService.deposit(customerId,amountToDeposit);
    }
 //   @PostMapping ( "/withdraw")

    private Double withdraw( int customerId , double amountToWithdraw ) {
        return null;//bankService.withdraw(customerId,amountToWithdraw);
    }
  //  get_balance(user_id: str)

 //   deposit(user_id: str, amount: Balance)  -> Bool

  //  withdraw(user_id: str, amount: Balance) -> bool
}
