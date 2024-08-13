package com.molybdenum.alloyed.forge;

import java.util.List;

import com.molybdenum.alloyed.Alloyed;
import com.molybdenum.alloyed.multiloader.Env;

import net.minecraftforge.common.util.MavenVersionStringHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.language.IModInfo;

@Mod(Alloyed.MOD_ID)
@Mod.EventBusSubscriber
public class AlloyedImpl {

    static IEventBus bus;

    public AlloyedImpl() {
        bus = FMLJavaModLoadingContext.get().getModEventBus();
        Alloyed.init();
        //noinspection Convert2MethodRef
        Env.CLIENT.runIfCurrent(() -> () -> AlloyedClientImpl.init());
    }

    public static String findVersion() {
        String versionString = "UNKNOWN";

        List<IModInfo> infoList = ModList.get().getModFileById(Alloyed.MOD_ID).getMods();
        if (infoList.size() > 1) {
            Alloyed.LOGGER.error("Multiple mods for MOD_ID: " + Alloyed.MOD_ID);
        }
        for (IModInfo info : infoList) {
            if (info.getModId().equals(Alloyed.MOD_ID)) {
                versionString = MavenVersionStringHelper.artifactVersionToString(info.getVersion());
                break;
            }
        }
        return versionString;
    }

    public static void finalizeRegistrate() {
        Alloyed.registrate().registerEventListeners(bus);
    }
}
