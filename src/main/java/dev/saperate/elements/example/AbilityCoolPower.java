package dev.saperate.elements.example;

import dev.saperate.elementals.data.Bender;
import dev.saperate.elementals.effects.BurnoutStatusEffect;
import dev.saperate.elementals.effects.OverchargedStatusEffect;
import dev.saperate.elementals.elements.Ability;
import dev.saperate.elementals.utils.SapsUtils;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;

public class AbilityCoolPower implements Ability {
    @Override
    public void onCall(Bender bender, long l) {
        PlayerEntity player = bender.player;

        if (!SapsUtils.safeHasStatusEffect(OverchargedStatusEffect.OVERCHARGED_EFFECT, player) && !SapsUtils.safeHasStatusEffect(BurnoutStatusEffect.BURNOUT_EFFECT, player)) {
            player.addStatusEffect(new StatusEffectInstance(OverchargedStatusEffect.OVERCHARGED_EFFECT, 500, 0, false, false, true));
        }
        onRemove(bender);
    }

    @Override
    public void onRemove(Bender bender) {
        bender.setCurrAbility(null);
    }
}
