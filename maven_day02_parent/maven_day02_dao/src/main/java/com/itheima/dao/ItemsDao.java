package com.itheima.dao;

import com.itheima.domain.Items;

public interface ItemsDao {
    public Items findById(Integer id);
    void updateById(Integer id);
    public void deleteById(Integer id);
}
