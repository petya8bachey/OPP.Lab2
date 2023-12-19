package test;

import field.CountryField;
import field.Field;
import field.NameField;
import firm.Firm;
import firm.FirmMngr;
import log.LogExpEnum;
import org.junit.jupiter.api.Test;
import rule.FilterContr;
import rule.FilterRule;
import rule.str.NameRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseTest {
    @Test
    public void FirmConstructor() {
        final Field value = new CountryField("name");

        FirmMngr mngr = new FirmMngr();
        Firm firm = mngr.newFirm();

        firm.setCountry(value);
        Field result = firm.getCountry();

        assertEquals(value, result);
        assertTrue(mngr.getFirmList().contains(firm));
    }
}
