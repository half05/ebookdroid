package org.emdev.fonts.typeface;

import org.emdev.fonts.data.FontStyle;

import android.graphics.Typeface;

public class TypefaceEx {

    public final Typeface typeface;
    public final FontStyle style;
    public final boolean fakeBold;

    public TypefaceEx(final Typeface typeface, final FontStyle style, final boolean fakeBold) {
        this.typeface = typeface;
        this.style = style;
        this.fakeBold = fakeBold;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(this.getClass().getSimpleName());
        buf.append("[");

        buf.append("tf").append("=").append(typeface);
        buf.append(", ");
        buf.append("style").append("=").append(style.getResValue());
        buf.append(", ");
        buf.append("fakeBold").append("=").append(fakeBold);

        buf.append("]");

        return buf.toString();
    }
}
