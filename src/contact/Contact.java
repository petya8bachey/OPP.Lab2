package contact;

import lombok.Getter;
import lombok.Setter;
import field.DateBegField;
import field.DateInField;

@Setter
@Getter
public class Contact {
    DateBegField beginDt; //Дата начала контакта
    DateInField endDt; //Дата завершения контакта
    String descr; //Описание контакта для себя
    String dataInfo; //Формулировка контакта для клиента
    ContType tpy; //Вид контакта

    public Contact() {    }
    public Contact clone() {
        Contact contact = new Contact();
        contact.beginDt = beginDt;
        contact.endDt = endDt;
        contact.descr = descr;
        contact.dataInfo = dataInfo;
        contact.tpy = tpy;
        return contact;
    }

}
