package dubbo.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.test.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2017/12/6.
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String in() {
        return "index";
    }
}
