package com.keyboard;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class Test {

    public static void main(final String[] args) throws UnsupportedEncodingException, IOException {
        int lineSize = 100_000;
        int byteSize = (lineSize / 8) + 1;
        ByteBuffer bufferLoc = ByteBuffer.allocateDirect(byteSize);
        StringBuilder builderLoc = new StringBuilder(1_000_000);
        for (int iLoc = 0; iLoc < lineSize; iLoc++) {
            builderLoc.append(UUID.randomUUID()
                                  .toString());
            builderLoc.append("  ");
            builderLoc.append("" + (5435000000L + iLoc));
            builderLoc.append("\r");
        }
        Files.write(Paths.get("./test.txt"),
                    builderLoc.toString()
                              .getBytes("ASCII"),
                    StandardOpenOption.CREATE);
        bufferLoc.putInt(100);
        bufferLoc.putInt(101);
        bufferLoc.limit(50);
        long delta = System.currentTimeMillis();

        for (int iLoc = 0; iLoc < 11_000_000; iLoc++) {
            ByteBuffer sliceLoc = bufferLoc.slice();
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));


    }
}
