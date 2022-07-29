package com.giantshoulder.pagetype;

public enum PageType {
    FOCUS("focus"),
    ENTREPRENEUR("entrepreneur-work"),
    DIET_AND_NUTRITION("diet-and-nutrition"),
    LIFE_BALANCE("life-balance"),
    GOAL_GETTING("goal-getting"),
    SUCCESS_MINDSET("success-mindset");

    private final String urlFragment;

    PageType(String urlFragment) {
        this.urlFragment = urlFragment;
    }

    public String getUrlFragment() {
        return urlFragment;
    }
}
