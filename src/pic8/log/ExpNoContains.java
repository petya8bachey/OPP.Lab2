package pic8.log;

import pic8.ILogExp;

public class ExpNoContains implements ILogExp {
    @Override
    public boolean compare() {
        return false;
    }
}
