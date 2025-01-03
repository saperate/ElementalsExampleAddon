package dev.saperate.elements.example;

import dev.saperate.elementals.data.Bender;
import dev.saperate.elementals.elements.Element;
import dev.saperate.elementals.elements.Upgrade;

public class ExampleElement extends Element {
    public ExampleElement() {
        super("example", new Upgrade("root", 0));
        addAbility(new AbilityExample1(),true);
        addAbility(new AbilityCoolPower());
    }

    @Override
    public boolean isSkillTreeComplete(Bender bender) {
        return false;
    }
}
