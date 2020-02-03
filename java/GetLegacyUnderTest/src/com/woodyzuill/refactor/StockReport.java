package com.woodyzuill.refactor;

import java.util.Arrays;

public class StockReport {

    private DefaultSecureDB alternateDB;

    public StockReport() {
        alternateDB = new DefaultSecureDB();
    }

    public void doReport(Client client, SecureDB db) {
        Communicator dest = new Communicator(db);
        for (Stock r : client.stocks(db)) {
            dest.sendNotification(String.format("%s, %.2f", client.id, r.getSymbol()), "http://thisisnotatest.or");
        }
    }

    // Use for testing Expose Static Method
    public void doStockDetailReport(Client client, String symbol, SecureDB db) {
        Communicator dest = new Communicator(db);
        final Stock locatedStock = Arrays.stream(client.stocks(db))
                .filter(stock -> stock.getSymbol().equals(symbol))
                .findFirst()
                .get();
        dest.sendNotification(String.format("%s, %.2f", locatedStock.getSymbol(), locatedStock.getPrice()), "http://thisisnotatest.or");
    }
}
