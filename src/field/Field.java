package field;

public interface Field {
    String getValue();
    void createRule();
    Field clone();
}
