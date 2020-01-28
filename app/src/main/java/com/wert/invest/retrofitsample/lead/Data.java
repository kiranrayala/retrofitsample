
package com.wert.invest.retrofitsample.lead;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lead_number")
    @Expose
    private String leadNumber;
    @SerializedName("session_id")
    @Expose
    private Object sessionId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("primary_number")
    @Expose
    private String primaryNumber;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("company_id")
    @Expose
    private String companyId;
    @SerializedName("lead_stage")
    @Expose
    private String leadStage;
    @SerializedName("lead_type")
    @Expose
    private String leadType;
    @SerializedName("drop_status")
    @Expose
    private Object dropStatus;
    @SerializedName("comment")
    @Expose
    private Object comment;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("company_name")
    @Expose
    private Object companyName;
    @SerializedName("country_id")
    @Expose
    private Object countryId;
    @SerializedName("state_id")
    @Expose
    private Object stateId;
    @SerializedName("city_id")
    @Expose
    private Object cityId;
    @SerializedName("pin")
    @Expose
    private Object pin;
    @SerializedName("company_website")
    @Expose
    private Object companyWebsite;
    @SerializedName("annual_revenue")
    @Expose
    private Object annualRevenue;
    @SerializedName("number_employee")
    @Expose
    private Object numberEmployee;
    @SerializedName("fax")
    @Expose
    private Object fax;
    @SerializedName("source")
    @Expose
    private Object source;
    @SerializedName("industry_id")
    @Expose
    private Object industryId;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("returned_user")
    @Expose
    private Object returnedUser;
    @SerializedName("assigned_by")
    @Expose
    private Object assignedBy;
    @SerializedName("updated_by")
    @Expose
    private Object updatedBy;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("department_id")
    @Expose
    private Object departmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeadNumber() {
        return leadNumber;
    }

    public void setLeadNumber(String leadNumber) {
        this.leadNumber = leadNumber;
    }

    public Object getSessionId() {
        return sessionId;
    }

    public void setSessionId(Object sessionId) {
        this.sessionId = sessionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public void setPrimaryNumber(String primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLeadStage() {
        return leadStage;
    }

    public void setLeadStage(String leadStage) {
        this.leadStage = leadStage;
    }

    public String getLeadType() {
        return leadType;
    }

    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    public Object getDropStatus() {
        return dropStatus;
    }

    public void setDropStatus(Object dropStatus) {
        this.dropStatus = dropStatus;
    }

    public Object getComment() {
        return comment;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Object companyName) {
        this.companyName = companyName;
    }

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public Object getStateId() {
        return stateId;
    }

    public void setStateId(Object stateId) {
        this.stateId = stateId;
    }

    public Object getCityId() {
        return cityId;
    }

    public void setCityId(Object cityId) {
        this.cityId = cityId;
    }

    public Object getPin() {
        return pin;
    }

    public void setPin(Object pin) {
        this.pin = pin;
    }

    public Object getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(Object companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public Object getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(Object annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public Object getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Object numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Object industryId) {
        this.industryId = industryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Object getReturnedUser() {
        return returnedUser;
    }

    public void setReturnedUser(Object returnedUser) {
        this.returnedUser = returnedUser;
    }

    public Object getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(Object assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Object departmentId) {
        this.departmentId = departmentId;
    }

}
