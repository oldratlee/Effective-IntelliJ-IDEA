package com.oldratlee.polyglot.refactor;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author oldratlee
 */
public class PolyglotRefactor {
    public static void main(String[] args) throws Exception {
        final InputStream resourceAsStream = PolyglotRefactor.class.getClassLoader().getResourceAsStream("PolyglotRefactor.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);

        // 可以在 Key1 上执行『重命名』重构，会一并改好 PolyglotRefactor.properties 中Key名
        System.out.println(properties.getProperty("key1"));
    }
}
