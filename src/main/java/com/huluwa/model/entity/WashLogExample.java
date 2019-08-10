package com.huluwa.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WashLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WashLogExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDo_cook_peopleIsNull() {
            addCriterion("do_cook_people is null");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleIsNotNull() {
            addCriterion("do_cook_people is not null");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleEqualTo(String value) {
            addCriterion("do_cook_people =", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleNotEqualTo(String value) {
            addCriterion("do_cook_people <>", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleGreaterThan(String value) {
            addCriterion("do_cook_people >", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleGreaterThanOrEqualTo(String value) {
            addCriterion("do_cook_people >=", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleLessThan(String value) {
            addCriterion("do_cook_people <", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleLessThanOrEqualTo(String value) {
            addCriterion("do_cook_people <=", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleLike(String value) {
            addCriterion("do_cook_people like", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleNotLike(String value) {
            addCriterion("do_cook_people not like", value, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleIn(List<String> values) {
            addCriterion("do_cook_people in", values, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleNotIn(List<String> values) {
            addCriterion("do_cook_people not in", values, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleBetween(String value1, String value2) {
            addCriterion("do_cook_people between", value1, value2, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andDo_cook_peopleNotBetween(String value1, String value2) {
            addCriterion("do_cook_people not between", value1, value2, "do_cook_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleIsNull() {
            addCriterion("eat_people is null");
            return (Criteria) this;
        }

        public Criteria andEat_peopleIsNotNull() {
            addCriterion("eat_people is not null");
            return (Criteria) this;
        }

        public Criteria andEat_peopleEqualTo(String value) {
            addCriterion("eat_people =", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleNotEqualTo(String value) {
            addCriterion("eat_people <>", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleGreaterThan(String value) {
            addCriterion("eat_people >", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleGreaterThanOrEqualTo(String value) {
            addCriterion("eat_people >=", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleLessThan(String value) {
            addCriterion("eat_people <", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleLessThanOrEqualTo(String value) {
            addCriterion("eat_people <=", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleLike(String value) {
            addCriterion("eat_people like", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleNotLike(String value) {
            addCriterion("eat_people not like", value, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleIn(List<String> values) {
            addCriterion("eat_people in", values, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleNotIn(List<String> values) {
            addCriterion("eat_people not in", values, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleBetween(String value1, String value2) {
            addCriterion("eat_people between", value1, value2, "eat_people");
            return (Criteria) this;
        }

        public Criteria andEat_peopleNotBetween(String value1, String value2) {
            addCriterion("eat_people not between", value1, value2, "eat_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleIsNull() {
            addCriterion("wash_people is null");
            return (Criteria) this;
        }

        public Criteria andWash_peopleIsNotNull() {
            addCriterion("wash_people is not null");
            return (Criteria) this;
        }

        public Criteria andWash_peopleEqualTo(String value) {
            addCriterion("wash_people =", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleNotEqualTo(String value) {
            addCriterion("wash_people <>", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleGreaterThan(String value) {
            addCriterion("wash_people >", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleGreaterThanOrEqualTo(String value) {
            addCriterion("wash_people >=", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleLessThan(String value) {
            addCriterion("wash_people <", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleLessThanOrEqualTo(String value) {
            addCriterion("wash_people <=", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleLike(String value) {
            addCriterion("wash_people like", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleNotLike(String value) {
            addCriterion("wash_people not like", value, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleIn(List<String> values) {
            addCriterion("wash_people in", values, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleNotIn(List<String> values) {
            addCriterion("wash_people not in", values, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleBetween(String value1, String value2) {
            addCriterion("wash_people between", value1, value2, "wash_people");
            return (Criteria) this;
        }

        public Criteria andWash_peopleNotBetween(String value1, String value2) {
            addCriterion("wash_people not between", value1, value2, "wash_people");
            return (Criteria) this;
        }

        public Criteria andEat_timeIsNull() {
            addCriterion("eat_time is null");
            return (Criteria) this;
        }

        public Criteria andEat_timeIsNotNull() {
            addCriterion("eat_time is not null");
            return (Criteria) this;
        }

        public Criteria andEat_timeEqualTo(Date value) {
            addCriterionForJDBCDate("eat_time =", value, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("eat_time <>", value, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("eat_time >", value, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eat_time >=", value, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeLessThan(Date value) {
            addCriterionForJDBCDate("eat_time <", value, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eat_time <=", value, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeIn(List<Date> values) {
            addCriterionForJDBCDate("eat_time in", values, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("eat_time not in", values, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eat_time between", value1, value2, "eat_time");
            return (Criteria) this;
        }

        public Criteria andEat_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eat_time not between", value1, value2, "eat_time");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueIsNull() {
            addCriterion("current_queue is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueIsNotNull() {
            addCriterion("current_queue is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueEqualTo(String value) {
            addCriterion("current_queue =", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueNotEqualTo(String value) {
            addCriterion("current_queue <>", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueGreaterThan(String value) {
            addCriterion("current_queue >", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueGreaterThanOrEqualTo(String value) {
            addCriterion("current_queue >=", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueLessThan(String value) {
            addCriterion("current_queue <", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueLessThanOrEqualTo(String value) {
            addCriterion("current_queue <=", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueLike(String value) {
            addCriterion("current_queue like", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueNotLike(String value) {
            addCriterion("current_queue not like", value, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueIn(List<String> values) {
            addCriterion("current_queue in", values, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueNotIn(List<String> values) {
            addCriterion("current_queue not in", values, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueBetween(String value1, String value2) {
            addCriterion("current_queue between", value1, value2, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCurrent_queueNotBetween(String value1, String value2) {
            addCriterion("current_queue not between", value1, value2, "current_queue");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("updator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("updator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(Long value) {
            addCriterion("updator =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(Long value) {
            addCriterion("updator <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(Long value) {
            addCriterion("updator >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(Long value) {
            addCriterion("updator >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(Long value) {
            addCriterion("updator <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(Long value) {
            addCriterion("updator <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<Long> values) {
            addCriterion("updator in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<Long> values) {
            addCriterion("updator not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(Long value1, Long value2) {
            addCriterion("updator between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(Long value1, Long value2) {
            addCriterion("updator not between", value1, value2, "updator");
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