module plot {
    requires java.base;
    requires java.desktop;
    requires transitive math;
    requires core;
    requires slf4j.api;
    requires java.logging;
    requires java.prefs;
    requires java.sql;

    exports smile.plot;
    exports smile.swing;
}