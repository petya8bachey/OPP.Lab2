package field;

public class RegionField implements Field {
    String region;
    public RegionField(String region) {
        this.region = region;
    }
    @Override
    public String getValue() {
        return region;
    }

    @Override
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new RegionField(region);
    }
}
