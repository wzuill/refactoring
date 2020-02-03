package com.woodyzuill.refactor;

public class DefaultSecureDB {
    {
        thisIsBad();
    }

    private void thisIsBad() {
        throw new RuntimeException("I told you this is bad"    );
    }

    public boolean checkConnection() {
        return false;
    }
}
