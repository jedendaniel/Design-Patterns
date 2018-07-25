package com.java.design.patterns.command;

import java.util.Date;

public abstract class Command {
    protected Date date = new Date();

    public abstract void execute();
}
