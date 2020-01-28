
package com.wert.invest.retrofitsample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalModel {

    @SerializedName("GoalsList")
    @Expose
    private List<GoalsList> goalsList = null;

    public List<GoalsList> getGoalsList() {
        return goalsList;
    }

    public void setGoalsList(List<GoalsList> goalsList) {
        this.goalsList = goalsList;
    }

}
