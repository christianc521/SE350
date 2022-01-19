import java.security.InvalidParameterException;

import static java.lang.Character.isUpperCase;

public class Airport {

    private String name;

    public Airport (String name)
        throws InvalidParameterException {
        setName(name);
    }

    public void setName(String aName) {
        if (aName == null) {
            throw new InvalidParameterException("Null value passed in for Airport Name.");
        }
        if (aName.length() != 3) {
            throw new InvalidParameterException("Invalid length.");
        }
        for (int i = 0; i < aName.length(); i++) {
            if (!(isUpperCase(aName.charAt(i))) || !(Character.isLetter(aName.charAt(i)))) {
                throw new InvalidParameterException("Invalid character in Airport Name.");
            }
        }
        name = aName;
    }

    public String getName()
    {
        return name;
    }
}
