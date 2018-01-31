package top.redobj.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.redobj.blog.bean.Comment;
import top.redobj.blog.bean.Msg;
import top.redobj.blog.service.CommentService;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    CommentService service;

    @ResponseBody
    @RequestMapping("/api/comments")
    public Msg blogComments(){
        List<Comment> comments = service.blogComments();
        return comments == null ? Msg.fail():Msg.success().add("comments",comments);
    }

    @ResponseBody
    @RequestMapping("/api/comments/{articleId}")
    public Msg comments(@PathVariable("articleId") int articleId){
        List<Comment> comments = service.articleComments(articleId);
        return comments == null ? Msg.fail():Msg.success().add("comments",comments);
    }
}
