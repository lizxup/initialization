package com.example.service;

import com.example.entity.Account;
import com.example.entity.Admin;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层 接口
 */
public interface AdminService {

    /**
     * 添加管理员
     * @param admin
     */
    public void add(Admin admin);

    /**
     * 根据id查询管理员
     * @param id
     * @return
     */
    public Admin selectById(Integer id);

    /**
     * 根据管理员的信息查询所有的管理员
     * @param admin
     * @return
     */
    public List<Admin> selectAll(Admin admin);

    /**
     * 分页查询管理员
     * @param admin
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Admin> selectPage(Admin admin , Integer pageNum, Integer pageSize);


    /**
     * 根据id更新管理员
     * @param admin
     */
    void updateById(Admin admin);


    /**
     * 根据id删除管理员
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据ids 批量删除管理员
     * @param ids
     */
    void deleteBatch(List<Integer> ids);

    /**
     * 登录
     * @param account
     * @return
     */
    Account login(Account account);


    /**
     * 更改密码
     * @param account
     */
    void updatePassword(Account account);
}
