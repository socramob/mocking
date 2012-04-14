package org.socramob.mock.database;

import java.util.*;

public interface Database {

    void execute(String sql);
    void executePrepared(String sql, List<?> params);

}
