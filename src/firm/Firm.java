package firm;

import lombok.Getter;
import lombok.Setter;
import contact.Contact;
import field.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
@Setter
@Getter
public class Firm extends JPanel {
    //Field name;//Наименование фирмы
    Field country;//Страна
    Field region;//Регион (область)
    Field town;//Город
    Field street;//Улица
    Field postInx;//Почтовый индекс
    Field dateIn;//Дата ввода фирмы (начало взаимоотношений)
    String email;//Почтовый адрес фирмы
    Field web;//URL-адрес сайта
    ArrayList<Contact> contacts = new ArrayList<>();
    ArrayList<Field> usrFields = new ArrayList<>();//Пользовательские поля

    protected Firm () {}
    public void addField(Field field) {
        usrFields.add(field);
    }
    public boolean existContact(Contact contact) {
        return contacts.contains(contact);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillOval(100, 100, 100, 100);
    }
}
