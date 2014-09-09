package culinaryCraft.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import culinaryCraft.Reference;

public class CCItemSeed extends ItemSeeds{
	public CCItemSeed(Block plant, Block soil) {
		super(plant, soil);
	}
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", unwrappname(super.getUnlocalizedName()));
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", unwrappname(super.getUnlocalizedName()));
	}
	protected String unwrappname(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+ 1);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
