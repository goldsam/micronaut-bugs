package example;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;

@Factory
public class AWithYFactory {
    @Bean
    @Requires(beans = {X.class, Y.class})
    public A a(X x, Y y) {
        return new A();
    }
}
