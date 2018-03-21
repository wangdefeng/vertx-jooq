/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.regular.tables.daos;


import generated.cf.async.regular.tables.Somethingwithoutjson;
import generated.cf.async.regular.tables.records.SomethingwithoutjsonRecord;

import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO;
import io.github.jklingsporn.vertx.jooq.completablefuture.async.AsyncCompletableFutureQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingwithoutjsonDao extends AbstractAsyncVertxDAO<SomethingwithoutjsonRecord, generated.cf.async.regular.tables.pojos.Somethingwithoutjson, Integer, CompletableFuture<List<generated.cf.async.regular.tables.pojos.Somethingwithoutjson>>, CompletableFuture<generated.cf.async.regular.tables.pojos.Somethingwithoutjson>, CompletableFuture<Integer>, CompletableFuture<Integer>> implements io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO<SomethingwithoutjsonRecord,generated.cf.async.regular.tables.pojos.Somethingwithoutjson,Integer> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param vertx the vertx instance
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingwithoutjsonDao(Configuration configuration, io.vertx.core.Vertx vertx, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.cf.async.regular.tables.pojos.Somethingwithoutjson.class, new AsyncCompletableFutureQueryExecutor<SomethingwithoutjsonRecord,generated.cf.async.regular.tables.pojos.Somethingwithoutjson,Integer>(vertx,delegate,generated.cf.async.regular.tables.pojos.Somethingwithoutjson::new, Somethingwithoutjson.SOMETHINGWITHOUTJSON, isMysql(configuration)), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.cf.async.regular.tables.pojos.Somethingwithoutjson object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Somethingwithoutjson>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING.in(values));
    }

    @Override
    protected java.util.function.Function<Object,Integer> keyConverter(){
        return lastId -> Integer.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).intValue());
    }
}
