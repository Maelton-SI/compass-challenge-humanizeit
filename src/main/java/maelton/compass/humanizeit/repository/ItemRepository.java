package maelton.compass.humanizeit.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import maelton.compass.humanizeit.exception.AppEntitySaveFailureException;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.util.JpaUtil;

import org.hibernate.exception.ConstraintViolationException;

public class ItemRepository {

    public static Item save(Item item) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
            return item;
        } catch(ConstraintViolationException e) {
            em.getTransaction().rollback();
            return findItem(item);
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new AppEntitySaveFailureException(item, e.getMessage());
        } finally {
            em.close();
        }
    }
    public static Item findItem(long itemId) {
        try(EntityManager em = JpaUtil.getEntityManager()) {
            em.getTransaction().begin();
                Item item = em.find(Item.class, itemId);
            em.getTransaction().commit();
            return findItem(item);
        }
    }

    public static Item findItem(Item item) {
        String clothingItemQuery = "SELECT i FROM ClothingItem i " +
                                    "WHERE i.type = ?1 AND " +
                                          "i.gender = ?2 AND " +
                                          "i.size = ?3 AND " +
                                          "i.unitOfMeasurement = ?4";

        String foodItemQuery = "SELECT i FROM FoodItem i " +
                                "WHERE i.type = ?1 AND " +
                                        "i.unitOfMeasurement = ?2";

        String personalHygieneItemQuery = "SELECT i FROM PersonalHygieneItem i " +
                                          "WHERE i.type = ?1 AND " +
                                                "i.unitOfMeasurement = ?2";

        try(EntityManager em = JpaUtil.getEntityManager()) {
            switch (item.getCategory()) {
                case CLOTHING:
                    ClothingItem clothingItem = (ClothingItem) item;
                    TypedQuery<ClothingItem> clothingQuery = em.createQuery(clothingItemQuery, ClothingItem.class);
                        clothingQuery.setParameter(1, clothingItem.getType());
                        clothingQuery.setParameter(2, clothingItem.getGender());
                        clothingQuery.setParameter(3, clothingItem.getSize());
                        clothingQuery.setParameter(4, clothingItem.getUnitOfMeasurement());
                    return clothingQuery.getSingleResult();
                case FOOD:
                    FoodItem foodItem = (FoodItem) item;
                    TypedQuery<FoodItem> foodQuery = em.createQuery(foodItemQuery, FoodItem.class);
                        foodQuery.setParameter(1, foodItem.getType());
                        foodQuery.setParameter(2, foodItem.getUnitOfMeasurement());
                    return foodQuery.getSingleResult();
                case PERSONAL_HYGIENE:
                    PersonalHygieneItem personalHygieneItem = (PersonalHygieneItem) item;
                    TypedQuery<PersonalHygieneItem> personalHygieneQuery = em.createQuery(personalHygieneItemQuery, PersonalHygieneItem.class);
                        personalHygieneQuery.setParameter(1, personalHygieneItem.getType());
                        personalHygieneQuery.setParameter(2,personalHygieneItem.getUnitOfMeasurement());
                    return personalHygieneQuery.getSingleResult();
                default:
                    return null;
            }
        } catch(NoResultException e) {
            return null;
        }
    }

    public static ClothingItem findClothingItemById(long id) {
        ClothingItem item = null;
        try(EntityManager em = JpaUtil.getEntityManager()) {
            em.getTransaction().begin();
                item = em.find(ClothingItem.class, id);
            em.getTransaction().commit();
        }
        return item;
    }

    public static FoodItem findFoodItemById(long id) {
        FoodItem item = null;
        try(EntityManager em = JpaUtil.getEntityManager()) {
            em.getTransaction().begin();
                item = em.find(FoodItem.class, id);
            em.getTransaction().commit();
        }
        return item;
    }

    public static PersonalHygieneItem findPersonalHygieneItemById(long id) {
        PersonalHygieneItem item = null;
        try(EntityManager em = JpaUtil.getEntityManager()) {
            em.getTransaction().begin();
                item = em.find(PersonalHygieneItem.class, id);
            em.getTransaction().commit();
        }
        return item;
    }
}
