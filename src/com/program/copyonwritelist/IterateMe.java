package com.program.copyonwritelist;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IterateMe implements Runnable {
    private static final CopyOnWriteArrayList<String> nameList = new CopyOnWriteArrayList<>(new String[] { "Peter",
            "Bruce", "Clark", "Barry", "Lex" });
    private final Logger logger = Logger.getLogger("IterateMe");
    private String       threadName;
    private boolean      goToSleep;

    public IterateMe() {}

    public IterateMe(String threadName, boolean goToSleep) {
        this.threadName = threadName;
        this.goToSleep  = goToSleep;
    }

    public static CopyOnWriteArrayList<String> getNameList() {
        return nameList;
    }

    public void setGoToSleep(boolean goToSleep) {
        this.goToSleep = goToSleep;
    }

    @Override
    public void run() {
        if (this.goToSleep) {
            try {
                logger.info(this.threadName + " sleeping...");
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ie) {
                logger.log(Level.SEVERE, ie.getLocalizedMessage());
            }
        }

        logger.info(this.threadName + ", nameList:");

        Iterator<String> it = nameList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
