package culinaryCraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import culinaryCraft.handler.ConfigurationHandler;
import culinaryCraft.proxy.IProxy;
import culinaryCraft.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version= Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class CulinaryCraft {
	@Instance("CulinaryCraft")
	public static CulinaryCraft instance;
	 
	@SidedProxy(clientSide = "culinaryCraft.proxy.ClientProxy", serverSide = "culinaryCraft.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
