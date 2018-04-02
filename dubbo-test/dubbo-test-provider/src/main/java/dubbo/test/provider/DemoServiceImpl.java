package dubbo.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.test.DemoService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

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

    @Override
    public Map<String, Object> getMap() {
        Map<String, Object> map=new HashMap<>();
        map.put("1",11);
        map.put("2",22);
        return map;
    }
}
