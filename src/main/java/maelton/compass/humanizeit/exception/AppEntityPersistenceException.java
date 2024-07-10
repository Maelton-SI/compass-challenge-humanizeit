package maelton.compass.humanizeit.exception;

import maelton.compass.humanizeit.model.interfaces.AppEntity;
import maelton.compass.humanizeit.util.UIUtil;

public class AppEntityPersistenceException extends RuntimeException {
    public AppEntityPersistenceException(AppEntity entity, String message) {
        UIUtil.errorSavingEntity(entity);
        System.out.println(message);
    }
}
