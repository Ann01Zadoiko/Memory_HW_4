package org.example;

import org.apache.log4j.Logger;

import javax.management.*;
import java.lang.management.ManagementFactory;


public class App {

    private static final Logger logger = Logger.getLogger(App.class);

    private static MBeanServer makeMBeanService() throws NotCompliantMBeanException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        StandardMBean standardMBean = new StandardMBean(new MyBeanImp(), MyBean.class);
        ObjectName objectName = new ObjectName("com.example:type=MyBean");
        mBeanServer.registerMBean(standardMBean,objectName);

        return mBeanServer;
    }


    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mBeanServer = makeMBeanService();
        Task task = new Task();
        logger.info("\nChanged text: " + task.changeText());
    }
}
