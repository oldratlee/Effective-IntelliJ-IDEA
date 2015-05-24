package com.oldratlee.smart.completion.method_list;

/**
 * 自动补全的提示列表 根据 所在的外部上下文 变化。
 * 
 * @author oldratlee
 */
public class ContextAwareMethodListCompletion {
    public static void main(String[] args) {
        Person1 p1 = new Person1("jerry", "lee", 1024);

        Person2 person2 = new Person2();
        person2.setFirstName(p1.getFirstName());
        // 下面的代码的提供列表 能优先 getLastName 方法
        // person2.setLastName(p1.get
    }
}
