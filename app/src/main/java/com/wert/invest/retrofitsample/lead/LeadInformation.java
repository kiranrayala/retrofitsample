
package com.wert.invest.retrofitsample.lead;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeadInformation {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("industries")
    @Expose
    private List<Object> industries = null;
    @SerializedName("activities")
    @Expose
    private List<Activity> activities = null;
    @SerializedName("quotations")
    @Expose
    private List<Object> quotations = null;
    @SerializedName("invoices")
    @Expose
    private List<Object> invoices = null;
    @SerializedName("notes")
    @Expose
    private List<Note> notes = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Object> getIndustries() {
        return industries;
    }

    public void setIndustries(List<Object> industries) {
        this.industries = industries;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Object> getQuotations() {
        return quotations;
    }

    public void setQuotations(List<Object> quotations) {
        this.quotations = quotations;
    }

    public List<Object> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Object> invoices) {
        this.invoices = invoices;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

}
