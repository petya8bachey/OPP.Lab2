package pic5.firm;

import lombok.Getter;
import lombok.Setter;
import pic5.contact.Contact;
import pic5.subfirm.SubFirm;
import pic6.field.*;

import java.util.ArrayList;
import java.util.HashMap;

@Setter
@Getter
public class Firm {
    NameField name;//Наименование фирмы
    CountryField country;//Страна
    RegionField region;//Регион (область)
    TownField town;//Город
    UsrField street;//Улица
    String postInx;//Почтовый индекс
    DateInField dateIn;//Дата ввода фирмы (начало взаимоотношений)
    String email;//Почтовый адрес фирмы
    UsrField web;//URL-адрес сайта
    ArrayList<SubFirm> sbFirms = new ArrayList<>();//Подразделения фирмы
    protected HashMap<String, String> usrFields;//Пользовательские поля

    public Firm () {
        FirmMngr.getInstance().add(this);
    }
    public void addCont(Contact contact) {
        getMain().addCont(contact);
    }
    public void addContToSubFirm(SubFirm subFirm, Contact contact) {
        subFirm.addCont(contact);
    }
    public void addField(String name, String description) {
        usrFields.put(name, description);
    }
    public void addSubFirm(SubFirm subFirm) {
        sbFirms.add(subFirm);
    }
    public boolean existContact(Contact contact) {
        for (SubFirm subFirm:sbFirms) {
            if(subFirm.existContact(contact)) {
                return true;
            }
        }
        return false;
    }
    public String getFields(String name) {
        return usrFields.get(name);}
    public SubFirm getMain() {
        for (SubFirm subFirm:sbFirms) {
            if(subFirm.getTpy().isMain()) {
                return subFirm;
            }
        }
        return null;}
    public void renameField(String oldName, String newName) {
        String value = getFields(oldName);
        usrFields.remove(oldName);
        usrFields.put(newName, value);
    }
    public void setField(String name, String value) {
        usrFields.put(name, value);

    }
}
