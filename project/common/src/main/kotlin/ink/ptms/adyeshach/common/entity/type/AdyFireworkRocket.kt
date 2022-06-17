package ink.ptms.adyeshach.common.entity.type

import org.bukkit.inventory.ItemStack

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
abstract class AdyFireworkRocket : AdyEntity() {

    open fun getFireworkInfo(): ItemStack {
        return getMetadata("fireworkInfo")
    }

    open fun setFireworkInfo(fireworkInfo: ItemStack) {
        setMetadata("fireworkInfo", fireworkInfo)
    }
}