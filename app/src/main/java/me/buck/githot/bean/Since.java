package me.buck.githot.bean;

/**
 * Created by gwf on 2019/6/27
 */
public class Since {

    public static Since DAY = new Since("daily", "Day");
    public static Since WEEK = new Since("weekly", "Week");
    public static Since MONTH = new Since("monthly", "Month");

    public  String urlParam;
    public  String name;

    private Since(String urlParam, String name) {
        this.urlParam = urlParam;
        this.name = name;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public String getName() {
        return name;
    }
}
