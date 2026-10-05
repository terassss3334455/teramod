package net.teramod.datagen;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.teramod.TeramodMod;

@Mod.EventBusSubscriber(modid = TeramodMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TeraDataGenerators {
    @SubscribeEvent //登録イベント
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new TeraItemModelprovider(packOutput
                , existingFileHelper));
    }
}
