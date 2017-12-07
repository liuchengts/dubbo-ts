package dubbo.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.test.Demo2Service;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by apple on 2017/12/6.
 */
@Service
@Component
public class Demo2ServiceImpl implements Demo2Service {
    @Override
    public String in2() {
        return "index2";
    }
}
