package bulldog.ravenclaw.mcphilben.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.systems.commands.Command;
import net.minecraft.command.CommandSource;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;
public class mcphilben extends Command {
    public mcphilben() {
        super("mcphilben", "Base command for the McPhilben addon");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            info("McPhilbenClient is loaded :)");
            info("run the x-test command for debug");
            return SINGLE_SUCCESS;
        });
    }
}
