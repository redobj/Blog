package top.redobj.blog.controller.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.redobj.blog.bean.Article;
import top.redobj.blog.bean.Msg;
import top.redobj.blog.service.ArticleService;
import top.redobj.blog.util.Utils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    ArticleService service;

    @ResponseBody
    @RequestMapping("/api/articles/articles/{pn}")
    public Msg allArticleSimple(@PathVariable("pn") int pn , @RequestParam(value = "row",defaultValue = "5")int row){
        PageHelper.startPage(pn,row);
        List<Article> articles = service.allArticleSimple();
        PageInfo<Article> page = new PageInfo<Article>(articles);
        return articles == null?Msg.fail():Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping("/api/articles/{classifyId}/{pn}")
    public Msg articleSimpleByClassify(@PathVariable("classifyId")int classifyId, @PathVariable("pn") int pn , @RequestParam(value = "row",defaultValue = "5")int row){
        PageHelper.startPage(pn,row);
        List<Article> articles = service.allArticleSimpleByClassify(classifyId);
        PageInfo<Article> page = new PageInfo<Article>(articles);
        return articles == null?Msg.fail():Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping("/api/article/{id}")
    public Msg articleByPrimarykey(@PathVariable("id")int id ){
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
    @RequestMapping(value = "/api/article",method = RequestMethod.POST)
    public void articleAdd(Article article, HttpServletRequest request){
        try {
            article.setArticleIp(Utils.getIpAddr(request));
            article.setArticleContent(Utils.articleChangeHelper(Utils.CHANGE_MODE.READ,article.getArticleContent()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.articleAdd(article);
    }

    @ResponseBody
    @RequestMapping(value = "/api/articles/search")
    public Msg articleSearch(String articleName,@RequestParam(value = "pn",defaultValue = "1") int pn,@RequestParam(value = "row",defaultValue = "10") int row){
        PageHelper.startPage(pn,row);
        List<Article> articles = service.searchArticle(articleName);
        PageInfo<Article> pageinfo = new PageInfo<>(articles);
        if (articles == null || articles.size() <= 0){
            return Msg.fail();
        }
        else{
            return Msg.success().add("pageInfo",pageinfo);
        }
    }



}
