package example;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;

@Factory
public class AWithoutYFactory {

    /**
     * The bean provided by this method should be resolved. 
     */
    @Bean
    @Requires(beans = X.class, missingBeans = Y.class)
    public A a(X x) {
        return new A();
    }
}
