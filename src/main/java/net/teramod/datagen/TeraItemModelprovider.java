package net.teramod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.teramod.TeramodMod;
import net.teramod.init.TeramodModItems;

public class TeraItemModelprovider extends ItemModelProvider
{
    public TeraItemModelprovider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TeramodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(TeramodModItems.MASICSTICK.get());

    }
}
