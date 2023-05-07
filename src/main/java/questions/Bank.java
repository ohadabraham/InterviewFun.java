package questions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
public class Bank {

    private String id;
    private String name;

    // list of customerId point to account
    private HashMap <Integer,Account> map = new HashMap<>();
}
