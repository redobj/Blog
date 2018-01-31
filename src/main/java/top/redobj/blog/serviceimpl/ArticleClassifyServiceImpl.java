package top.redobj.blog.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.redobj.blog.bean.ArticleClassify;
import top.redobj.blog.bean.ArticleClassifyExample;
import top.redobj.blog.dao.ArticleClassifyMapper;
import top.redobj.blog.service.ArticleClassifyService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleClassifyServiceImpl implements ArticleClassifyService {
    @Autowired
    private ArticleClassifyMapper classifyMapper;

    public List<ArticleClassify> allClassify() {
        ArticleClassifyExample example = new ArticleClassifyExample();
        example.setOrderByClause("classify_parent asc");
        List<ArticleClassify> articleClassifies = classifyMapper.selectByExample(example);
        if(articleClassifies == null ||articleClassifies.size() <= 0){
            return null;
        }
        return articleClassifies;
    }


}
