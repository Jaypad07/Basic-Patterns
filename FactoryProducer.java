package com.codegym.task.task37.task3702;

import com.codegym.task.task37.task3702.female.FemaleFactory;
import com.codegym.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    public enum HumanFactoryType {
        MALE,
        FEMALE;
    }

    public static AbstractFactory getFactory(HumanFactoryType gender) {
        if (gender == HumanFactoryType.MALE) {
            return new MaleFactory();
        }
        else return new FemaleFactory();
    }

}
