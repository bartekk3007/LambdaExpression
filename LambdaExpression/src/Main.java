import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Person("Andrzej", "Kowalski", 30));
        personArray.add(new Person("Bartek", "Kołakowski", 40));
        personArray.add(new Person("Cezary", "Dębowski", 35));
        personArray.add(new Person("Cezary", "Akacjowy", 32));
        personArray.add(new Person("Cezary", "Szczęsny", 30));
        personArray.sort((person1, person2) -> person1.getSurname().compareTo(person2.getSurname()));
        for (Person person : personArray)
        {
            System.out.println(person);
        }
    }
}