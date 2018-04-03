package com.ashu.atomix;

import io.atomix.copycat.server.Commit;
import io.atomix.copycat.server.StateMachine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashu on 18-4-3.
 */
public class MapStateMachine extends StateMachine {

    private Map<Object, Object> map = new HashMap<>();

    public void put(Commit<PutCommand> commit) {
        try {
            map.put(commit.operation().key(), commit.operation().value());
        } finally {
            commit.close();
        }
    }

    public Object get(Commit<GetQuery> commit) {
        try {
            return map.get(commit.operation().key());
        } finally {
            commit.close();
        }
    }


}
