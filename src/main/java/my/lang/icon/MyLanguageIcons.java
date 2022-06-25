package my.lang.icon;

import com.intellij.openapi.util.IconLoader;
import com.intellij.util.ReflectionUtil;

import javax.swing.*;

/**
 * @author yanchangyou
 */
public class MyLanguageIcons {
    static Class<?> callerClass = ReflectionUtil.getGrandCallerClass();
    public static final Icon FILE = IconLoader.findIcon("my/lang/icon/av.svg",callerClass.getClassLoader());

    public static final Icon STATEMENT = IconLoader.findIcon("my/lang/icon/action.svg",callerClass.getClassLoader());

}
