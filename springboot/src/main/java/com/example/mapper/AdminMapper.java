package com.example.mapper;
import com.example.entity.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;



@Mapper
public interface AdminMapper {


    /**
     * 插入 管理管
     * @param admin
     * @return
     */
    int insert(Admin admin);

    /**
     * 根据管理员查询 （可以模糊查询）
     * @param admin
     * @return
     */
    List<Admin> selectAll(Admin admin);


    /**
     * 通过id查询
     * @param admin
     */
    void updateById(Admin admin);

    /**
     * 通过id删除
     * @param id
     */
    @Delete("delete from admin where id = #{id}")
    void deleteById(Integer id);

    /**
     * 根据id查询管理员
     * @param id
     * @return
     */
    @Select("select * from admin where id = #{id}")
    Admin selectById(Integer id);

    /**
     * 根据用户名查询管理员
     * @param username
     * @return
     */
    @Select("select * from admin where username = #{username}")
    Admin selectByUsername( String username);
}
