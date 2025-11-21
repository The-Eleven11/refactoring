package theater;

/**
 * Class representing a paly.
 */
public class Play {
    /**
     * Class representing a paly.
     */

    private String name;
    private String type;

    public Play(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
