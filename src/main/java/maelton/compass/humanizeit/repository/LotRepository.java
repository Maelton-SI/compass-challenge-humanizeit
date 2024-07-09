package maelton.compass.humanizeit.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import maelton.compass.humanizeit.model.entity.Lot;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.JpaUtil;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.List;

public class LotRepository {

    public static void save(Lot<? extends Item> lot) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
                em.persist(lot);
            em.getTransaction().commit();
            UIUtil.entitySaved(lot);
            ConsoleUtil.getInput();
        } catch(Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error saving lot.");
            System.out.println("Error: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public static List<Lot> findOpenLots() {
        List<Lot> openLots;
        try(EntityManager em = JpaUtil.getEntityManager()) {
            TypedQuery<Lot> query = em.createQuery("SELECT l FROM Lot l WHERE l.status='OPEN'", Lot.class);
            openLots = query.getResultList();
        }
        return openLots;
    }

    public static Lot<? extends Item> findOpenLotById(Long id) {
        List<Lot> openLots = findOpenLots();
        Lot<? extends Item> lot = null;
        if(!openLots.isEmpty()) {
            try(EntityManager em = JpaUtil.getEntityManager()) {
                em.getTransaction().begin();
                lot = em.find(Lot.class, id);
                em.getTransaction().commit();
            }
        }
        return lot;
    }

    public static List<Lot> findAll() {
        List<Lot> lots;
        try(EntityManager em = JpaUtil.getEntityManager()) {
            TypedQuery<Lot> query = em.createQuery("SELECT l FROM Lot l", Lot.class);
            lots = query.getResultList();
        }
        return lots;
    }
}
