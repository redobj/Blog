package top.redobj.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.redobj.blog.bean.Article;
import top.redobj.blog.bean.Msg;
import top.redobj.blog.service.ArticleService;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    ArticleService service;

    @ResponseBody
    @RequestMapping("/api/articles/articles")
    public Msg allArticleSimple(){
        List<Article> articles = service.allArticleSimple();
        return articles == null?Msg.fail():Msg.success().add("articles",articles);
    }

    @ResponseBody
    @RequestMapping("/api/articles/{classifyId}")
    public Msg articleSimpleByClassify(@PathVariable("classifyId")int classifyId){
        List<Article> articles = service.allArticleSimpleByClassify(classifyId);
        return articles == null?Msg.fail():Msg.success().add("articles",articles);
    }

    @ResponseBody
    @RequestMapping("/api/article/{id}")
    public Msg articleByPrimarykey(@PathVariable("id")int id){
        Article article = service.ArticleById(id);
        return article == null ?Msg.fail():Msg.success().add("article",article);
    }

    @ResponseBody
    @RequestMapping("/api/articles/top/{num}")
    public Msg articlesTop(@PathVariable("num") int num){
        List<Article> newest = service.getNewest(num);
        return newest == null?Msg.fail():Msg.success().add("articles",newest);
    }


    @ResponseBody
    @RequestMapping("/api/articles/onclick/{id}")
    public void articleOnclick(@PathVariable int id){
        service.onclick(id);
    }

    @ResponseBody
    @RequestMapping(value = "/api/article/{id}",method = RequestMethod.POST)
    public void articleAdd(Article article){
        service.articleAdd(article);
    }


}
