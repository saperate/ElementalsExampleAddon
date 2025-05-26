package dev.saperate.elements.example;

import dev.saperate.elementals.data.Bender;
import dev.saperate.elementals.elements.Ability;
import dev.saperate.elementals.utils.SapsUtils;

public class AbilityExample1 implements Ability {
    @Override
    public void onCall(Bender bender, long l) {
        ExampleElement.getElement("example").getAbility(1).onCall(bender,l);
    }

    @Override
    public void onRemove(Bender bender) {

    }
}
