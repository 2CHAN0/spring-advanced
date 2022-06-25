package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        Component realComponent = new RealComponent();
        DecoratorPatterClient decoratorPatterClient = new DecoratorPatterClient(realComponent);
        decoratorPatterClient.execute();
    }

    @Test
    void decorator1() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatterClient decoratorPatterClient = new DecoratorPatterClient(messageDecorator);
        decoratorPatterClient.execute();
    }

    @Test
    void decorator2() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        Component timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatterClient decoratorPatterClient = new DecoratorPatterClient(timeDecorator);
        decoratorPatterClient.execute();
    }
}
