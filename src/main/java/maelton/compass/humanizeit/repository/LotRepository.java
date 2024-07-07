package maelton.compass.humanizeit.repository;

import jakarta.persistence.EntityManager;
import maelton.compass.humanizeit.entity.Lot;
import maelton.compass.humanizeit.entity.item.Item;
import maelton.compass.humanizeit.util.JpaUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class LotRepository {

    public static void save(Lot<? extends Item> lot) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
                em.persist(lot);
            em.getTransaction().commit();
            UIUtil.entitySaved(lot);
        } catch(Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error saving lot.");
            System.out.println("Error: " + e.getMessage());
        } finally {
            em.close();
        }
    }
}
