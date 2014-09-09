package culinaryCraft.items;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;
import culinaryCraft.blocks.BlockInit;

public class ItemInit {
	public static final CCItemFood ItemCorn = new ItemCorn(3, 1.5F, false);
	public static final CCItemSeed ItemCornSeeds = new ItemCornSeeds(BlockInit.BlockCornPlant, Blocks.farmland);

	public static void init() {
		GameRegistry.registerItem(ItemCorn, "Corn");
		GameRegistry.registerItem(ItemCornSeeds, "CornSeeds");
	}
}
