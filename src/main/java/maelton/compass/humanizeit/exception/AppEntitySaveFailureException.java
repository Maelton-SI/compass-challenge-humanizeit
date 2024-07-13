package maelton.compass.humanizeit.exception;

import maelton.compass.humanizeit.model.interfaces.AppEntity;
import maelton.compass.humanizeit.util.UIUtil;

public class AppEntitySaveFailureException extends RuntimeException {
    public AppEntitySaveFailureException(AppEntity entity, String message) {
        UIUtil.errorSavingEntity(entity);
        System.out.println(message);
    }
}
