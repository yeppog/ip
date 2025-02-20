package duke.command;

import java.util.Map;
import java.util.Optional;

import duke.util.DukeConfig;
import duke.util.DukeDB;
import duke.util.DukeException;
import duke.util.DukeTaskList;
import duke.util.Ui;


/**
 * The DukeActions interfaces encapsulates the run method for the any command.
 */
public interface DukeActions {


    /**
     * Performs the actions for a command when activated
     *
     * @param map      The parsed command
     * @param list     The tasklist
     * @param database The database to write to
     * @param config   The configuration settings
     * @param ui       The UI object to interact with
     * @return boolean to indicate the end of the listen operation
     * @throws DukeException When erroneous inputs are given.
     */

    public Optional<String> run(Map<String, String> map, DukeTaskList list, DukeDB database, DukeConfig config, Ui ui)
            throws DukeException;
}
