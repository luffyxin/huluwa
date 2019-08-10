package com.huluwa.model.entity;

import java.util.ArrayList;
import java.util.List;

public class WashQueueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WashQueueExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPreIsNull() {
            addCriterion("pre is null");
            return (Criteria) this;
        }

        public Criteria andPreIsNotNull() {
            addCriterion("pre is not null");
            return (Criteria) this;
        }

        public Criteria andPreEqualTo(String value) {
            addCriterion("pre =", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreNotEqualTo(String value) {
            addCriterion("pre <>", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreGreaterThan(String value) {
            addCriterion("pre >", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreGreaterThanOrEqualTo(String value) {
            addCriterion("pre >=", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreLessThan(String value) {
            addCriterion("pre <", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreLessThanOrEqualTo(String value) {
            addCriterion("pre <=", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreLike(String value) {
            addCriterion("pre like", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreNotLike(String value) {
            addCriterion("pre not like", value, "pre");
            return (Criteria) this;
        }

        public Criteria andPreIn(List<String> values) {
            addCriterion("pre in", values, "pre");
            return (Criteria) this;
        }

        public Criteria andPreNotIn(List<String> values) {
            addCriterion("pre not in", values, "pre");
            return (Criteria) this;
        }

        public Criteria andPreBetween(String value1, String value2) {
            addCriterion("pre between", value1, value2, "pre");
            return (Criteria) this;
        }

        public Criteria andPreNotBetween(String value1, String value2) {
            addCriterion("pre not between", value1, value2, "pre");
            return (Criteria) this;
        }

        public Criteria andNextIsNull() {
            addCriterion("next is null");
            return (Criteria) this;
        }

        public Criteria andNextIsNotNull() {
            addCriterion("next is not null");
            return (Criteria) this;
        }

        public Criteria andNextEqualTo(String value) {
            addCriterion("next =", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotEqualTo(String value) {
            addCriterion("next <>", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextGreaterThan(String value) {
            addCriterion("next >", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextGreaterThanOrEqualTo(String value) {
            addCriterion("next >=", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextLessThan(String value) {
            addCriterion("next <", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextLessThanOrEqualTo(String value) {
            addCriterion("next <=", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextLike(String value) {
            addCriterion("next like", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotLike(String value) {
            addCriterion("next not like", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextIn(List<String> values) {
            addCriterion("next in", values, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotIn(List<String> values) {
            addCriterion("next not in", values, "next");
            return (Criteria) this;
        }

        public Criteria andNextBetween(String value1, String value2) {
            addCriterion("next between", value1, value2, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotBetween(String value1, String value2) {
            addCriterion("next not between", value1, value2, "next");
            return (Criteria) this;
        }

        public Criteria andWash_countIsNull() {
            addCriterion("wash_count is null");
            return (Criteria) this;
        }

        public Criteria andWash_countIsNotNull() {
            addCriterion("wash_count is not null");
            return (Criteria) this;
        }

        public Criteria andWash_countEqualTo(Integer value) {
            addCriterion("wash_count =", value, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countNotEqualTo(Integer value) {
            addCriterion("wash_count <>", value, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countGreaterThan(Integer value) {
            addCriterion("wash_count >", value, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("wash_count >=", value, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countLessThan(Integer value) {
            addCriterion("wash_count <", value, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countLessThanOrEqualTo(Integer value) {
            addCriterion("wash_count <=", value, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countIn(List<Integer> values) {
            addCriterion("wash_count in", values, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countNotIn(List<Integer> values) {
            addCriterion("wash_count not in", values, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countBetween(Integer value1, Integer value2) {
            addCriterion("wash_count between", value1, value2, "wash_count");
            return (Criteria) this;
        }

        public Criteria andWash_countNotBetween(Integer value1, Integer value2) {
            addCriterion("wash_count not between", value1, value2, "wash_count");
            return (Criteria) this;
        }

        public Criteria andCook_countIsNull() {
            addCriterion("cook_count is null");
            return (Criteria) this;
        }

        public Criteria andCook_countIsNotNull() {
            addCriterion("cook_count is not null");
            return (Criteria) this;
        }

        public Criteria andCook_countEqualTo(Integer value) {
            addCriterion("cook_count =", value, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countNotEqualTo(Integer value) {
            addCriterion("cook_count <>", value, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countGreaterThan(Integer value) {
            addCriterion("cook_count >", value, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("cook_count >=", value, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countLessThan(Integer value) {
            addCriterion("cook_count <", value, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countLessThanOrEqualTo(Integer value) {
            addCriterion("cook_count <=", value, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countIn(List<Integer> values) {
            addCriterion("cook_count in", values, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countNotIn(List<Integer> values) {
            addCriterion("cook_count not in", values, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countBetween(Integer value1, Integer value2) {
            addCriterion("cook_count between", value1, value2, "cook_count");
            return (Criteria) this;
        }

        public Criteria andCook_countNotBetween(Integer value1, Integer value2) {
            addCriterion("cook_count not between", value1, value2, "cook_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countIsNull() {
            addCriterion("uneat_count is null");
            return (Criteria) this;
        }

        public Criteria andUneat_countIsNotNull() {
            addCriterion("uneat_count is not null");
            return (Criteria) this;
        }

        public Criteria andUneat_countEqualTo(Integer value) {
            addCriterion("uneat_count =", value, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countNotEqualTo(Integer value) {
            addCriterion("uneat_count <>", value, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countGreaterThan(Integer value) {
            addCriterion("uneat_count >", value, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("uneat_count >=", value, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countLessThan(Integer value) {
            addCriterion("uneat_count <", value, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countLessThanOrEqualTo(Integer value) {
            addCriterion("uneat_count <=", value, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countIn(List<Integer> values) {
            addCriterion("uneat_count in", values, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countNotIn(List<Integer> values) {
            addCriterion("uneat_count not in", values, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countBetween(Integer value1, Integer value2) {
            addCriterion("uneat_count between", value1, value2, "uneat_count");
            return (Criteria) this;
        }

        public Criteria andUneat_countNotBetween(Integer value1, Integer value2) {
            addCriterion("uneat_count not between", value1, value2, "uneat_count");
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