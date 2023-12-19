package firm;

import field.Field;

import java.util.ArrayList;

public  class FirmVw {
    protected FirmVw() {}
    ArrayList<Field> fields = new ArrayList<>();
    public void addField(Field field) {
        fields.add(field);
    }
}
