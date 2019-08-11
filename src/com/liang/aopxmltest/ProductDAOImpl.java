package com.liang.aopxmltest;

/**
 * @author 梁思禹
 * @date Create in 17:452019/8/11
 */
public class ProductDAOImpl implements ProductDAO {

    @Override
    public void save() {
        System.out.println("保存了");
    }

    @Override
    public String find() {
        System.out.println("找到了");
        return "后置通知返回的信息";
    }

    @Override
    public void update() {

        System.out.println("更新了");
        /*int i = 1/0;*/
    }

    @Override
    public void delete(){
        System.out.println("删除了");
    }
}
