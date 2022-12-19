module ktorm.core {
    requires transitive java.sql;
    requires transitive java.sql.rowset;
    requires transitive kotlin.stdlib;
    requires transitive kotlin.reflect;
    exports org.ktorm.database;
    exports org.ktorm.dsl;
    exports org.ktorm.entity;
    exports org.ktorm.expression;
    exports org.ktorm.logging;
    exports org.ktorm.schema;
}
