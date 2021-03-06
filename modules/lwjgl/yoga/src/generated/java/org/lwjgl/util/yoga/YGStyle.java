/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Unstable/private API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGStyle {
 *     YGDirection direction : 2;
 *     YGFlexDirection flexDirection : 2;
 *     YGJustify justifyContent : 3;
 *     YGAlign alignContent : 3;
 *     YGAlign alignItems : 3;
 *     YGAlign alignSelf : 3;
 *     YGPositionType positionType : 1;
 *     YGWrap flexWrap : 2;
 *     YGOverflow overflow : 2;
 *     YGDisplay display : 1;
 *     {@link YGFloatOptional YGFloatOptional} flex;
 *     {@link YGFloatOptional YGFloatOptional} flexGrow;
 *     {@link YGFloatOptional YGFloatOptional} flexShrink;
 *     {@link CompactValue CompactValue} flexBasis;
 *     {@link CompactValue CompactValue} margin[9];
 *     {@link CompactValue CompactValue} positions[9];
 *     {@link CompactValue CompactValue} padding[9];
 *     {@link CompactValue CompactValue} border[9];
 *     {@link CompactValue CompactValue} dimensions[2];
 *     {@link CompactValue CompactValue} minDimensions[2];
 *     {@link CompactValue CompactValue} maxDimensions[2];
 *     {@link YGFloatOptional YGFloatOptional} aspectRatio;
 * }</code></pre>
 */
