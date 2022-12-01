package me.jellysquid.mods.radon;

import me.jellysquid.mods.radon.common.dep.DependencyExtractor;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RadonMod implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("Radon");
    @Override
    public void onInitialize() {
        if (!FabricLoader.getInstance().isDevelopmentEnvironment()) {
            loadNatives();
        }
    }

    private void loadNatives() {
        DependencyExtractor.installLwjglNatives("lwjgl-lmdb", "3.2.2");
        DependencyExtractor.installLwjglNatives("lwjgl-zstd", "3.2.2");
    }
}
