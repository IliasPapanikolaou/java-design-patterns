package com.unipi.ipap.javadesignpatterns.factory.factory;

public class WindowsOperatingSystem extends OperatingSystem {

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("cd " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("rmdir " + dir);
    }
}
