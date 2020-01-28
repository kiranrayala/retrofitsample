
package com.wert.invest.retrofitsample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalsList {

    @SerializedName("customergoalId")
    @Expose
    private String customergoalId;
    @SerializedName("goalname")
    @Expose
    private String goalname;
    @SerializedName("futurecost")
    @Expose
    private Integer futurecost;
    @SerializedName("goalpriority")
    @Expose
    private Integer goalpriority;
    @SerializedName("timeframe")
    @Expose
    private Integer timeframe;
    @SerializedName("sipamount")
    @Expose
    private String sipamount;
    @SerializedName("lumpsumamount")
    @Expose
    private Object lumpsumamount;
    @SerializedName("createdutcdatetime")
    @Expose
    private String createdutcdatetime;
    @SerializedName("yearmonth")
    @Expose
    private String yearmonth;
    @SerializedName("growth")
    @Expose
    private String growth;
    @SerializedName("bargrowth")
    @Expose
    private String bargrowth;
    @SerializedName("customergoalid")
    @Expose
    private String customergoalid;
    @SerializedName("customerid")
    @Expose
    private Integer customerid;
    @SerializedName("timetaken")
    @Expose
    private Integer timetaken;
    @SerializedName("totalsaved")
    @Expose
    private Double totalsaved;
    @SerializedName("goal_status")
    @Expose
    private String goalStatus;
    @SerializedName("createdby")
    @Expose
    private Object createdby;
    @SerializedName("modifiedby")
    @Expose
    private Object modifiedby;
    @SerializedName("modifiedutcdatetime")
    @Expose
    private String modifiedutcdatetime;
    @SerializedName("inactive")
    @Expose
    private Object inactive;
    @SerializedName("iscompleted")
    @Expose
    private Object iscompleted;
    @SerializedName("goalcost")
    @Expose
    private Integer goalcost;
    @SerializedName("goaltype")
    @Expose
    private String goaltype;

    public String getCustomergoalId() {
        return customergoalId;
    }

    public void setCustomergoalId(String customergoalId) {
        this.customergoalId = customergoalId;
    }

    public String getGoalname() {
        return goalname;
    }

    public void setGoalname(String goalname) {
        this.goalname = goalname;
    }

    public Integer getFuturecost() {
        return futurecost;
    }

    public void setFuturecost(Integer futurecost) {
        this.futurecost = futurecost;
    }

    public Integer getGoalpriority() {
        return goalpriority;
    }

    public void setGoalpriority(Integer goalpriority) {
        this.goalpriority = goalpriority;
    }

    public Integer getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(Integer timeframe) {
        this.timeframe = timeframe;
    }

    public String getSipamount() {
        return sipamount;
    }

    public void setSipamount(String sipamount) {
        this.sipamount = sipamount;
    }

    public Object getLumpsumamount() {
        return lumpsumamount;
    }

    public void setLumpsumamount(Object lumpsumamount) {
        this.lumpsumamount = lumpsumamount;
    }

    public String getCreatedutcdatetime() {
        return createdutcdatetime;
    }

    public void setCreatedutcdatetime(String createdutcdatetime) {
        this.createdutcdatetime = createdutcdatetime;
    }

    public String getYearmonth() {
        return yearmonth;
    }

    public void setYearmonth(String yearmonth) {
        this.yearmonth = yearmonth;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public String getBargrowth() {
        return bargrowth;
    }

    public void setBargrowth(String bargrowth) {
        this.bargrowth = bargrowth;
    }

    public String getCustomergoalid() {
        return customergoalid;
    }

    public void setCustomergoalid(String customergoalid) {
        this.customergoalid = customergoalid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getTimetaken() {
        return timetaken;
    }

    public void setTimetaken(Integer timetaken) {
        this.timetaken = timetaken;
    }

    public Double getTotalsaved() {
        return totalsaved;
    }

    public void setTotalsaved(Double totalsaved) {
        this.totalsaved = totalsaved;
    }

    public String getGoalStatus() {
        return goalStatus;
    }

    public void setGoalStatus(String goalStatus) {
        this.goalStatus = goalStatus;
    }

    public Object getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Object createdby) {
        this.createdby = createdby;
    }

    public Object getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Object modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getModifiedutcdatetime() {
        return modifiedutcdatetime;
    }

    public void setModifiedutcdatetime(String modifiedutcdatetime) {
        this.modifiedutcdatetime = modifiedutcdatetime;
    }

    public Object getInactive() {
        return inactive;
    }

    public void setInactive(Object inactive) {
        this.inactive = inactive;
    }

    public Object getIscompleted() {
        return iscompleted;
    }

    public void setIscompleted(Object iscompleted) {
        this.iscompleted = iscompleted;
    }

    public Integer getGoalcost() {
        return goalcost;
    }

    public void setGoalcost(Integer goalcost) {
        this.goalcost = goalcost;
    }

    public String getGoaltype() {
        return goaltype;
    }

    public void setGoaltype(String goaltype) {
        this.goaltype = goaltype;
    }

}
