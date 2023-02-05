package cc.noxiuam.mainmenus.ui.mainmenu.type.cheatbreaker.legacy.element;

import cc.noxiuam.mainmenus.ui.AbstractElement;
import cc.noxiuam.mainmenus.ui.data.FontRegistry;
import lombok.Getter;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;

public class LegacyMainMenuButton extends AbstractElement {

    @Getter private final String text;
    private final boolean showBackground;

    public LegacyMainMenuButton(String text, boolean showBackground) {
        this.text = text;
        this.showBackground = showBackground;
    }

    @Override
    protected void handleElementDraw(float mouseX, float mouseY, boolean hovering) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

        boolean mouseOver = this.isMouseInside(mouseX, mouseY);

        if (this.showBackground) {
            Gui.drawRect(
                    (int) this.xPosition,
                    (int) this.yPosition,
                    (int) (this.xPosition + this.width),
                    (int) (this.yPosition + this.height),
                    mouseOver ? -15395563 : -14540254);
        }

        int textColor = -3092272;
        if (mouseOver) {
            textColor = -1;
        }

        FontRegistry.playRegular16px.drawCenteredString(
                        this.text,
                        this.xPosition + this.width / 2,
                        this.yPosition + this.height / 2 - 5,
                        textColor
                );
    }

}
