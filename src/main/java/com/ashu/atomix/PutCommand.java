package com.ashu.atomix;

import io.atomix.copycat.Command;

/**
 * Created by ashu on 18-4-3.
 */
public class PutCommand implements Command<Object> {
    private final Object key;
    private final Object value;

    public PutCommand(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object key() {
        return key;
    }

    public Object value() {
        return value;
    }
}
