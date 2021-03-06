/*
 * This file is generated by jOOQ.
 */
package generated.cf.reactive.guice.vertx.tables.daos;


import generated.cf.reactive.guice.vertx.tables.Somethingwithoutjson;
import generated.cf.reactive.guice.vertx.tables.records.SomethingwithoutjsonRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO;
import io.github.jklingsporn.vertx.jooq.completablefuture.reactivepg.ReactiveCompletableFutureQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingwithoutjsonDao extends AbstractReactiveVertxDAO<SomethingwithoutjsonRecord, generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson, Integer, CompletableFuture<List<generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson>>, CompletableFuture<generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson>, CompletableFuture<Integer>, CompletableFuture<Integer>> implements io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO<SomethingwithoutjsonRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson,Integer> {
    @javax.inject.Inject

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SomethingwithoutjsonDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate, io.vertx.core.Vertx vertx) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson.class, new ReactiveCompletableFutureQueryExecutor<SomethingwithoutjsonRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson,Integer>(configuration,delegate,generated.cf.reactive.guice.vertx.tables.mappers.RowMappers.getSomethingwithoutjsonMapper(),vertx));
    }

    @Override
    protected Integer getId(generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson>> findManyBySomestring(Collection<String> values) {
        return findManyByCondition(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING.in(values));
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously limited by the given limit
     */
    public CompletableFuture<List<generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson>> findManyBySomestring(Collection<String> values, int limit) {
        return findManyByCondition(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING.in(values),limit);
    }

    @Override
    public ReactiveCompletableFutureQueryExecutor<SomethingwithoutjsonRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson,Integer> queryExecutor(){
        return (ReactiveCompletableFutureQueryExecutor<SomethingwithoutjsonRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson,Integer>) super.queryExecutor();
    }
}
