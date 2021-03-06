package lecho.lib.hellocharts.model;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import lecho.lib.hellocharts.formatter.AxisValueFormatter;
import lecho.lib.hellocharts.formatter.SimpleAxisValueFormatter;
import lecho.lib.hellocharts.util.ChartUtils;

public class Axis {
    public static final int DEFAULT_MAX_AXIS_LABEL_CHARS = 4;
    public static final int DEFAULT_TEXT_SIZE_SP = 12;
    private AxisValueFormatter formatter = new SimpleAxisValueFormatter();
    private boolean hasLines = false;
    private boolean hasSeparationLine = true;
    private boolean hasThumb = false;
    private boolean hasTiltedLabels = false;
    private boolean isAutoGenerated = true;
    private boolean isInside = false;
    private int lineColor = ChartUtils.DEFAULT_DARKEN_COLOR;
    private int maxLabelChars = 4;
    private String name;
    private int textColor = -3355444;
    private int textSize = 12;
    private Typeface typeface;
    private List<AxisValue> values = new ArrayList();

    public Axis(List<AxisValue> values) {
        setValues(values);
    }

    public Axis(Axis axis) {
        this.name = axis.name;
        this.isAutoGenerated = axis.isAutoGenerated;
        this.hasLines = axis.hasLines;
        this.isInside = axis.isInside;
        this.textColor = axis.textColor;
        this.lineColor = axis.lineColor;
        this.textSize = axis.textSize;
        this.maxLabelChars = axis.maxLabelChars;
        this.typeface = axis.typeface;
        this.formatter = axis.formatter;
        this.hasSeparationLine = axis.hasSeparationLine;
        this.hasThumb = axis.hasThumb;
        for (AxisValue axisValue : axis.values) {
            this.values.add(new AxisValue(axisValue));
        }
    }

    public static Axis generateAxisFromRange(float start, float stop, float step) {
        List values = new ArrayList();
        float value = start;
        while (value <= stop) {
            values.add(new AxisValue(value));
            value += step;
        }
        return new Axis(values);
    }

    public static Axis generateAxisFromCollection(List<Float> axisValues) {
        List values = new ArrayList();
        int index = 0;
        for (Float floatValue : axisValues) {
            values.add(new AxisValue(floatValue.floatValue()));
            index++;
        }
        return new Axis(values);
    }

    public static Axis generateAxisFromCollection(List<Float> axisValues, List<String> axisValuesLabels) {
        if (axisValues.size() != axisValuesLabels.size()) {
            throw new IllegalArgumentException("Values and labels lists must have the same size!");
        }
        List values = new ArrayList();
        int index = 0;
        for (Float floatValue : axisValues) {
            values.add(new AxisValue(floatValue.floatValue()).setLabel((String) axisValuesLabels.get(index)));
            index++;
        }
        return new Axis(values);
    }

    public List<AxisValue> getValues() {
        return this.values;
    }

    public Axis setValues(List<AxisValue> values) {
        if (values == null) {
            this.values = new ArrayList();
        } else {
            this.values = values;
        }
        this.isAutoGenerated = false;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Axis setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isAutoGenerated() {
        return this.isAutoGenerated;
    }

    public Axis setAutoGenerated(boolean isAutoGenerated) {
        this.isAutoGenerated = isAutoGenerated;
        return this;
    }

    public boolean hasLines() {
        return this.hasLines;
    }

    public Axis setHasLines(boolean hasLines) {
        this.hasLines = hasLines;
        return this;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public Axis setTextColor(int color) {
        this.textColor = color;
        return this;
    }

    public boolean isInside() {
        return this.isInside;
    }

    public Axis setInside(boolean isInside) {
        this.isInside = isInside;
        return this;
    }

    public int getLineColor() {
        return this.lineColor;
    }

    public Axis setLineColor(int lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public Axis setTextSize(int textSize) {
        this.textSize = textSize;
        return this;
    }

    public int getMaxLabelChars() {
        return this.maxLabelChars;
    }

    public Axis setMaxLabelChars(int maxLabelChars) {
        if (maxLabelChars < 0) {
            maxLabelChars = 0;
        } else if (maxLabelChars > 32) {
            maxLabelChars = 32;
        }
        this.maxLabelChars = maxLabelChars;
        return this;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public Axis setTypeface(Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public AxisValueFormatter getFormatter() {
        return this.formatter;
    }

    public Axis setFormatter(AxisValueFormatter formatter) {
        if (formatter == null) {
            this.formatter = new SimpleAxisValueFormatter();
        } else {
            this.formatter = formatter;
        }
        return this;
    }

    public Axis setHasSeparationLine(boolean hasSeparationLine) {
        this.hasSeparationLine = hasSeparationLine;
        return this;
    }

    public boolean hasSeparationLine() {
        return this.hasSeparationLine;
    }

    public boolean hasTiltedLabels() {
        return this.hasTiltedLabels;
    }

    public Axis setHasTiltedLabels(boolean hasTiltedLabels) {
        this.hasTiltedLabels = hasTiltedLabels;
        return this;
    }
}
