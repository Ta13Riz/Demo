package az.spring.demo;

public class Device {
    private String name;
    private String version;

    public Device(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public Device() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
