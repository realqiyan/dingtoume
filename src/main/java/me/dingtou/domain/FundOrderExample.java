package me.dingtou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FundOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public FundOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("buy_time is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterion("buy_time =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterion("buy_time <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterion("buy_time >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_time >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterion("buy_time <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("buy_time <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterion("buy_time in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterion("buy_time not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterion("buy_time between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("buy_time not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNull() {
            addCriterion("fund_code is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("fund_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("fund_code =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("fund_code <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("fund_code >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_code >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("fund_code <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_code <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("fund_code like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("fund_code not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("fund_code in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("fund_code not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("fund_code between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("fund_code not between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdIsNull() {
            addCriterion("outer_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdIsNotNull() {
            addCriterion("outer_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdEqualTo(String value) {
            addCriterion("outer_order_id =", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotEqualTo(String value) {
            addCriterion("outer_order_id <>", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdGreaterThan(String value) {
            addCriterion("outer_order_id >", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_order_id >=", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdLessThan(String value) {
            addCriterion("outer_order_id <", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdLessThanOrEqualTo(String value) {
            addCriterion("outer_order_id <=", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdLike(String value) {
            addCriterion("outer_order_id like", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotLike(String value) {
            addCriterion("outer_order_id not like", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdIn(List<String> values) {
            addCriterion("outer_order_id in", values, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotIn(List<String> values) {
            addCriterion("outer_order_id not in", values, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdBetween(String value1, String value2) {
            addCriterion("outer_order_id between", value1, value2, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotBetween(String value1, String value2) {
            addCriterion("outer_order_id not between", value1, value2, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterionForJDBCDate("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradePriceIsNull() {
            addCriterion("trade_price is null");
            return (Criteria) this;
        }

        public Criteria andTradePriceIsNotNull() {
            addCriterion("trade_price is not null");
            return (Criteria) this;
        }

        public Criteria andTradePriceEqualTo(Integer value) {
            addCriterion("trade_price =", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotEqualTo(Integer value) {
            addCriterion("trade_price <>", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceGreaterThan(Integer value) {
            addCriterion("trade_price >", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_price >=", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLessThan(Integer value) {
            addCriterion("trade_price <", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLessThanOrEqualTo(Integer value) {
            addCriterion("trade_price <=", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceIn(List<Integer> values) {
            addCriterion("trade_price in", values, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotIn(List<Integer> values) {
            addCriterion("trade_price not in", values, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceBetween(Integer value1, Integer value2) {
            addCriterion("trade_price between", value1, value2, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_price not between", value1, value2, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradeShareIsNull() {
            addCriterion("trade_share is null");
            return (Criteria) this;
        }

        public Criteria andTradeShareIsNotNull() {
            addCriterion("trade_share is not null");
            return (Criteria) this;
        }

        public Criteria andTradeShareEqualTo(Double value) {
            addCriterion("trade_share =", value, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareNotEqualTo(Double value) {
            addCriterion("trade_share <>", value, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareGreaterThan(Double value) {
            addCriterion("trade_share >", value, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareGreaterThanOrEqualTo(Double value) {
            addCriterion("trade_share >=", value, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareLessThan(Double value) {
            addCriterion("trade_share <", value, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareLessThanOrEqualTo(Double value) {
            addCriterion("trade_share <=", value, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareIn(List<Double> values) {
            addCriterion("trade_share in", values, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareNotIn(List<Double> values) {
            addCriterion("trade_share not in", values, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareBetween(Double value1, Double value2) {
            addCriterion("trade_share between", value1, value2, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeShareNotBetween(Double value1, Double value2) {
            addCriterion("trade_share not between", value1, value2, "tradeShare");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIsNull() {
            addCriterion("trade_fee is null");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIsNotNull() {
            addCriterion("trade_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTradeFeeEqualTo(Integer value) {
            addCriterion("trade_fee =", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotEqualTo(Integer value) {
            addCriterion("trade_fee <>", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeGreaterThan(Integer value) {
            addCriterion("trade_fee >", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_fee >=", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeLessThan(Integer value) {
            addCriterion("trade_fee <", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_fee <=", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIn(List<Integer> values) {
            addCriterion("trade_fee in", values, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotIn(List<Integer> values) {
            addCriterion("trade_fee not in", values, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeBetween(Integer value1, Integer value2) {
            addCriterion("trade_fee between", value1, value2, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_fee not between", value1, value2, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_order
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 18 17:09:13 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
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