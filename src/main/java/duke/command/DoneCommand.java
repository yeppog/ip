package duke.command;

import java.util.Map;
import java.util.Optional;

import duke.util.DukeConfig;
import duke.util.DukeDB;
import duke.util.DukeException;
import duke.util.DukeTaskList;
import duke.util.Parser;
import duke.util.Ui;


/**
 * The DoneCommand class encapsulates the run method for the done command.
 */
public class DoneCommand implements DukeActions {


    /**
     * Performs the actions for the DoneCommand when activated
     *
     * @param map      The parsed command
     * @param list     The tasklist
     * @param database The database to write to
     * @param config   The configuration settings
     * @param ui       The UI object to interact with
     * @return boolean to indicate the end of the listen operation
     * @throws DukeException When erroneous inputs are given.
     */
    @Override
    public Optional<String> run(Map<String, String> map, DukeTaskList list, DukeDB database, DukeConfig config, Ui ui)
            throws DukeException {

        return Optional.of(list.setDone(Parser.parseInt(map.get("done"))
                .orElseThrow(() -> new DukeException("Positional argument 'index' is not valid.")) - 1)
                .map(x -> {
                    return ui.completeTaskUpdate(x,
                            list.getSize());
                })
                .orElseThrow(() -> new DukeException("The provided index is out of bounds.")));
    }
}
