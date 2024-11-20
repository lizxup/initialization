package com.example.service;
import com.example.entity.Notice;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import java.util.List;


public interface NoticeService {

    /**
     * 添加
     * @param notice
     */
    public void add(Notice notice);

    /**
     * 根据id更新
     * @param notice
     */
    public void updateById(Notice notice);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteById(Integer id);

    /**
     * 根据ids 批量删除 notice
     * @param ids
     */
    public void deleteBatch(List<Integer> ids);

    /**
     * 根据id查询notice
     * @param id
     * @return
     */
    public Notice selectById(Integer id);

    /**
     * 根据notice 的信息查询所有的notice
     * @param notice
     * @return
     */
    public List<Notice> selectAll(Notice notice);


    /**
     * 分页查询
     * @param notice
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Notice> selectPage(Notice notice, Integer pageNum, Integer pageSize);
}
