import java.security.InvalidParameterException;

public class Airline {

    private String name;

    public Airline (String name)
        throws InvalidParameterException {
        setName(name);
    }

    public void setName(String lineName) {
        if (lineName.length() > 8) {
            throw new InvalidParameterException("Airline name must be shorter than 8 characters.");
        }
        name = lineName;
    }

    public String getName() {
        return name;
    }
}
