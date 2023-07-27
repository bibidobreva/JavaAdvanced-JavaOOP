package TrafficLights;

public enum Lights {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private String nextLight;

    Lights(String nextLight) {
        this.nextLight = nextLight;
    }

    public String getNextLight() {
        return nextLight;
    }
}
