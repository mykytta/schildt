package com.sasimykyta.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String args[]) {
        String dirname = "src/com/sasimykyta/javacore";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("chapter");
        String s[] = f1.list(only);
        for (int i=0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
