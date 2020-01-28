
package com.wert.invest.retrofitsample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_number")
    @Expose
    private Object userNumber;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("work_number")
    @Expose
    private String workNumber;
    @SerializedName("personal_number")
    @Expose
    private String personalNumber;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("city_id")
    @Expose
    private Object cityId;
    @SerializedName("state_id")
    @Expose
    private Object stateId;
    @SerializedName("country_id")
    @Expose
    private Object countryId;
    @SerializedName("date_expired")
    @Expose
    private String dateExpired;
    @SerializedName("company_id")
    @Expose
    private String companyId;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("company_code")
    @Expose
    private Object companyCode;
    @SerializedName("company_address")
    @Expose
    private Object companyAddress;
    @SerializedName("company_website")
    @Expose
    private Object companyWebsite;
    @SerializedName("company_mobile")
    @Expose
    private Object companyMobile;
    @SerializedName("company_email")
    @Expose
    private Object companyEmail;
    @SerializedName("company_fax")
    @Expose
    private Object companyFax;
    @SerializedName("created_by")
    @Expose
    private Object createdBy;
    @SerializedName("updated_by")
    @Expose
    private Object updatedBy;
    @SerializedName("assign_to")
    @Expose
    private Object assignTo;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("is_delete")
    @Expose
    private Object isDelete;
    @SerializedName("deleted_by")
    @Expose
    private Object deletedBy;
    @SerializedName("deleted_date")
    @Expose
    private Object deletedDate;
    @SerializedName("random_unique_number")
    @Expose
    private String randomUniqueNumber;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("country_code")
    @Expose
    private String countryCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Object userNumber) {
        this.userNumber = userNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Object getCityId() {
        return cityId;
    }

    public void setCityId(Object cityId) {
        this.cityId = cityId;
    }

    public Object getStateId() {
        return stateId;
    }

    public void setStateId(Object stateId) {
        this.stateId = stateId;
    }

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public String getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(String dateExpired) {
        this.dateExpired = dateExpired;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Object getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Object companyCode) {
        this.companyCode = companyCode;
    }

    public Object getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Object companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Object getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(Object companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public Object getCompanyMobile() {
        return companyMobile;
    }

    public void setCompanyMobile(Object companyMobile) {
        this.companyMobile = companyMobile;
    }

    public Object getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(Object companyEmail) {
        this.companyEmail = companyEmail;
    }

    public Object getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(Object companyFax) {
        this.companyFax = companyFax;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Object getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(Object assignTo) {
        this.assignTo = assignTo;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public Object getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Object deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Object getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Object deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getRandomUniqueNumber() {
        return randomUniqueNumber;
    }

    public void setRandomUniqueNumber(String randomUniqueNumber) {
        this.randomUniqueNumber = randomUniqueNumber;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
