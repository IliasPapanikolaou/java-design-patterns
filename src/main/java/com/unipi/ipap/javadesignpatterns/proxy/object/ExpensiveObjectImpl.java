package com.unipi.ipap.javadesignpatterns.proxy.object;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {

    Logger logger = Logger.getLogger(ExpensiveObjectImpl.class.getName());

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    private void heavyInitialConfiguration() {
        logger.log(Level.INFO, "Loading initial configuration...");
    }

    @Override
    public void process() {
        logger.log(Level.INFO, "Processing complete.");
    }
}
