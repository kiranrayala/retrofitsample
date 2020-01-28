package com.wert.invest.retrofitsample;

public class MyPojo
{
    private GoalsList[] GoalsList;

    public GoalsList[] getGoalsList ()
    {
        return GoalsList;
    }

    public void setGoalsList (GoalsList[] GoalsList)
    {
        this.GoalsList = GoalsList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GoalsList = "+GoalsList+"]";
    }
}

