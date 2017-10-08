package jug.api;

import java.util.List;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

/**
 * Created by shishir.biyyala on 10/8/17.
 */
public class ApiDriver {

    private static final Logger LOGGER = Logger.getLogger(valueOf(ApiDriver.class));

    public static void main(String args[]) {
        List<Integer> integers = List.of(1, 2, 4, 5);
        LOGGER.info(String.format("List of integers using the new factory: %s", integers));
    }
}
