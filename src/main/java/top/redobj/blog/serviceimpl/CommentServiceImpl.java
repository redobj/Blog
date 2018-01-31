package top.redobj.blog.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.redobj.blog.bean.Comment;
import top.redobj.blog.bean.CommentExample;
import top.redobj.blog.dao.CommentMapper;
import top.redobj.blog.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentMapper commentMapper;


    public List<Comment> blogComments() {
        CommentExample example = new CommentExample();
        example.setOrderByClause("comment_time asc");
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andCommentArticleIdEqualTo(0);
        List<Comment> comments = commentMapper.selectByExample(example);
        if(comments != null && comments.size() > 0){
            return comments;
        }else{
            return null;
        }
    }

    public List<Comment> articleComments(int articleId) {
        CommentExample example = new CommentExample();
        example.setOrderByClause("comment_time asc");
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andCommentArticleIdEqualTo(articleId);
        List<Comment> comments = commentMapper.selectByExample(example);
        if(comments != null && comments.size() > 0){
            return comments;
        }else{
            return null;
        }
    }
}
