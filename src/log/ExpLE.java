package log;

import field.Field;

public class ExpLE implements ILogExp {
    @Override
    public boolean compare(Field field, String value) {
        return Integer.parseInt(field.getValue()) < Integer.parseInt(value);
    }
}
