package dubbo.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.test.DemoService;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by apple on 2017/12/6.
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {
  static Logger logger=Logger.getLogger(DemoServiceImpl.class.getName());
    @Override
    public String in() {
        logger.info("in()响应调用");
        return "index";
    }
}
