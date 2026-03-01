package your.mod.example;

import org.vmstudio.visor.api.ModLoader;
import org.vmstudio.visor.api.VisorAPI;
import your.mod.example.client.ExampleAddonClient;
import your.mod.example.common.VisorExample;
import your.mod.example.server.ExampleAddonServer;
import net.minecraftforge.fml.common.Mod;

@Mod(VisorExample.MOD_ID)
public class ExampleMod {
    public ExampleMod(){
        if(ModLoader.get().isDedicatedServer()){
            VisorAPI.registerAddon(
                    new ExampleAddonServer()
            );
        }else{
            VisorAPI.registerAddon(
                    new ExampleAddonClient()
            );
        }
    }
}
