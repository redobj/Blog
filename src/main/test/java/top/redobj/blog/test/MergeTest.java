package top.redobj.blog.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import top.redobj.blog.bean.Article;
import top.redobj.blog.bean.ArticleClassify;
import top.redobj.blog.config.BlogInitializer;
import top.redobj.blog.config.SpringContextConfig;
import top.redobj.blog.dao.ArticleClassifyMapper;
import top.redobj.blog.dao.ArticleMapper;
import top.redobj.blog.service.ArticleService;
import top.redobj.blog.util.Utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BlogInitializer.class, SpringContextConfig.class})
@WebAppConfiguration
public class MergeTest {
    @Autowired
    ArticleClassifyMapper mapper;

    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    ArticleService articleService;

    @Test
    public void test01() {
        List<ArticleClassify> classifies = mapper.selectByExample(null);
        System.out.println(JSON.toJSONString(classifies));

    }

    @Test
    public void test02(){
        List<Article> articles = articleMapper.selectByExampleWithClassify(null);
        for(Article a:articles){
            System.out.println(a.getClassifyName());
        }
    }

    @Test
    public void test03(){
        //https://blog.theredwater.xin/images/blog/
        Map<Integer,String> maps = new HashMap<Integer, String>();
        List<Map<Integer,String>> imgs = new ArrayList<Map<Integer, String>>();
        maps.put(1,"article/2018/01/swSqvz9N2qQKVHnu.png");
        imgs.add(maps);
        System.out.println(JSON.toJSONString(imgs));
    }

    @Test
    public void test04(){
        System.out.println(new Date().getTime());
    }

    @Test
    public void test05() throws UnknownHostException {
        Article article = new Article();
        article.setArticleIp(InetAddress.getLocalHost().getHostAddress());
        article.setArticleClassifyId(10);
        article.setArticleTime(new Date().getTime());
        article.setArticleTitle("为什么要关心Java8");
        article.setArticleContent(
        Utils.articleChangeHelper(Utils.CHANGE_MODE.READ,"以下是从本章学到的关键概念：\n" +
                "\n" +
                "1、语言生态系统的思想，以及语言面临的“要么改变，要么衰亡”的压力。虽然Java可能现在非常有活力，但你可以回忆以下其他曾经也有活力但未能及时改进的语言的命运，如COBOL。\n" +
                "\n" +
                "2、Java8中新增的核心内容提供了令人激动的新概念和功能，方便我们编写既有效又简洁的程序。\n" +
                "\n" +
                "3、现有的Java编程实践并不能很好地利用多核处理器。\n" +
                "\n" +
                "4、函数是一等值：记得方法如何座位函数式值来传递，还有Lambda是怎样写的。\n" +
                "\n" +
                "5、Java8中Streams的概念使得Collections的许多方面得以推广，让代码更为易读，并允许并行处理流元素。\n" +
                "\n" +
                "6、可以在接口中使用默认方法，在实现类没有实现方法时提供方法内容。\n" +
                "\n" +
                "7、其他来自函数式编程的有趣思想，包括处理null和使用模式匹配。"));
        article.setAuthorId(1);
        article.setArticleType(true);
        article.setArticleUp(true);

        articleService.articleAdd(article);
    }
}
