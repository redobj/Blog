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

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BlogInitializer.class, SpringContextConfig.class})
@WebAppConfiguration
public class MergeTest {
    @Autowired
    ArticleClassifyMapper mapper;

    @Autowired
    ArticleMapper articleMapper;

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
}
