/*
 * This file is generated by jOOQ.
 */
package generated.rx.async.guice.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;

import javax.annotation.Generated;


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
public interface ISomethingcomposite extends VertxPojo, Serializable {

    /**
     * Setter for <code>vertx.somethingComposite.someId</code>.
     */
    public ISomethingcomposite setSomeid(Integer value);

    /**
     * Getter for <code>vertx.somethingComposite.someId</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>vertx.somethingComposite.someSecondId</code>.
     */
    public ISomethingcomposite setSomesecondid(Integer value);

    /**
     * Getter for <code>vertx.somethingComposite.someSecondId</code>.
     */
    public Integer getSomesecondid();

    /**
     * Setter for <code>vertx.somethingComposite.someJsonObject</code>.
     */
    public ISomethingcomposite setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>vertx.somethingComposite.someJsonObject</code>.
     */
    public JsonObject getSomejsonobject();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomethingcomposite
     */
    public void from(generated.rx.async.guice.tables.interfaces.ISomethingcomposite from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomethingcomposite
     */
    public <E extends generated.rx.async.guice.tables.interfaces.ISomethingcomposite> E into(E into);

    @Override
    public default ISomethingcomposite fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("someId"));
        setSomesecondid(json.getInteger("someSecondId"));
        setSomejsonobject(json.getJsonObject("someJsonObject"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("someId",getSomeid());
        json.put("someSecondId",getSomesecondid());
        json.put("someJsonObject",getSomejsonobject());
        return json;
    }

}
