package com.mike.dp.factory.abstractyFactory.factories;

import com.mike.dp.factory.abstractyFactory.IFirstName;
import com.mike.dp.factory.abstractyFactory.ILastName;

/**
 * define the process, and subclasses are a whole group of the same kind,
 * they all need to follow the same process
 */
public interface AbsNameFactory {
    IFirstName createFirstName();

    ILastName createLastName();
}
