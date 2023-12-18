package pic6.field;

import pic6.Field;

public class NameField implements Field {
    String name;
    public NameField(String name) {
        this.name = name;
    }
    @Override
    public String getValue() {
        return name;
    }

    @Override
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new NameField(name);
    }
}
