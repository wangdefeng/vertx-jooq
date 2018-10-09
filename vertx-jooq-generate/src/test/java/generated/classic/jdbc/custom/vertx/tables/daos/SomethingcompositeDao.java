/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.custom.vertx.tables.daos;


import generated.classic.jdbc.custom.vertx.tables.Somethingcomposite;
import generated.classic.jdbc.custom.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;


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
public class SomethingcompositeDao extends AbstractVertxDAO<SomethingcompositeRecord, generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Future<List<generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite>>, Future<generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite>, Future<Integer>, Future<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingcompositeRecord,generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SomethingcompositeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite.class, new JDBCClassicQueryExecutor<SomethingcompositeRecord,generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite.class,vertx));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite object) {
        return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
    }

    /**
     * Find records that have <code>SOMESECONDID IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite>> findManyBySomesecondid(List<Integer> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
    }

    /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
    }

    @Override
    public JDBCClassicQueryExecutor<SomethingcompositeRecord,generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
        return (JDBCClassicQueryExecutor<SomethingcompositeRecord,generated.classic.jdbc.custom.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
    }
}
