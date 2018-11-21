module data {
    requires java.base;
    requires java.sql;
    requires slf4j.api;
    requires math;

    exports smile.data to core;
    exports smile.data.parser;
}