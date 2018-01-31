package top.redobj.blog.bean;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private  Integer limit;

    private Integer offset;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIsNull() {
            addCriterion("article_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIsNotNull() {
            addCriterion("article_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTimeEqualTo(Long value) {
            addCriterion("article_time =", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotEqualTo(Long value) {
            addCriterion("article_time <>", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeGreaterThan(Long value) {
            addCriterion("article_time >", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("article_time >=", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeLessThan(Long value) {
            addCriterion("article_time <", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeLessThanOrEqualTo(Long value) {
            addCriterion("article_time <=", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIn(List<Long> values) {
            addCriterion("article_time in", values, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotIn(List<Long> values) {
            addCriterion("article_time not in", values, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeBetween(Long value1, Long value2) {
            addCriterion("article_time between", value1, value2, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotBetween(Long value1, Long value2) {
            addCriterion("article_time not between", value1, value2, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleIpIsNull() {
            addCriterion("article_ip is null");
            return (Criteria) this;
        }

        public Criteria andArticleIpIsNotNull() {
            addCriterion("article_ip is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIpEqualTo(String value) {
            addCriterion("article_ip =", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotEqualTo(String value) {
            addCriterion("article_ip <>", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpGreaterThan(String value) {
            addCriterion("article_ip >", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpGreaterThanOrEqualTo(String value) {
            addCriterion("article_ip >=", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpLessThan(String value) {
            addCriterion("article_ip <", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpLessThanOrEqualTo(String value) {
            addCriterion("article_ip <=", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpLike(String value) {
            addCriterion("article_ip like", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotLike(String value) {
            addCriterion("article_ip not like", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpIn(List<String> values) {
            addCriterion("article_ip in", values, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotIn(List<String> values) {
            addCriterion("article_ip not in", values, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpBetween(String value1, String value2) {
            addCriterion("article_ip between", value1, value2, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotBetween(String value1, String value2) {
            addCriterion("article_ip not between", value1, value2, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleClickIsNull() {
            addCriterion("article_click is null");
            return (Criteria) this;
        }

        public Criteria andArticleClickIsNotNull() {
            addCriterion("article_click is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClickEqualTo(Integer value) {
            addCriterion("article_click =", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotEqualTo(Integer value) {
            addCriterion("article_click <>", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickGreaterThan(Integer value) {
            addCriterion("article_click >", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_click >=", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickLessThan(Integer value) {
            addCriterion("article_click <", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickLessThanOrEqualTo(Integer value) {
            addCriterion("article_click <=", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickIn(List<Integer> values) {
            addCriterion("article_click in", values, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotIn(List<Integer> values) {
            addCriterion("article_click not in", values, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickBetween(Integer value1, Integer value2) {
            addCriterion("article_click between", value1, value2, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotBetween(Integer value1, Integer value2) {
            addCriterion("article_click not between", value1, value2, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdIsNull() {
            addCriterion("article_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdIsNotNull() {
            addCriterion("article_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdEqualTo(Integer value) {
            addCriterion("article_classify_id =", value, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdNotEqualTo(Integer value) {
            addCriterion("article_classify_id <>", value, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdGreaterThan(Integer value) {
            addCriterion("article_classify_id >", value, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_classify_id >=", value, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdLessThan(Integer value) {
            addCriterion("article_classify_id <", value, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_classify_id <=", value, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdIn(List<Integer> values) {
            addCriterion("article_classify_id in", values, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdNotIn(List<Integer> values) {
            addCriterion("article_classify_id not in", values, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("article_classify_id between", value1, value2, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_classify_id not between", value1, value2, "articleClassifyId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(Boolean value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(Boolean value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(Boolean value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(Boolean value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<Boolean> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<Boolean> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleUpIsNull() {
            addCriterion("article_up is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpIsNotNull() {
            addCriterion("article_up is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpEqualTo(Boolean value) {
            addCriterion("article_up =", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpNotEqualTo(Boolean value) {
            addCriterion("article_up <>", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpGreaterThan(Boolean value) {
            addCriterion("article_up >", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_up >=", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpLessThan(Boolean value) {
            addCriterion("article_up <", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpLessThanOrEqualTo(Boolean value) {
            addCriterion("article_up <=", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpIn(List<Boolean> values) {
            addCriterion("article_up in", values, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpNotIn(List<Boolean> values) {
            addCriterion("article_up not in", values, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpBetween(Boolean value1, Boolean value2) {
            addCriterion("article_up between", value1, value2, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_up not between", value1, value2, "articleUp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}