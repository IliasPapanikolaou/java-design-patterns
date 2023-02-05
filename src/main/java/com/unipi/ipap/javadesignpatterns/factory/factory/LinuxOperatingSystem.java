package com.unipi.ipap.javadesignpatterns.factory.factory;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("cd " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("rm -rf " + dir);
    }
}
