package bulldog.ravenclaw.mcphilben.modules;

import bulldog.ravenclaw.mcphilben.McPhilbenClient;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(McPhilbenClient.CATEGORY, "example", "An example module in a custom category.");
    }
}
