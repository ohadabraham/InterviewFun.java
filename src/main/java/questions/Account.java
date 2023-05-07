package questions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Account {


    private String id;
    private Double amount;
    private String customerId;
}
