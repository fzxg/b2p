package com.cdut.b2p.modules.shop.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ShopChatExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChatUserIdIsNull() {
            addCriterion("chat_user_id is null");
            return (Criteria) this;
        }

        public Criteria andChatUserIdIsNotNull() {
            addCriterion("chat_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andChatUserIdEqualTo(String value) {
            addCriterion("chat_user_id =", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdNotEqualTo(String value) {
            addCriterion("chat_user_id <>", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdGreaterThan(String value) {
            addCriterion("chat_user_id >", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("chat_user_id >=", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdLessThan(String value) {
            addCriterion("chat_user_id <", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdLessThanOrEqualTo(String value) {
            addCriterion("chat_user_id <=", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdLike(String value) {
            addCriterion("chat_user_id like", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdNotLike(String value) {
            addCriterion("chat_user_id not like", value, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdIn(List<String> values) {
            addCriterion("chat_user_id in", values, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdNotIn(List<String> values) {
            addCriterion("chat_user_id not in", values, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdBetween(String value1, String value2) {
            addCriterion("chat_user_id between", value1, value2, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatUserIdNotBetween(String value1, String value2) {
            addCriterion("chat_user_id not between", value1, value2, "chatUserId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdIsNull() {
            addCriterion("chat_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdIsNotNull() {
            addCriterion("chat_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdEqualTo(String value) {
            addCriterion("chat_goods_id =", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdNotEqualTo(String value) {
            addCriterion("chat_goods_id <>", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdGreaterThan(String value) {
            addCriterion("chat_goods_id >", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("chat_goods_id >=", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdLessThan(String value) {
            addCriterion("chat_goods_id <", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("chat_goods_id <=", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdLike(String value) {
            addCriterion("chat_goods_id like", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdNotLike(String value) {
            addCriterion("chat_goods_id not like", value, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdIn(List<String> values) {
            addCriterion("chat_goods_id in", values, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdNotIn(List<String> values) {
            addCriterion("chat_goods_id not in", values, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdBetween(String value1, String value2) {
            addCriterion("chat_goods_id between", value1, value2, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatGoodsIdNotBetween(String value1, String value2) {
            addCriterion("chat_goods_id not between", value1, value2, "chatGoodsId");
            return (Criteria) this;
        }

        public Criteria andChatMessageIsNull() {
            addCriterion("chat_message is null");
            return (Criteria) this;
        }

        public Criteria andChatMessageIsNotNull() {
            addCriterion("chat_message is not null");
            return (Criteria) this;
        }

        public Criteria andChatMessageEqualTo(String value) {
            addCriterion("chat_message =", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageNotEqualTo(String value) {
            addCriterion("chat_message <>", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageGreaterThan(String value) {
            addCriterion("chat_message >", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageGreaterThanOrEqualTo(String value) {
            addCriterion("chat_message >=", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageLessThan(String value) {
            addCriterion("chat_message <", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageLessThanOrEqualTo(String value) {
            addCriterion("chat_message <=", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageLike(String value) {
            addCriterion("chat_message like", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageNotLike(String value) {
            addCriterion("chat_message not like", value, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageIn(List<String> values) {
            addCriterion("chat_message in", values, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageNotIn(List<String> values) {
            addCriterion("chat_message not in", values, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageBetween(String value1, String value2) {
            addCriterion("chat_message between", value1, value2, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatMessageNotBetween(String value1, String value2) {
            addCriterion("chat_message not between", value1, value2, "chatMessage");
            return (Criteria) this;
        }

        public Criteria andChatStatusIsNull() {
            addCriterion("chat_status is null");
            return (Criteria) this;
        }

        public Criteria andChatStatusIsNotNull() {
            addCriterion("chat_status is not null");
            return (Criteria) this;
        }

        public Criteria andChatStatusEqualTo(String value) {
            addCriterion("chat_status =", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusNotEqualTo(String value) {
            addCriterion("chat_status <>", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusGreaterThan(String value) {
            addCriterion("chat_status >", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusGreaterThanOrEqualTo(String value) {
            addCriterion("chat_status >=", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusLessThan(String value) {
            addCriterion("chat_status <", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusLessThanOrEqualTo(String value) {
            addCriterion("chat_status <=", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusLike(String value) {
            addCriterion("chat_status like", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusNotLike(String value) {
            addCriterion("chat_status not like", value, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusIn(List<String> values) {
            addCriterion("chat_status in", values, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusNotIn(List<String> values) {
            addCriterion("chat_status not in", values, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusBetween(String value1, String value2) {
            addCriterion("chat_status between", value1, value2, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andChatStatusNotBetween(String value1, String value2) {
            addCriterion("chat_status not between", value1, value2, "chatStatus");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }

    /**
     */
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