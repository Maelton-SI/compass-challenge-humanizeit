package maelton.compass.humanizeit.repository;

import jakarta.persistence.EntityManager;
import maelton.compass.humanizeit.exception.AppEntityAlreadyExistsException;
import maelton.compass.humanizeit.exception.AppEntityPersistenceException;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.util.JpaUtil;
import org.hibernate.exception.ConstraintViolationException;

public class ItemRepository {

    public static Item save(Item item) throws AppEntityAlreadyExistsException {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
            return item;
        } catch(ConstraintViolationException e) {
            em.getTransaction().rollback();
            throw new AppEntityAlreadyExistsException(item, e.getCause().getMessage());
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new AppEntityPersistenceException(item, e.getMessage());
        } finally {
            em.close();
        }
    }

    public static void saveItemToLot(Long itemId, Long lotId) {}
}
