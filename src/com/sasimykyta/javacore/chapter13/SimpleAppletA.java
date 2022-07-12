package com.sasimykyta.javacore.chapter13;

import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/

public class SimpleAppletA extends Applet{
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}