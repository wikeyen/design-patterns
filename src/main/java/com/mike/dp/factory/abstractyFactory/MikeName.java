package com.mike.dp.factory.abstractyFactory;

import com.mike.dp.factory.abstractyFactory.factories.MaleNameFactory;

public class MikeName extends MaleNameFactory {
    @Override
    public IFirstName createFirstName() {
        return new MikeFirstName();
    }

    @Override
    public ILastName createLastName() {
        return new MikeLastName();
    }
}
