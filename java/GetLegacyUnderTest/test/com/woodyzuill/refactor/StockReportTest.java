package com.woodyzuill.refactor;

import org.junit.*;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class StockReportTest {

    @Test
    public void firstTest() {
        final FakeCommunicator dest = new FakeCommunicator(null);
        final Stock aapl = new Stock("AAPL");
        aapl.setPrice(new BigDecimal(123));
        StockReport.exposeStatic("AAPL", dest, new Stock[]{aapl});
        assertEquals("AAPL, 123.00", dest.getMessage());
    }

    private class FakeCommunicator extends Communicator {
        private String message = "";

        public FakeCommunicator(SecureDB secureDB) {
            super(secureDB);
        }

        @Override
        protected void checkConnection(SecureDB db) {
            // ignore
        }

        @Override
        public void sendNotification(String message, String url) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }
    }
}