package com.tmdt.shop_service.utils;

public class StringUtils {
    public static String likeLowerContentString(String str) {
        if (str == null) return "%%";
        if (str.trim().isEmpty()) return "%%";
        return "%" + str.toLowerCase().trim() + "%";
    }
}
