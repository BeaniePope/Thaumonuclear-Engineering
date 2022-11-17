package com.GitHub.BeaniePope.ThaumoNuclear.init;
import akka.io.Tcp;
import com.GitHub.BeaniePope.ThaumoNuclear.ThaumoNuclear;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.



public class itemInit extends Item {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThaumoNuclear.MODID);
    public static final RegistryObject<Item> gay = ITEMS.register("gay", () -> new Item(new Item.Properties()));

}