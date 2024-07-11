package maelton.compass.humanizeit.exception;

import maelton.compass.humanizeit.model.interfaces.AppEntity;
import maelton.compass.humanizeit.util.UIUtil;

public class AppEntityAlreadyExistsException extends Exception {
    private final String message;

    public String getMessage() {
        return message;
    }

    public AppEntityAlreadyExistsException(AppEntity entity, String message) {
        this.message = UIUtil.errorSavingEntity(entity) + "\n" + "Entity already exists!";
    }
}
