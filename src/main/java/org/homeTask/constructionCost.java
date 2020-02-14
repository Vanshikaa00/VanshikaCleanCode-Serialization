package org.homeTask;
public class constructionCost {
    int stdCost = 1200, abvStdCost = 1500,highStdCost = 1800,highStdAutoCost = 2500;
    public int standardHouseCost(int area) {
        return area * stdCost;
    }
    public int aboveStandardHouseCost(int area) {
        return area * abvStdCost;
    }
    public int highStandardHouseCost(int area, boolean automated) {
        int ans = 0;
        if (automated)
            ans = area * highStdAutoCost;
        else
            ans = area * highStdCost;
        return ans;
    }
}