public class YGStyle extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLEX,
        FLEXGROW,
        FLEXSHRINK,
        FLEXBASIS,
        MARGIN,
        POSITIONS,
        PADDING,
        BORDER,
        DIMENSIONS,
        MINDIMENSIONS,
        MAXDIMENSIONS,
        ASPECTRATIO;

    static {
        LibYoga.initialize();

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(13);
            SIZEOF = offsets(memAddress(offsets));

            FLEX = offsets.get(0);
            FLEXGROW = offsets.get(1);
            FLEXSHRINK = offsets.get(2);
            FLEXBASIS = offsets.get(3);
            MARGIN = offsets.get(4);
            POSITIONS = offsets.get(5);
            PADDING = offsets.get(6);
            BORDER = offsets.get(7);
            DIMENSIONS = offsets.get(8);
            MINDIMENSIONS = offsets.get(9);
            MAXDIMENSIONS = offsets.get(10);
            ASPECTRATIO = offsets.get(11);

            ALIGNOF = offsets.get(12);
        }
    }

    private static native int offsets(long buffer);

    /**
     * Creates a {@code YGStyle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGStyle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code direction} field. */
    @NativeType("YGDirection")
    public int direction() { return ndirection(address()); }
    /** Returns the value of the {@code flexDirection} field. */
    @NativeType("YGFlexDirection")
    public int flexDirection() { return nflexDirection(address()); }
    /** Returns the value of the {@code justifyContent} field. */
    @NativeType("YGJustify")
    public int justifyContent() { return njustifyContent(address()); }
    /** Returns the value of the {@code alignContent} field. */
    @NativeType("YGAlign")
    public int alignContent() { return nalignContent(address()); }
    /** Returns the value of the {@code alignItems} field. */
    @NativeType("YGAlign")
    public int alignItems() { return nalignItems(address()); }
    /** Returns the value of the {@code alignSelf} field. */
    @NativeType("YGAlign")
    public int alignSelf() { return nalignSelf(address()); }
    /** Returns the value of the {@code positionType} field. */
    @NativeType("YGPositionType")
    public int positionType() { return npositionType(address()); }
    /** Returns the value of the {@code flexWrap} field. */
    @NativeType("YGWrap")
    public int flexWrap() { return nflexWrap(address()); }
    /** Returns the value of the {@code overflow} field. */
    @NativeType("YGOverflow")
    public int overflow() { return noverflow(address()); }
    /** Returns the value of the {@code display} field. */
    @NativeType("YGDisplay")
    public int display() { return ndisplay(address()); }
    /** Returns a {@link YGFloatOptional} view of the {@code flex} field. */
    public YGFloatOptional flex() { return nflex(address()); }
    /** Returns a {@link YGFloatOptional} view of the {@code flexGrow} field. */
    public YGFloatOptional flexGrow() { return nflexGrow(address()); }
    /** Returns a {@link YGFloatOptional} view of the {@code flexShrink} field. */
    public YGFloatOptional flexShrink() { return nflexShrink(address()); }
    /** Returns a {@link CompactValue} view of the {@code flexBasis} field. */
    public CompactValue flexBasis() { return nflexBasis(address()); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code margin} field. */
    @NativeType("CompactValue[9]")
    public CompactValue.Buffer margin() { return nmargin(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code margin} field. */
    public CompactValue margin(int index) { return nmargin(address(), index); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code positions} field. */
    @NativeType("CompactValue[9]")
    public CompactValue.Buffer positions() { return npositions(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code positions} field. */
    public CompactValue positions(int index) { return npositions(address(), index); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code padding} field. */
    @NativeType("CompactValue[9]")
    public CompactValue.Buffer padding() { return npadding(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code padding} field. */
    public CompactValue padding(int index) { return npadding(address(), index); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code border} field. */
    @NativeType("CompactValue[9]")
    public CompactValue.Buffer border() { return nborder(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code border} field. */
    public CompactValue border(int index) { return nborder(address(), index); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code dimensions} field. */
    @NativeType("CompactValue[2]")
    public CompactValue.Buffer dimensions() { return ndimensions(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code dimensions} field. */
    public CompactValue dimensions(int index) { return ndimensions(address(), index); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code minDimensions} field. */
    @NativeType("CompactValue[2]")
    public CompactValue.Buffer minDimensions() { return nminDimensions(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code minDimensions} field. */
    public CompactValue minDimensions(int index) { return nminDimensions(address(), index); }
    /** Returns a {@link CompactValue}.Buffer view of the {@code maxDimensions} field. */
    @NativeType("CompactValue[2]")
    public CompactValue.Buffer maxDimensions() { return nmaxDimensions(address()); }
    /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code maxDimensions} field. */
    public CompactValue maxDimensions(int index) { return nmaxDimensions(address(), index); }
    /** Returns a {@link YGFloatOptional} view of the {@code aspectRatio} field. */
    public YGFloatOptional aspectRatio() { return naspectRatio(address()); }

    // -----------------------------------

    /** Returns a new {@code YGStyle} instance for the specified memory address. */
    public static YGStyle create(long address) {
        return wrap(YGStyle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGStyle createSafe(long address) {
        return address == NULL ? null : wrap(YGStyle.class, address);
    }

    /**
     * Create a {@link YGStyle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGStyle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGStyle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #direction}. */
    public static native int ndirection(long struct);
    /** Unsafe version of {@link #flexDirection}. */
    public static native int nflexDirection(long struct);
    /** Unsafe version of {@link #justifyContent}. */
    public static native int njustifyContent(long struct);
    /** Unsafe version of {@link #alignContent}. */
    public static native int nalignContent(long struct);
    /** Unsafe version of {@link #alignItems}. */
    public static native int nalignItems(long struct);
    /** Unsafe version of {@link #alignSelf}. */
    public static native int nalignSelf(long struct);
    /** Unsafe version of {@link #positionType}. */
    public static native int npositionType(long struct);
    /** Unsafe version of {@link #flexWrap}. */
    public static native int nflexWrap(long struct);
    /** Unsafe version of {@link #overflow}. */
    public static native int noverflow(long struct);
    /** Unsafe version of {@link #display}. */
    public static native int ndisplay(long struct);
    /** Unsafe version of {@link #flex}. */
    public static YGFloatOptional nflex(long struct) { return YGFloatOptional.create(struct + YGStyle.FLEX); }
    /** Unsafe version of {@link #flexGrow}. */
    public static YGFloatOptional nflexGrow(long struct) { return YGFloatOptional.create(struct + YGStyle.FLEXGROW); }
    /** Unsafe version of {@link #flexShrink}. */
    public static YGFloatOptional nflexShrink(long struct) { return YGFloatOptional.create(struct + YGStyle.FLEXSHRINK); }
    /** Unsafe version of {@link #flexBasis}. */
    public static CompactValue nflexBasis(long struct) { return CompactValue.create(struct + YGStyle.FLEXBASIS); }
    /** Unsafe version of {@link #margin}. */
    public static CompactValue.Buffer nmargin(long struct) { return CompactValue.create(struct + YGStyle.MARGIN, 9); }
    /** Unsafe version of {@link #margin(int) margin}. */
    public static CompactValue nmargin(long struct, int index) {
        return CompactValue.create(struct + YGStyle.MARGIN + check(index, 9) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #positions}. */
    public static CompactValue.Buffer npositions(long struct) { return CompactValue.create(struct + YGStyle.POSITIONS, 9); }
    /** Unsafe version of {@link #positions(int) positions}. */
    public static CompactValue npositions(long struct, int index) {
        return CompactValue.create(struct + YGStyle.POSITIONS + check(index, 9) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #padding}. */
    public static CompactValue.Buffer npadding(long struct) { return CompactValue.create(struct + YGStyle.PADDING, 9); }
    /** Unsafe version of {@link #padding(int) padding}. */
    public static CompactValue npadding(long struct, int index) {
        return CompactValue.create(struct + YGStyle.PADDING + check(index, 9) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #border}. */
    public static CompactValue.Buffer nborder(long struct) { return CompactValue.create(struct + YGStyle.BORDER, 9); }
    /** Unsafe version of {@link #border(int) border}. */
    public static CompactValue nborder(long struct, int index) {
        return CompactValue.create(struct + YGStyle.BORDER + check(index, 9) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #dimensions}. */
    public static CompactValue.Buffer ndimensions(long struct) { return CompactValue.create(struct + YGStyle.DIMENSIONS, 2); }
    /** Unsafe version of {@link #dimensions(int) dimensions}. */
    public static CompactValue ndimensions(long struct, int index) {
        return CompactValue.create(struct + YGStyle.DIMENSIONS + check(index, 2) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #minDimensions}. */
    public static CompactValue.Buffer nminDimensions(long struct) { return CompactValue.create(struct + YGStyle.MINDIMENSIONS, 2); }
    /** Unsafe version of {@link #minDimensions(int) minDimensions}. */
    public static CompactValue nminDimensions(long struct, int index) {
        return CompactValue.create(struct + YGStyle.MINDIMENSIONS + check(index, 2) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #maxDimensions}. */
    public static CompactValue.Buffer nmaxDimensions(long struct) { return CompactValue.create(struct + YGStyle.MAXDIMENSIONS, 2); }
    /** Unsafe version of {@link #maxDimensions(int) maxDimensions}. */
    public static CompactValue nmaxDimensions(long struct, int index) {
        return CompactValue.create(struct + YGStyle.MAXDIMENSIONS + check(index, 2) * CompactValue.SIZEOF);
    }
    /** Unsafe version of {@link #aspectRatio}. */
    public static YGFloatOptional naspectRatio(long struct) { return YGFloatOptional.create(struct + YGStyle.ASPECTRATIO); }

    // -----------------------------------

    /** An array of {@link YGStyle} structs. */
    public static class Buffer extends StructBuffer<YGStyle, Buffer> {

        private static final YGStyle ELEMENT_FACTORY = YGStyle.create(-1L);

        /**
         * Creates a new {@code YGStyle.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGStyle#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected YGStyle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code direction} field. */
        @NativeType("YGDirection")
        public int direction() { return YGStyle.ndirection(address()); }
        /** Returns the value of the {@code flexDirection} field. */
        @NativeType("YGFlexDirection")
        public int flexDirection() { return YGStyle.nflexDirection(address()); }
        /** Returns the value of the {@code justifyContent} field. */
        @NativeType("YGJustify")
        public int justifyContent() { return YGStyle.njustifyContent(address()); }
        /** Returns the value of the {@code alignContent} field. */
        @NativeType("YGAlign")
        public int alignContent() { return YGStyle.nalignContent(address()); }
        /** Returns the value of the {@code alignItems} field. */
        @NativeType("YGAlign")
        public int alignItems() { return YGStyle.nalignItems(address()); }
        /** Returns the value of the {@code alignSelf} field. */
        @NativeType("YGAlign")
        public int alignSelf() { return YGStyle.nalignSelf(address()); }
        /** Returns the value of the {@code positionType} field. */
        @NativeType("YGPositionType")
        public int positionType() { return YGStyle.npositionType(address()); }
        /** Returns the value of the {@code flexWrap} field. */
        @NativeType("YGWrap")
        public int flexWrap() { return YGStyle.nflexWrap(address()); }
        /** Returns the value of the {@code overflow} field. */
        @NativeType("YGOverflow")
        public int overflow() { return YGStyle.noverflow(address()); }
        /** Returns the value of the {@code display} field. */
        @NativeType("YGDisplay")
        public int display() { return YGStyle.ndisplay(address()); }
        /** Returns a {@link YGFloatOptional} view of the {@code flex} field. */
        public YGFloatOptional flex() { return YGStyle.nflex(address()); }
        /** Returns a {@link YGFloatOptional} view of the {@code flexGrow} field. */
        public YGFloatOptional flexGrow() { return YGStyle.nflexGrow(address()); }
        /** Returns a {@link YGFloatOptional} view of the {@code flexShrink} field. */
        public YGFloatOptional flexShrink() { return YGStyle.nflexShrink(address()); }
        /** Returns a {@link CompactValue} view of the {@code flexBasis} field. */
        public CompactValue flexBasis() { return YGStyle.nflexBasis(address()); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code margin} field. */
        @NativeType("CompactValue[9]")
        public CompactValue.Buffer margin() { return YGStyle.nmargin(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code margin} field. */
        public CompactValue margin(int index) { return YGStyle.nmargin(address(), index); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code positions} field. */
        @NativeType("CompactValue[9]")
        public CompactValue.Buffer positions() { return YGStyle.npositions(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code positions} field. */
        public CompactValue positions(int index) { return YGStyle.npositions(address(), index); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code padding} field. */
        @NativeType("CompactValue[9]")
        public CompactValue.Buffer padding() { return YGStyle.npadding(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code padding} field. */
        public CompactValue padding(int index) { return YGStyle.npadding(address(), index); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code border} field. */
        @NativeType("CompactValue[9]")
        public CompactValue.Buffer border() { return YGStyle.nborder(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code border} field. */
        public CompactValue border(int index) { return YGStyle.nborder(address(), index); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code dimensions} field. */
        @NativeType("CompactValue[2]")
        public CompactValue.Buffer dimensions() { return YGStyle.ndimensions(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code dimensions} field. */
        public CompactValue dimensions(int index) { return YGStyle.ndimensions(address(), index); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code minDimensions} field. */
        @NativeType("CompactValue[2]")
        public CompactValue.Buffer minDimensions() { return YGStyle.nminDimensions(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code minDimensions} field. */
        public CompactValue minDimensions(int index) { return YGStyle.nminDimensions(address(), index); }
        /** Returns a {@link CompactValue}.Buffer view of the {@code maxDimensions} field. */
        @NativeType("CompactValue[2]")
        public CompactValue.Buffer maxDimensions() { return YGStyle.nmaxDimensions(address()); }
        /** Returns a {@link CompactValue} view of the struct at the specified index of the {@code maxDimensions} field. */
        public CompactValue maxDimensions(int index) { return YGStyle.nmaxDimensions(address(), index); }
        /** Returns a {@link YGFloatOptional} view of the {@code aspectRatio} field. */
        public YGFloatOptional aspectRatio() { return YGStyle.naspectRatio(address()); }

    }

}