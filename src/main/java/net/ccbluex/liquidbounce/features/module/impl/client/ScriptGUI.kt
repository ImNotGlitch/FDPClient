/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.features.module.impl.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.ui.client.gui.modernui.GuiScriptLoadMenu

@ModuleInfo(name = "ScriptGUI", category = ModuleCategory.CLIENT, canEnable = false)
object ScriptGUI : Module() {
    override fun onEnable() {
        mc.displayGuiScreen(GuiScriptLoadMenu())
    }
}