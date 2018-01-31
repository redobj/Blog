package top.redobj.blog.service;

import top.redobj.blog.bean.Article;

import java.util.List;

public interface ArticleService {

    List<Article> allArticleSimple();

    List<Article> allArticleSimpleByClassify(int classifyId);

    List<Article> getNewest(int num);

    Article ArticleById(int id);

    void onclick(int id);

    void articleAdd(Article article);
}
