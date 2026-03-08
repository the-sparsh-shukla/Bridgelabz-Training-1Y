package com.access.two;

import com.access.one.AccessOneHelper;

public class AccessTwoHelper {
    public String getCombinedName() {
        AccessOneHelper accessOneHelper = new AccessOneHelper();
        return accessOneHelper.getSourceName() + "->AccessTwo";
    }
}