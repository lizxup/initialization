package com.example.mapper;

import com.example.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface NoticeMapper {

    /**
     * 新增
     * @param notice
     * @return
     */
    int insert(Notice notice);

    /**
     * 根据id更新
     * @param notice
     */
    void updateById(Notice notice);

    /**
     * 根据id删除
     * @param id
     */

    void deleteById(Integer id);

    /**
     * 查询id查询notice
     * @param id
     * @return
     */
    @Select("select * from `notice` where id = #{id}")
    Notice selectById(Integer id);

    /**
     * 查询所有notice
     * @param notice
     * @return
     */
    List<Notice> selectAll(Notice notice);
}
