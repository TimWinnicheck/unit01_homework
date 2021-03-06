package com.win.java.se.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderTest {
    @Test
    public void toReadableTest() throws Exception {

        Reader RD = new Reader("./src/main/java/com/win/java/se/resources/task3.html");
        System.out.println(RD.toReadable());

    }

    @Test
    public void outputUsingStringsoutTest() throws Exception {

        Reader RD = new Reader("./src/main/java/com/win/java/se/resources/task3.html");
        String[] Text = RD.splitter(RD.toReadable());
        RD.stringsOut(Text);
    }

    @Test
    public void findPicturesTest() throws Exception {

        Reader RD = new Reader("./src/main/java/com/win/java/se/resources/task3.html");
        String[] Text = RD.splitter(RD.findPictures(RD.toReadable()));
        RD.stringsOut(Text);
    }

    @Test
    public void isSequentialTest() throws Exception {

        Reader RD = new Reader("./src/main/java/com/win/java/se/resources/task3.html");
        Boolean Result = RD.isSequential(RD.findPictures(RD.toReadable()));
        assertFalse(Result);
    }

}