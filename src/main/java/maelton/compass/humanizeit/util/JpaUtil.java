package maelton.compass.humanizeit.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("humanizeit");

    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
