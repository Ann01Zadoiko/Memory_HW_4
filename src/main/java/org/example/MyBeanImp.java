package org.example;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class MyBeanImp implements MyBean{

    private static final Logger logger = Logger.getLogger(MyBeanImp.class);

    @Override
    public void changeLogLevelInfo() {
        LogManager.getRootLogger().setLevel(Level.INFO);
    }

    @Override
    public void changeLogLevelDebug() {
        LogManager.getRootLogger().setLevel(Level.DEBUG);
    }


}
