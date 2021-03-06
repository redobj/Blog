package top.redobj.blog.bean;

import java.util.ArrayList;
import java.util.List;

public class ArticleClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleClassifyExample() {
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

        public Criteria andClassifyIdIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(Integer value) {
            addCriterion("classify_id =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(Integer value) {
            addCriterion("classify_id <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(Integer value) {
            addCriterion("classify_id >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_id >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(Integer value) {
            addCriterion("classify_id <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("classify_id <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<Integer> values) {
            addCriterion("classify_id in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<Integer> values) {
            addCriterion("classify_id not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("classify_id between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_id not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelIsNull() {
            addCriterion("classify_level is null");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelIsNotNull() {
            addCriterion("classify_level is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelEqualTo(Byte value) {
            addCriterion("classify_level =", value, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelNotEqualTo(Byte value) {
            addCriterion("classify_level <>", value, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelGreaterThan(Byte value) {
            addCriterion("classify_level >", value, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("classify_level >=", value, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelLessThan(Byte value) {
            addCriterion("classify_level <", value, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelLessThanOrEqualTo(Byte value) {
            addCriterion("classify_level <=", value, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelIn(List<Byte> values) {
            addCriterion("classify_level in", values, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelNotIn(List<Byte> values) {
            addCriterion("classify_level not in", values, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelBetween(Byte value1, Byte value2) {
            addCriterion("classify_level between", value1, value2, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("classify_level not between", value1, value2, "classifyLevel");
            return (Criteria) this;
        }

        public Criteria andClassifyParentIsNull() {
            addCriterion("classify_parent is null");
            return (Criteria) this;
        }

        public Criteria andClassifyParentIsNotNull() {
            addCriterion("classify_parent is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyParentEqualTo(Integer value) {
            addCriterion("classify_parent =", value, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentNotEqualTo(Integer value) {
            addCriterion("classify_parent <>", value, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentGreaterThan(Integer value) {
            addCriterion("classify_parent >", value, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_parent >=", value, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentLessThan(Integer value) {
            addCriterion("classify_parent <", value, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentLessThanOrEqualTo(Integer value) {
            addCriterion("classify_parent <=", value, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentIn(List<Integer> values) {
            addCriterion("classify_parent in", values, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentNotIn(List<Integer> values) {
            addCriterion("classify_parent not in", values, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentBetween(Integer value1, Integer value2) {
            addCriterion("classify_parent between", value1, value2, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyParentNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_parent not between", value1, value2, "classifyParent");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNull() {
            addCriterion("classify_name is null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNotNull() {
            addCriterion("classify_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameEqualTo(String value) {
            addCriterion("classify_name =", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotEqualTo(String value) {
            addCriterion("classify_name <>", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThan(String value) {
            addCriterion("classify_name >", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("classify_name >=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThan(String value) {
            addCriterion("classify_name <", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThanOrEqualTo(String value) {
            addCriterion("classify_name <=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLike(String value) {
            addCriterion("classify_name like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotLike(String value) {
            addCriterion("classify_name not like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIn(List<String> values) {
            addCriterion("classify_name in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotIn(List<String> values) {
            addCriterion("classify_name not in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameBetween(String value1, String value2) {
            addCriterion("classify_name between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotBetween(String value1, String value2) {
            addCriterion("classify_name not between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesIsNull() {
            addCriterion("classify_articles is null");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesIsNotNull() {
            addCriterion("classify_articles is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesEqualTo(Integer value) {
            addCriterion("classify_articles =", value, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesNotEqualTo(Integer value) {
            addCriterion("classify_articles <>", value, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesGreaterThan(Integer value) {
            addCriterion("classify_articles >", value, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_articles >=", value, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesLessThan(Integer value) {
            addCriterion("classify_articles <", value, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesLessThanOrEqualTo(Integer value) {
            addCriterion("classify_articles <=", value, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesIn(List<Integer> values) {
            addCriterion("classify_articles in", values, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesNotIn(List<Integer> values) {
            addCriterion("classify_articles not in", values, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesBetween(Integer value1, Integer value2) {
            addCriterion("classify_articles between", value1, value2, "classifyArticles");
            return (Criteria) this;
        }

        public Criteria andClassifyArticlesNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_articles not between", value1, value2, "classifyArticles");
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