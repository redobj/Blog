package top.redobj.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.redobj.blog.bean.ArticleClassify;
import top.redobj.blog.bean.Msg;
import top.redobj.blog.service.ArticleClassifyService;

import java.util.List;

@Controller
public class ArticleClassifyController {
    @Autowired
    ArticleClassifyService service;

    @ResponseBody
    @RequestMapping("/api/classify/classifies")
    public Msg classifies() {
        List<ArticleClassify> classifies = service.allClassify();
        return classifies == null ? Msg.fail() : Msg.success().add("classifies", classifies);
    }

}
