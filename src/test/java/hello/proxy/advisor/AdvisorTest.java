package hello.proxy.advisor;

import hello.proxy.common.service.ServiceImpl;
import hello.proxy.common.service.ServiceInterface;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

public class AdvisorTest {


    @Test
    void advisorTest1() {
        ServiceInterface taget = new ServiceImpl();

    }

}
