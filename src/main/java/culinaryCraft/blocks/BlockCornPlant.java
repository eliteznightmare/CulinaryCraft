package culinaryCraft.blocks;

import java.util.ArrayList;
import java.util.Random;

import culinaryCraft.items.ItemCorn;
import culinaryCraft.items.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class BlockCornPlant extends CCBlockCrop implements IPlantable {

	public BlockCornPlant() {
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Crop;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		return this;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		return 7;
	}

	@Override
	public int getRenderType() {
		return 1;
	}
	@Override
	protected Item func_149866_i() {
		return ItemInit.ItemCorn;
	}
	@Override
	protected Item func_149865_P()
    {
        return null;
    }
	 @Override
	    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	    {
	        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);

	        if (metadata >= 7)
	        {
	            for (int i = 0; i < 3 + fortune; ++i)
	            {
	                if (world.rand.nextInt(15) <= metadata)
	                {
	                    ret.add(new ItemStack(this.func_149866_i(), 1, 0));
	                }
	            }
	        }
	        return ret;
	}
}