package com.program.copyonwritelist;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class App {
    private static final Logger  logger         = Logger.getLogger("App");
    private static final Integer NUM_OF_THREADS = 3;

    public static void main(String[] args) {

        // Create ExecutorService using the newFixedThreadPool() method
        // of the Executors class.
        ExecutorService executorService = Executors.newFixedThreadPool(App.NUM_OF_THREADS);

        // Create an array to store IterateMe objects.
        IterateMe[] iterateMes = new IterateMe[App.NUM_OF_THREADS];
        for (int i = 0; i < App.NUM_OF_THREADS; i++) {
            iterateMes[i] = new IterateMe("Thread-" + i, false);
        }

        // Print IterateMe.nameList original context
        logger.info("Original content:");

        // "for" variant uses internally an Iterator
        for (String name : IterateMe.getNameList()) {
            System.out.println(name);
        }

        // Execute Thread
        executorService.submit(iterateMes[0]);

        // Costly operation - A new copy of the collection is created
        IterateMe.getNameList().addIfAbsent("Oliver");

        // Execute Thread
        iterateMes[1].setGoToSleep(true);
        executorService.submit(iterateMes[1]);

        // Costly operation - A new copy of the collection is created
        IterateMe.getNameList().remove("Lex");

        // Execute Thread
        executorService.submit(iterateMes[2]);

        // Try to remove an element using Iterator methods
        // This is NOT supported by CopyOnWriteArrayList's Iterator
        Iterator<String> it = IterateMe.getNameList().iterator();
        while (it.hasNext()) {
            try {
                it.remove();
            } catch (UnsupportedOperationException uoe) {
                uoe.printStackTrace(System.err);

                break;
            }
        }

        // Shutdown ExecutionService
        executorService.shutdown();
    }
}