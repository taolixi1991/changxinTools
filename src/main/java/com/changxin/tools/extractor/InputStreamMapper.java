package com.changxin.tools.extractor;

import java.io.InputStream;
import java.util.Iterator;
import java.util.function.Function;

@FunctionalInterface
public interface InputStreamMapper<T> extends Function<InputStream, Iterator<T>> {
}
