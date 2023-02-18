package net.romeosnowblitz.hmh3.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class ModFluids {
    public static final FlowableFluid VITAL_FLUID_STILL = register("vital_fluid_still", new VitalFluid.Still());
    public static final FlowableFluid VITAL_FLUID_FLOWING = register("vital_fluid_flowing", new VitalFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid){
        return Registry.register(Registries.FLUID, new Identifier(Hmh3.MOD_ID, name), flowableFluid);
    }
}
