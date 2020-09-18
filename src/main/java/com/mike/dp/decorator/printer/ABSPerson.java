package com.mike.dp.decorator.printer;

import lombok.Getter;

@Getter
public abstract class ABSPerson implements ISpeak {
    protected String name = "";

    public abstract String speak();
}
