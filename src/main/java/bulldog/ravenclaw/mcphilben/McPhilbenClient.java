package bulldog.ravenclaw.mcphilben;

import bulldog.ravenclaw.mcphilben.commands.xtest;
import bulldog.ravenclaw.mcphilben.hud.HudExample;
import bulldog.ravenclaw.mcphilben.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;

public class McPhilbenClient extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Example");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing McPhilben Enviorment");


        // Modules
        Modules.get().add(new ModuleExample());

        // Commands
        Commands.get().add(new xtest());

        // HUD
        Hud.get().register(HudExample.INFO);
    }



    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "bulldog.ravenclaw.mcphilben";
    }
}
