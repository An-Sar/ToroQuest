package net.torocraft.toroquest.material;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.torocraft.toroquest.ToroQuest;

public class ArmorMaterials {
	
	private static final String MODID = ToroQuest.MODID;
	
	public static ArmorMaterial KING = EnumHelper.addArmorMaterial("KING", MODID + ":kingArmor", 36, new int[] { 3, 6, 8, 3 }, 25, null, 2);
	public static ArmorMaterial HEAVY_DIAMOND = EnumHelper.addArmorMaterial("HEAVY_DIAMOND", MODID + ":heavyDiamondArmor", 30, new int[] { 3, 6, 8, 3 }, 5, null, 2);
	public static ArmorMaterial BULL = EnumHelper.addArmorMaterial("BULL", MODID + ":bullArmor", 10, new int[] { 2, 5, 4, 1 }, 25, null, 0);
	public static ArmorMaterial SAMURAI = EnumHelper.addArmorMaterial("SAMURAI", MODID + ":samuraiArmor", 10, new int[] { 3, 6, 8, 3 }, 25, null, 0);

}
