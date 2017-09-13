package com.easy.core.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringsUtilTest {
    
    @Test
    public void canNormalizeWhitespace(){
        String text = "This contains        some        whitespaces ";
        assertEquals("Cannot normalize whitespaces", "This contains some whitespaces", StringsUtil.getWhitespaceNormalized(text));
    }
}