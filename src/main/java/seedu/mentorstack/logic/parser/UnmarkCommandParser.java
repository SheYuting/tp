package seedu.mentorstack.logic.parser;

import static seedu.mentorstack.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.Set;

import seedu.mentorstack.commons.core.index.Index;
import seedu.mentorstack.logic.commands.UnmarkCommand;
import seedu.mentorstack.logic.parser.exceptions.ParseException;
import seedu.mentorstack.logic.parser.exceptions.ParseWithHintException;

/**
 * Parses input arguments and creates a new UnmarkCommand object
 */
public class UnmarkCommandParser extends CommandParser implements Parser<UnmarkCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the UnmarkCommand
     * and returns a UnmarkCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public UnmarkCommand parse(String args) throws ParseException, ParseWithHintException {
        try {
            Set<Index> index = ParserUtil.parseIndexes(args);
            return new UnmarkCommand(index);
        } catch (ParseException pe) {
            throw new ParseWithHintException(
                    String.format(
                        MESSAGE_INVALID_COMMAND_FORMAT,
                        UnmarkCommand.MESSAGE_USAGE),
                        pe,
                        "INDEX [INDEX] [INDEX]"
                    );
        }
    }

}
