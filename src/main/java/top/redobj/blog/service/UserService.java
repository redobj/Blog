package top.redobj.blog.service;

import top.redobj.blog.bean.User;

public interface UserService {

    /**
     * 取得用户信息
     *
     * @param id 用户id
     * @return
     */
    User getUserInfo(int id);
}
