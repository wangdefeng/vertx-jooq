/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.guice.vertx.tables.daos;


import generated.classic.jdbc.guice.vertx.tables.Something;
import generated.classic.jdbc.guice.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingDao extends AbstractVertxDAO<SomethingRecord, generated.classic.jdbc.guice.vertx.tables.pojos.Something, Integer, Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>>, Future<generated.classic.jdbc.guice.vertx.tables.pojos.Something>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer> {
    @javax.inject.Inject

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SomethingDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(Something.SOMETHING, generated.classic.jdbc.guice.vertx.tables.pojos.Something.class, new JDBCClassicQueryExecutor<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer>(configuration,generated.classic.jdbc.guice.vertx.tables.pojos.Something.class,vertx));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.classic.jdbc.guice.vertx.tables.pojos.Something object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>SOMESTRING IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
    }

    /**
     * Find records that have <code>SOMEHUGENUMBER IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomehugenumber(List<Long> values) {
        return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
    }

    /**
     * Find records that have <code>SOMESMALLNUMBER IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomesmallnumber(List<Short> values) {
        return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
    }

    /**
     * Find records that have <code>SOMEREGULARNUMBER IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomeregularnumber(List<Integer> values) {
        return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
    }

    /**
     * Find records that have <code>SOMEBOOLEAN IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomeboolean(List<Boolean> values) {
        return findManyByCondition(Something.SOMETHING.SOMEBOOLEAN.in(values));
    }

    /**
     * Find records that have <code>SOMEDOUBLE IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomedouble(List<Double> values) {
        return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
    }

    /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
    }

    /**
     * Find records that have <code>SOMEJSONARRAY IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomejsonarray(List<JsonArray> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
    }

    /**
     * Find records that have <code>SOMETIMESTAMP IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySometimestamp(List<LocalDateTime> values) {
        return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
    }

    @Override
    public JDBCClassicQueryExecutor<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer> queryExecutor(){
        return (JDBCClassicQueryExecutor<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer>) super.queryExecutor();
    }
}
