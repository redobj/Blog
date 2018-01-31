package top.redobj.blog.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.redobj.blog.bean.Article;
import top.redobj.blog.bean.ArticleExample;
import top.redobj.blog.dao.ArticleMapper;
import top.redobj.blog.service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> allArticleSimple() {
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("article_time desc");
        List<Article> articles = articleMapper.selectByExampleWithClassify(example);

        if(articles != null && articles.size() > 0 ){
            return articles;
        }else {
            return null;
        }
    }

    public List<Article> allArticleSimpleByClassify(int classifyId) {
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("article_time desc");
        example.createCriteria().andArticleClassifyIdEqualTo(classifyId);
        List<Article> articles = articleMapper.selectByExampleWithClassify(example);
        if(articles != null && articles.size() > 0 ){
            return articles;
        }else {
            return null;
        }
    }

    public List<Article> getNewest(int num) {
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("article_time desc");
        example.createCriteria().andArticleUpEqualTo(true);
        example.setLimit(num);
        List<Article> articles = articleMapper.selectByExampleWithClassify(example);
        if(articles != null && articles.size() > 0 ){
            return articles;
        }else {
            return null;
        }
    }

    public Article ArticleById(int id) {
        return articleMapper.selectByPrimaryKeyWithClassify(id);
    }

    public void onclick(int id) {
        articleMapper.articleOnclick(id);
    }

    public void articleAdd(Article article) {
        articleMapper.insertSelective(article);
    }
}
