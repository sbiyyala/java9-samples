package jug.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

/**
 * Created by shishir.biyyala on 10/8/17.
 */
public class ApiDriver {

    private static final Logger LOGGER = Logger.getLogger(valueOf(ApiDriver.class));

    public static void main(String args[]) {

        LOGGER.info(String.format("List of integers before java 9 %s",
                getImmutableListOfIds_before()));

        LOGGER.info(String.format("List of integers using the new factory: %s",
                getImmutableListOfIds_java9()));
    }

    private static List<Integer> getImmutableListOfIds_before() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        return Collections.unmodifiableList(ids);
    }

    private static List<Integer> getImmutableListOfIds_java9() {
        return List.of(1, 2,  3);
    }
}
