package une.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@ResponseBody
public class IndexController extends BaseController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Test hello() {
        logger.info("Hello world");
        return new Test();
    }

    static class Test {
        public String message = "Hello world";
    }
}
