package field;

public class PostInxField implements Field {
    Integer index;
    public PostInxField(int index) {
        this.index = index;
    }
    @Override
    public String getValue() {
        return index.toString();
    }

    @Override
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new PostInxField(index);
    }
}
