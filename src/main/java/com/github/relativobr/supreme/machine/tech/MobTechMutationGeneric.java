package com.github.relativobr.supreme.machine.tech;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

@Setter
@Getter
@AllArgsConstructor
public class MobTechMutationGeneric {

    ItemStack input1;
    ItemStack input2;
    int chance;
    ItemStack output;

}
