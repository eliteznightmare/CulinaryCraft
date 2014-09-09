package culinaryCraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final CCBlockCrop BlockCornPlant = new BlockCornPlant();
	
	public static void init() {
		GameRegistry.registerBlock(BlockCornPlant, "CornPlant");
	}

}
