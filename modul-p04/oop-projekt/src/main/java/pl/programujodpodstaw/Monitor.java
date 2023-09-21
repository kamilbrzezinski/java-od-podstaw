package pl.programujodpodstaw;

public class Monitor {
    private final String name;
    private int width;
    private int height;

    public Monitor(String name) {
        this.name = name;

        setHighResolution();
    }

    public void setHighResolution() {
        width = 3840;
        height = 1920;
    }

    public void setLowResolution() {
        width = 800;
        height = 600;
    }

    public String getResolution() {
        return width + "x" + height;
    }
}
