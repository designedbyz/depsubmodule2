package com.designedbyz.depsubmodule2;

import com.designedbyz.depsubmodule.StringTest;

public class TestClass {
    public static String LowerCase(String text) {
        return text.toLowerCase();
    }

    public static String toUperCase(String text) {
        return StringTest.capitalizeText(text);
    }
}
