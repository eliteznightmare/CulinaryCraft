package culinaryCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import culinaryCraft.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CCItem extends Item{
	public CCItem(){
		super();
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
