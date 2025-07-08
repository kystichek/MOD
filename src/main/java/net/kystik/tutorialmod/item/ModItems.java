package net.kystik.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kystik.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item POVESTka = registerItem("povestka", new Item(new Item.Settings()));

   private static Item registerItem(String name, Item item){
       return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
   }

    public static void registerMoDItems(){
        TutorialMod.LOGGER.info("vse ok");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(POVESTka);
        });
    }
}
