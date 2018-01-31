package top.redobj.blog.service;

import top.redobj.blog.bean.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> blogComments();

    List<Comment> articleComments(int articleId);

}
