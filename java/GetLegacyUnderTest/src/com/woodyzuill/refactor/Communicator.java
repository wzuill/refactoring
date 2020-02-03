package com.woodyzuill.refactor;

public class Communicator {
    public Communicator(SecureDB db) {
        checkConnection(db);
    }

    protected void checkConnection(SecureDB db) {
        if(!db.checkConnection()) {
            throw new RuntimeException();
        }
    }

    public void sendNotification(String message, String url) {
        throw (new RuntimeException("Well, this is awkward..."));
    }
}
