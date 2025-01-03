package dev.saperate.elements.example;

import dev.saperate.elementals.data.Bender;
import dev.saperate.elementals.elements.Ability;

public class AbilityExample1 implements Ability {
    @Override
    public void onCall(Bender bender, long l) {
        ExampleElement.getElementByName("example").getAbility(1).onCall(bender,l);
    }

    @Override
    public void onRemove(Bender bender) {

    }
}
