package io.github.jklingsporn.vertx.jooq.generate.completablefuture.reactive.guice;

import io.github.jklingsporn.vertx.jooq.generate.AbstractVertxGeneratorTest;
import io.github.jklingsporn.vertx.jooq.generate.PostgresConfigurationProvider;
import io.github.jklingsporn.vertx.jooq.generate.VertxGeneratorStrategy;
import io.github.jklingsporn.vertx.jooq.generate.completablefuture.CompletableFutureReactiveGuiceVertxGenerator;

/**
 * Created by jklingsporn on 17.09.16.
 */
public class GeneratorTest extends AbstractVertxGeneratorTest{


    public GeneratorTest() {
        super(CompletableFutureReactiveGuiceVertxGenerator.class, VertxGeneratorStrategy.class,"cf.reactive.guice", PostgresConfigurationProvider.getInstance());
    }

}
