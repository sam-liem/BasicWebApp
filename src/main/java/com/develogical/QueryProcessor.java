package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("heroku")) {
            return "Heroku is a cloud platform as a service supporting several programming languages." +
                    "One of the first cloud platforms, Heroku has been in development since June 2007," +
                    " when it supported only the Ruby programming language, but now supports Java," +
                    "Node.js, Scala, Clojure, Python, PHP, and Go.";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "dhru_peacock";
        }
        return "";
    }
}
