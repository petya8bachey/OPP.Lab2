package field;

public class CountContField implements Field {
    Integer count;
    public CountContField(int count) {
        this.count = count;
    }
    @Override
    public String getValue() {
        return count.toString();
    }

    @Override
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new CountContField(count);
    }
}
