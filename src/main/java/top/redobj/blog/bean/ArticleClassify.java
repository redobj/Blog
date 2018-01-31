package top.redobj.blog.bean;

public class ArticleClassify {
    private Integer classifyId;

    private Byte classifyLevel;

    private Integer classifyParent;

    private String classifyName;

    private Integer classifyArticles;

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public Byte getClassifyLevel() {
        return classifyLevel;
    }

    public void setClassifyLevel(Byte classifyLevel) {
        this.classifyLevel = classifyLevel;
    }

    public Integer getClassifyParent() {
        return classifyParent;
    }

    public void setClassifyParent(Integer classifyParent) {
        this.classifyParent = classifyParent;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public Integer getClassifyArticles() {
        return classifyArticles;
    }

    public void setClassifyArticles(Integer classifyArticles) {
        this.classifyArticles = classifyArticles;
    }
}