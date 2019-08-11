package com.liang.aopxmltest;

/**
 * @author 梁思禹
 * @date Create in 17:442019/8/11
 */
public interface ProductDAO {
    /**
     *增
     */
    void save();

    /**
     * 查
     */
    String find();

    /**
     * 改
     */
    void update();

    /**
     * 删
     */
    void delete();
}
