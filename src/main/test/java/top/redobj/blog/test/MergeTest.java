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
        article.setArticleClassifyId(9);
        article.setArticleTime(new Date().getTime());
        article.setArticleTitle("Nginx 常用操作命令");
        article.setArticleContent(
        Utils.articleChangeHelper(Utils.CHANGE_MODE.READ,"Nginx有一个主进程和几个工作进程，主进程的主要作用就是读取、评估配置文件和管理工作进程，工作进程对请求做实际处理。工作进程的数量是在配置文件中配置的，一般设置为cpu的核心数*线程数。\n" +
                "\n" +
                "nginx可以通过信号控制，默认情况下，主进程的进程ID记录在/usr/local/nginx/logs/nginx.pid 文件中。信号可以通过nginx可执行文件发送给nginx (nginx -s 信号)，也可以通过unix的kill命令发送给nginx，这种情况下是将信号直接发送给指定进程ID的进程，如：kill QUIT 1628。\n" +
                "\n" +
                "1、启动nginx，直接运行nginx的可执行文件：\n" +
                "[root@localhost ~]# /usr/local/nginx/nginx  \n" +
                "\n" +
                "2、停止nginx\n" +
                "@_t_@;快速关闭：nginx -s stop 或者 kill -TERM 主进程号 或者 kill -INT 主进程号 \n" +
                "[root@localhost ~]# /usr/local/nginx/nginx -s stop  \n" +
                "@_t_@;或者\n" +
                "[root@localhost ~]# ps -ef |grep nginx|grep master  \n" +
                "root       9879      1  0 13:15 ?        00:00:00 nginx: master process ./nginx  \n" +
                "[root@localhost ~]# kill -TERM 9879  \n" +
                "@_t_@;或者\n" +
                "[root@localhost ~]# kill -INT 9879  \n" +
                "\n" +
                "@_t_@;优雅关闭(不接受新的连接请求，等待旧的连接请求处理完毕再关闭)：nginx -s quit 或者 kill -QUIT 主进程号\n" +
                "[root@localhost ~]# /usr/local/nginx/nginx -s quit  \n" +
                "@_t_@;注意：执行该命令的用户应该是启动nginx的用户\n" +
                "\n" +
                "[root@localhost ~]# ps -ef |grep nginx  \n" +
                "root       9889      1  0 13:17 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody     9890   9889  0 13:17 ?        00:00:00 nginx: worker process  \n" +
                "root       9893   2008  0 13:18 pts/1    00:00:00 grep nginx  \n" +
                "[root@localhost sbin]# kill -QUIT 9889  \n" +
                "\n" +
                "3、重新加载配置文件：nginx -s reload  或者  kill -HUP 主进程号\n" +
                "nginx配置平滑更新:\n" +
                "@_t_@;为了让主进程重新读取配置文件，应该向主进程发送一个HUP信号，主进程一旦接收到重新加载配置的的信号，它就检查配置文件语法的有效性，然后试图应用新的配置，即打开新的日志文件和新的socket 监听，如果失败，它将回滚配置更改并继续使用旧的配置，如果成功了，它开启新的工作进程，并给旧的工作进程发消息让它们优雅的关闭，旧的工作进程接收到关闭信号后，不再接收新的请求，如果已有请求正在处理，等当前请求处理完毕后关闭，如果没有请求正在处理，则直接关闭。\n" +
                "[root@localhost ~]#  /usr/local/nginx/nginx -s reload  \n" +
                "或者\n" +
                "[root@localhost ~]# ps -ef|grep nginx  \n" +
                "root       9944      1  0 13:22 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody     9949   9944  0 13:23 ?        00:00:00 nginx: worker process  \n" +
                "root       9960   9917  0 13:28 pts/1    00:00:00 grep nginx  \n" +
                "[root@songguoliang sbin]# kill -HUP 9944  \n" +
                "\n" +
                "4、测试配置文件，检查配置文件语法是否正确，然后试图打开文件涉及的配置：nginx -t\n" +
                "[root@localhost ~]# /usr/local/nginx/nginx -t  \n" +
                "nginx: the configuration file /usr/local/nginx/conf/nginx.conf syntax is ok  \n" +
                "nginx: configuration file /usr/local/nginx/conf/nginx.conf test is successful  \n" +
                "\n" +
                "5、查看nginx版本信息： nginx -v \n" +
                "[root@songguoliang sbin]# /usr/local/nginx/nginx -v  \n" +
                "nginx version: nginx/1.10.1  \n" +
                "\n" +
                "6、查看nginx版本信息，编译版本，和配置参数：nginx -V\n" +
                "[root@songguoliang ~]# /usr/local/nginx/nginx -V  \n" +
                "nginx version: nginx/1.10.1  \n" +
                "built by gcc 4.4.7 20120313 (Red Hat 4.4.7-17) (GCC)   \n" +
                "configure arguments: --prefix=/usr/local/nginx  \n" +
                "\n" +
                "7、重启日志文件，备份日志文件时常用：nginx -s reopen 或者 kill -USR1 主进程号\n" +
                "[root@localhost ~]# /usr/local/nginx/nginx -s reopen  \n" +
                "或者\n" +
                "[root@localhost ~]# kill -USR1 2030  \n" +
                "@_t_@;由于nginx是通过inode指向日志文件的，inode和文件名无关，所以即使把日志文件重命名，nginx还是将日志文件写入原文件，只有用上面的命令重新开启日志文件才能将日志写入新的日志文件。\n" +
                "\n" +
                "8、nginx的平滑升级\n" +
                "@_t_@;如果你需要升级或者添加、删除服务器模块时，可以通过nginx的平滑升级，在不停止服务的情况下升级nginx。\n" +
                "@_t_@;(1)用新的nginx可执行程序替换旧的可执行程序，即下载新的nginx，重新编译到旧版本的安装路径中(重新编译之前可以备份旧的可执行文件)\n" +
                "@_t_@;(2)给nginx主进程号发送USR2信号\n" +
                "[root@localhost ~]# kill -USR2 9944  \n" +
                "执行命令前的进程：\n" +
                "[root@localhost ~]# ps -ef |grep nginx  \n" +
                "root       9944      1  0 13:22 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody     9965   9944  0 13:29 ?        00:00:00 nginx: worker process  \n" +
                "root      10010   9917  0 13:42 pts/1    00:00:00 grep nginx  \n" +
                "执行命令后的进程：\n" +
                "[root@localhost ~]# ps -ef |grep nginx  \n" +
                "root       9944      1  0 13:22 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody     9965   9944  0 13:29 ?        00:00:00 nginx: worker process  \n" +
                "root      10012   9944  0 13:43 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody    10013  10012  0 13:43 ?        00:00:00 nginx: worker process  \n" +
                "root      10015   9917  0 13:43 pts/1    00:00:00 grep nginx  \n" +
                "@_t_@;给nginx发送USR2信号后，nginx会将logs/nginx.pid文件重命名为nginx.pid.oldbin，然后用新的可执行文件启动一个新的nginx主进程和对应的工作进程，并新建一个新的nginx.pid保存新的主进程号\n" +
                "[root@localhost ~]# cd  /usr/local/nginx/logs  \n" +
                "[root@songguoliang logs]# ll  \n" +
                "总用量 16  \n" +
                "-rw-r--r--. 1 nobody root 596 10月  8 13:02 access.log  \n" +
                "-rw-r--r--. 1 nobody root 881 10月  8 13:43 error.log  \n" +
                "-rw-r--r--. 1 root   root   6 10月  8 13:43 nginx.pid  \n" +
                "-rw-r--r--. 1 root   root   5 10月  8 13:22 nginx.pid.oldbin  \n" +
                "[root@songguoliang logs]# cat nginx.pid  \n" +
                "10012  \n" +
                "[root@songguoliang logs]# cat nginx.pid.oldbin   \n" +
                "9944  \n" +
                "这时，nginx的新的实例和旧的实例同时工作，共同处理请求连接。接下来要关闭旧的实例进程。\n" +
                "@_t_@;(3)给旧的主进程发送WINCH信号，kill -WINCH 旧的主进程号\n" +
                "[root@localhost ~]# ps -ef |grep nginx  \n" +
                "root       9944      1  0 13:22 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody     9965   9944  0 13:29 ?        00:00:00 nginx: worker process  \n" +
                "root      10012   9944  0 13:43 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody    10013  10012  0 13:43 ?        00:00:00 nginx: worker process  \n" +
                "root      10092   9917  0 14:05 pts/1    00:00:00 grep nginx  \n" +
                "[root@localhost ~]# kill -WINCH 9944    \n" +
                "[root@localhost ~]# ps -ef |grep nginx  \n" +
                "root       9944      1  0 13:22 ?        00:00:00 nginx: master process ./nginx  \n" +
                "root      10012   9944  0 13:43 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody    10013  10012  0 13:43 ?        00:00:00 nginx: worker process  \n" +
                "root      10094   9917  0 14:06 pts/1    00:00:00 grep nginx  \n" +
                "@_t_@;旧的主进程号收到WINCH信号后，将旧进程号管理的旧的工作进程优雅的关闭。即一段时间后旧的工作进程全部关闭，只有新的工作进程在处理请求连接。这时，依然可以恢复到旧的进程服务，因为旧的进程的监听socket还未停止。\n" +
                "@_t_@;(4)给旧的主进程发送QUIT信号，使其关闭。\n" +
                "[root@localhost sbin]# kill -QUIT 9944  \n" +
                "[root@localhost sbin]# ps -ef |grep nginx  \n" +
                "root      10012      1  0 13:43 ?        00:00:00 nginx: master process ./nginx  \n" +
                "nobody    10013  10012  0 13:43 ?        00:00:00 nginx: worker process  \n" +
                "root      10118   9917  0 14:16 pts/1    00:00:00 grep nginx  \n" +
                "@_t_@;给旧的主进程发送QUIT信号后，旧的主进程退出，并移除logs/nginx.pid.oldbin文件，nginx的升级完成。\n" +
                "\n" +
                "@_t_@;中途停止升级，回滚到旧的nginx\n" +
                "@_t_@;在步骤(3)时，如果想回到旧的nginx不再升级\n" +
                "@_t_@;(1)给旧的主进程号发送HUP命令，此时nginx不重新读取配置文件的情况下重新启动旧主进程的工作进程。\n" +
                "@_t_@;[root@localhost sbin]# kill -HUP 9944  \n" +
                "@_t_@;(2)优雅的关闭新的主进程\n" +
                "@_t_@;[root@localhost sbin]# kill -QUIT 10012  \n" +
                "@_t_@;注：如果由于某种原因，无法关闭新主进程的工作进程，直接给进程号发送KILL信号\n" +
                "\n" +
                "\n" +
                "\n" +
                "@_t_@;nginx的进程分为主进程和工作进程，关于nginx的信号，主进程支持以下信号：\n" +
                "@_t_@;TERM，INT 快速关闭\n" +
                "@_t_@;QUIT 优雅的关闭\n" +
                "@_t_@;KILL 关闭一个顽固进程\n" +
                "@_t_@;HUP 改变配置，使用新配置开启新的工作进程，优雅的关闭旧的进程\n" +
                "@_t_@;USR1 重新开启日志文件\n" +
                "@_t_@;USR2 平滑升级nginx\n" +
                "@_t_@;WINCH 优雅的关闭工作进程\n" +
                "\n" +
                "@_t_@;单个工作进程也可以通过信号控制，但它不是必须的。单个工作进程支持的信号有：\n" +
                "@_t_@;TERM，INT 快速关闭\n" +
                "@_t_@;QUIT 优雅的关闭\n" +
                "@_t_@;USR1 重新开启日志文件\n" +
                "@_t_@;WINCH 异常终止调试(需要启动debug_points)"));
        article.setAuthorId(1);
        article.setArticleType(true);
        article.setArticleUp(true);

        articleService.articleAdd(article);
    }
}
