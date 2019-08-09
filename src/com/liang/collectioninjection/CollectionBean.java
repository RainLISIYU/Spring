package com.liang.collectioninjection;

import java.util.*;

/**
 * @Author: 梁思禹
 * @Date: Create in 17:002019/8/9
 */
public class CollectionBean {
    @Override
    public String toString() {
        return "CollectionBean{" +
                "strs=" + Arrays.toString(strs) +
                ", list=" + list +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private String[] strs;
    private List<String> list;

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }
}
