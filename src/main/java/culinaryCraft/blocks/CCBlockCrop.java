package culinaryCraft.blocks;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import culinaryCraft.Reference;
import culinaryCraft.items.ItemInit;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class CCBlockCrop extends BlockCrops {
	private IIcon[] IconData;

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (meta < 0 || meta > 7) {
			meta = 7;
		}
		return this.IconData[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.IconData = new IIcon[8];
		for (int i = 0; i < this.IconData.length; ++i) {
			blockIcon = iconRegister.registerIcon(String.format("%s",
					getUnwrappedUnlocalizedName(this.getUnlocalizedName()))
					+ "_stage_" + i);
		}
	}
}