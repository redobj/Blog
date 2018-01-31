package top.redobj.blog.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.redobj.blog.bean.User;
import top.redobj.blog.bean.UserExample;
import top.redobj.blog.dao.UserMapper;
import top.redobj.blog.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserInfo(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
