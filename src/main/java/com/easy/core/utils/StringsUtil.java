package com.easy.core.utils;

/**
 * This utility class provides methods for String related operations
 * 
 * @author himanshu_shekhar
 */
public class StringsUtil {
    private StringsUtil(){}
    
    /**
     * This method replaces multiple consecutive occurrences of whitespace by a single space character
     * 
     * @param text The {@code String} for which white spaces are to be normalized
     * 
     * @return The {@String} in which multiple occurrences of consecutive whitespace are trimmed to single space character
     */
    public static String getWhitespaceNormalized(String text){
        return text.replaceAll("\\s+", " ").trim();
    }
}