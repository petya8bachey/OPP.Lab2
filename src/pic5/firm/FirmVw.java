package pic5.firm;

import pic6.Field;

import java.util.ArrayList;

public  class FirmVw {
    public FirmVw() {
        FirmMngr.getInstance().add(this);
    }
    ArrayList<Field> fields = new ArrayList<>();
    public void addField(Field field) {
        fields.add(field);
    }
}
