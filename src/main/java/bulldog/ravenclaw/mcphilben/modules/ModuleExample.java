package bulldog.ravenclaw.mcphilben.modules;

import bulldog.ravenclaw.mcphilben.McPhilben;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(McPhilben.CATEGORY, "example", "An example module in a custom category.");
    }
}
