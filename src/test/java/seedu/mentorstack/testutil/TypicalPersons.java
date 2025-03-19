package seedu.mentorstack.testutil;

import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_SUB_FRIEND;
import static seedu.mentorstack.logic.commands.CommandTestUtil.VALID_SUB_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.mentorstack.model.Mentorstack;
import seedu.mentorstack.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withPhone("94351253")
            .withSubjects("CS1010S").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withSubjects("CS1010C", "CS2100").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com")
            .withSubjects("CS1010C", "CS2100").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withSubjects("CS2106").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withSubjects("CS1010C", "CS2100").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withSubjects("CS1010C", "CS2100").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withSubjects("CS1010C", "CS2100").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withSubjects("CS1101").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withSubjects("CS2100").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withSubjects(VALID_SUB_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withSubjects(VALID_SUB_HUSBAND, VALID_SUB_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code Mentorstack} with all the typical persons.
     */
    public static Mentorstack getTypicalMentorstack() {
        Mentorstack ab = new Mentorstack();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
