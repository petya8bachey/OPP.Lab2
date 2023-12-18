package field;

public class CountryField implements Field {
    String country;
    public CountryField(String country) {
        this.country = country;
    }
    @Override
    public String getValue() {
        return country;
    }

    @Override
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new CountryField(country);
    }
}
