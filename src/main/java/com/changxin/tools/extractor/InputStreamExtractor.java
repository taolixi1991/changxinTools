package com.changxin.tools.extractor;

import java.io.Closeable;
import java.io.Serializable;

public interface InputStreamExtractor extends Serializable, Closeable {

    void open();

    void close();

    void apply();
}
