module nlp {
    requires java.base;
    requires slf4j.api;
    requires math;

    exports smile.nlp.collocation;
    exports smile.nlp.dictionary;
    exports smile.nlp.keyword;
    exports smile.nlp.normalizer;
    exports smile.nlp.pos;
    exports smile.nlp.relevance;
    exports smile.nlp.stemmer;
    exports smile.nlp.tokenizer;
}