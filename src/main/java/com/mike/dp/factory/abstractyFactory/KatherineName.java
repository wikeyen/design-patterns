package com.mike.dp.factory.abstractyFactory;

import com.mike.dp.factory.abstractyFactory.factories.FemaleNameFactory;

public class KatherineName extends FemaleNameFactory {
    @Override
    public IFirstName createFirstName() {
        return new KatherineFirstName();
    }

    @Override
    public ILastName createLastName() {
        return new KatherineLastName();
    }
}
