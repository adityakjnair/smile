
module core {
    requires java.base;
    requires data;
    requires transitive math;
    requires graph;
    requires slf4j.api;


    exports smile.association;
    exports smile.classification;
    exports smile.clustering;
    exports smile.feature;
    exports smile.gap;
    exports smile.imputation;
    exports smile.manifold;
    exports smile.mds;
    exports smile.neighbor;
    exports smile.projection;
    exports smile.regression;
    exports smile.sampling;
    exports smile.sequence;
    exports smile.taxonomy;
    exports smile.util;
    exports smile.validation;
    exports smile.vq;
    exports smile.wavelet;
}