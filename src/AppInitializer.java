import entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitializer {
    public static void main(String[] args) {
        Item item1 = new Item("P001","13gen Intel i5",78000,12);
        Item item2 = new Item("P002","13gen Intel i7",100000,10);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(item1);
        transaction.commit();
        session.close();
    }
}
