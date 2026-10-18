package your.mod.template.client;

import org.vmstudio.visor.api.common.addon.VisorAddon;
import your.mod.template.common.VisorTemplate;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TemplateAddonClient implements VisorAddon {

    @Override
    public void onAddonLoad() {
    }

    @Override
    public @Nullable String getAddonPackagePath() {
        return "your.mod.template.client";
    }

    @Override
    public @NotNull String getAddonId() {
        return VisorTemplate.MOD_ID;
    }

    @Override
    public @NotNull Component getAddonName() {
        return Component.literal(VisorTemplate.MOD_NAME);
    }

    @Override
    public String getModId() {
        return VisorTemplate.MOD_ID;
    }
}
