package chronosacaria.mcdw.weapons;

import chronosacaria.mcdw.bases.McdwDagger;
import net.minecraft.item.ToolMaterials;

public class Daggers {
    public static McdwDagger DAGGER_DAGGER;
    public static McdwDagger DAGGER_ETERNAL_KNIFE;
    public static McdwDagger DAGGER_FANGS_OF_FROST;
    public static McdwDagger DAGGER_MOON;
    public static McdwDagger DAGGER_SOUL_KNIFE;

    public static void init() {
        DAGGER_DAGGER = new McdwDagger(ToolMaterials.IRON, 2, -1.3F, "dagger_dagger");
        DAGGER_FANGS_OF_FROST = new McdwDagger(ToolMaterials.IRON, 3, -1.3F, "dagger_fangs_of_frost");
        DAGGER_MOON = new McdwDagger(ToolMaterials.IRON, 4, -1.3F, "dagger_moon");
        DAGGER_SOUL_KNIFE = new McdwDagger(ToolMaterials.IRON, 5, -1.1F, "dagger_soul_knife");
        DAGGER_ETERNAL_KNIFE = new McdwDagger(ToolMaterials.DIAMOND, 5, -0.9F, "dagger_eternal_knife");
    }
}


