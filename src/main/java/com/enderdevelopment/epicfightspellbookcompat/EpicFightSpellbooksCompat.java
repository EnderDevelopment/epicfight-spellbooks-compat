package com.enderdevelopment.epicfightspellbookcompat;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("epicfightspellbookcompat")
public class EpicFightSpellbooksCompat {
    public static final Logger LOGGER = LogManager.getLogger("EpicFightSpellbooksCompat");

    public EpicFightSpellbooksCompat() {
        LOGGER.info("Epic Fight Spellbooks Compat loaded successfully");
    }
}