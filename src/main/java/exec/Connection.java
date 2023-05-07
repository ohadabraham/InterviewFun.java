package exec;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Connection {

    private String id;
    private boolean taken=false;

}
