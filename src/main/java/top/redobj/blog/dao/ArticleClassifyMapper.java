package top.redobj.blog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.redobj.blog.bean.ArticleClassify;
import top.redobj.blog.bean.ArticleClassifyExample;

public interface ArticleClassifyMapper {
    long countByExample(ArticleClassifyExample example);

    int deleteByExample(ArticleClassifyExample example);

    int deleteByPrimaryKey(Integer classifyId);

    int insert(ArticleClassify record);

    int insertSelective(ArticleClassify record);

    List<ArticleClassify> selectByExample(ArticleClassifyExample example);

    ArticleClassify selectByPrimaryKey(Integer classifyId);

    int updateByExampleSelective(@Param("record") ArticleClassify record, @Param("example") ArticleClassifyExample example);

    int updateByExample(@Param("record") ArticleClassify record, @Param("example") ArticleClassifyExample example);

    int updateByPrimaryKeySelective(ArticleClassify record);

    int updateByPrimaryKey(ArticleClassify record);
}