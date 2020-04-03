package org.mybatis.example.pojo;

import java.util.List;

public class QueryVo {
    private User user;
    Integer[] ids;

    public Integer[] getIds() {
        return ids;
    }
    public void setIds(Integer[] ids) {
        this.ids = ids;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
