package culinaryCraft.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemInit {
	public static final CCItemFood ItemCorn = new ItemCorn(3, 1.5F, false);

	public static void init() {
		GameRegistry.registerItem(ItemCorn, "Corn");
	}
}
