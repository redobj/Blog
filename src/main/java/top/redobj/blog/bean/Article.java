package top.redobj.blog.bean;

import top.redobj.blog.constants.Constants;

public class Article {
    private Integer articleId;

    private Integer authorId;

    private String classifyName;

    private String articleTitle;

    private Long articleTime;

    private String articleIp;

    private Integer articleClick;

    private Integer articleClassifyId;

    private Boolean articleType;

    private Boolean articleUp;

    private String articleContent;

    private String[] contentSplit;

    private String articleImg;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Long getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Long articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleIp() {
        return articleIp;
    }

    public void setArticleIp(String articleIp) {
        this.articleIp = articleIp == null ? null : articleIp.trim();
    }

    public Integer getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    public Integer getArticleClassifyId() {
        return articleClassifyId;
    }

    public void setArticleClassifyId(Integer articleClassifyId) {
        this.articleClassifyId = articleClassifyId;
    }

    public Boolean getArticleType() {
        return articleType;
    }

    public void setArticleType(Boolean articleType) {
        this.articleType = articleType;
    }

    public Boolean getArticleUp() {
        return articleUp;
    }

    public void setArticleUp(Boolean articleUp) {
        this.articleUp = articleUp;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        if(articleContent == null){
            this.articleContent = null;
            setContentSplit(null);
        }else{
//            this.articleContent = articleContent.trim();
            this.articleContent = articleContent.trim().replace(Constants.SYMBOL_T,"&nbsp;&nbsp;&nbsp;&nbsp;");
            setContentSplit(this.articleContent.split(Constants.SYMBOL_BR));
        }

    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }



    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public String[] getContentSplit() {
        return contentSplit;
    }

    public void setContentSplit(String[] contentSplit) {
        this.contentSplit = contentSplit;
    }
}