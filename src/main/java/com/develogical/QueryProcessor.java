package com.develogical;

import java.util.HashMap;
import java.util.Map;

public class QueryProcessor {

    Map<String, String> map;

    public QueryProcessor() {
        this.map = new HashMap<>();
        this.map.put("shakespeare", "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                "English poet, playwright, and actor, widely regarded as the greatest " +
                "writer in the English language and the world's pre-eminent dramatist.");
        this.map.put("heroku", "Heroku is a cloud platform as a service supporting several programming languages." +
                "One of the first cloud platforms, Heroku has been in development since June 2007," +
                " when it supported only the Ruby programming language, but now supports Java," +
                "Node.js, Scala, Clojure, Python, PHP, and Go.");
        this.map.put("what is your name", "dhru_peacock");
    }


    public String process(String query) {
        if (query.contains("following numbers is the largest:")) {
            String[] sp = query.split(":");
            String[] nums = sp[1].split(",");
            int max = Integer.parseInt(nums[0]);
            for (int i = 1; i < nums.length; i++) {
                if (max < Integer.parseInt(nums[i])) {
                    max = Integer.parseInt(nums[i]);
                }
            }
            return String.valueOf(max);
        }
        return map.getOrDefault(query.toLowerCase(), "");
    }
}
