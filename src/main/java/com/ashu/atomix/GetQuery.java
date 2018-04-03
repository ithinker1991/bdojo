package com.ashu.atomix;

import io.atomix.copycat.Query;

/**
 * Created by ashu on 18-4-3.
 */
public class GetQuery implements Query<Object> {
    private final Object key;


    public GetQuery(Object key) {
        this.key = key;
    }

    public Object key() {
        return key;
    }
}
