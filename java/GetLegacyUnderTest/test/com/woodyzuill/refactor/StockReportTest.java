package com.woodyzuill.refactor;

import org.junit.*;

public class StockReportTest {

    @Test
    public void firstTest() {
        StockReport stockReport = new StockReport();
        stockReport.doStockDetailReport(new Client("Bob"), "AAPL",new SecureDB());
    }
}