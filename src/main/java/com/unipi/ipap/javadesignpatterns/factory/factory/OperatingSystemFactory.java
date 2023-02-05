package com.unipi.ipap.javadesignpatterns.factory.factory;

public class OperatingSystemFactory {

    // Constructor is private and can be created only via getInstance methods
    private OperatingSystemFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not Supported");
        }
    }
}
