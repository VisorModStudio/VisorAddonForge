package your.mod.template;

import org.vmstudio.visor.api.ModLoader;
import org.vmstudio.visor.api.VisorAPI;
import your.mod.template.client.TemplateAddonClient;
import your.mod.template.common.VisorTemplate;
import your.mod.template.server.TemplateAddonServer;
import net.minecraftforge.fml.common.Mod;

@Mod(VisorTemplate.MOD_ID)
public class TemplateMod {
    public TemplateMod(){
        if(ModLoader.get().isDedicatedServer()){
            VisorAPI.registerAddon(
                    new TemplateAddonServer()
            );
        }else{
            VisorAPI.registerAddon(
                    new TemplateAddonClient()
            );
        }
    }
}
