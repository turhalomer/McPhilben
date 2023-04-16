package bulldog.ravenclaw.mcphilben.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.systems.commands.Command;
import net.minecraft.command.CommandSource;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class xtest extends Command {
    public xtest() {
        super("x-test", "Debugging command to see if the client is functioning properly");
   }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            info("X-test self diagnostics complete");
            return SINGLE_SUCCESS;
        });
    }
}
