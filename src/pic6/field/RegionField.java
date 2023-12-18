package pic6.field;

import pic6.Field;

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
