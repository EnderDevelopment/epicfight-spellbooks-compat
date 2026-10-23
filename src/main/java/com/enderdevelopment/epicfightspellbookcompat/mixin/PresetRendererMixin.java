package com.enderdevelopment.epicfightspellbookcompat.mixin;

import com.enderdevelopment.epicfightspellbookcompat.EpicFightSpellbooksCompat;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib.animatable.GeoEntity;

@Mixin(EntityRenderer.class)
public abstract class PresetRendererMixin {
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private <T extends Entity> void onRender(T entity, float yaw, float tickDelta, CallbackInfo ci) {
        if (entity instanceof GeoEntity) {
            EpicFightSpellbooksCompat.LOGGER.info("Cancelling Epic Fight renderer for GeckoLib animatable entity");
            ci.cancel();
        }
    }
}