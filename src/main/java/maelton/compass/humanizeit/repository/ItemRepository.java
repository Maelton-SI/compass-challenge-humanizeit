package maelton.compass.humanizeit.repository;

import jakarta.persistence.EntityManager;
import maelton.compass.humanizeit.exception.ObjectPersistenceException;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.util.JpaUtil;

public class ItemRepository {

    public static Item save(Item item) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
            return item;
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new ObjectPersistenceException(item, e.getMessage());
        } finally {
            em.close();
        }
    }

    public static void saveItemToLot(Long itemId, Long lotId) {}
}
