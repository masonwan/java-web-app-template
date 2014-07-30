package une.handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController implements IBaseController {
    Logger logger = null;

    BaseController() {
        logger = LogManager.getLogger(this.getClass());
    }
}
