package com.keyboard;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static String svgHeader  = "<svg width='2480px' height='3508px' viewBox='0 0 2480 3508' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' class='keycaps-root'>\n";
    private static String linkString = "<link href='https://fonts.googleapis.com/css?family=Roboto&amp;display=swap' rel='stylesheet'/>\n";

    private static String styleString = "<style type='text/css'>\n"
                                        + ".keycaps-root {\n"
                                        + "  font-size:40px;\n"
                                        + "  font-family: 'Roboto', sans-serif;\n"
                                        + "}\n"
                                        + ".keycap-rec {\n"
                                        + "  stroke: black;\n"
                                        + "  fill: white;\n"
                                        + "}\n"
                                        + ".keycap-1-text {\n"
                                        + "  stroke: none;\n"
                                        + "  fill: black;\n"
                                        + "  font-size:1em;\n"
                                        + "  font-weight:500;\n"
                                        + "  dominant-baseline: middle;\n"
                                        + "}\n"
                                        + ".keycap-2-text {\n"
                                        + "  stroke: none;\n"
                                        + "  fill: black;\n"
                                        + "  font-size:0.6em;\n"
                                        + "  font-weight:600;\n"
                                        + "  dominant-baseline: middle;\n"
                                        + "}\n"
                                        + ".keycap-3-text {\n"
                                        + "  stroke: none;\n"
                                        + "  fill: black;\n"
                                        + "  font-size:0.6em;\n"
                                        + "  font-weight:700;\n"
                                        + "  dominant-baseline: middle;\n"
                                        + "}\n"
                                        + ".keycap-4-text {\n"
                                        + "  stroke: none;\n"
                                        + "  fill: black;\n"
                                        + "  font-size:0.4em;\n"
                                        + "  font-weight:500;\n"
                                        + "  dominant-baseline: middle;\n"
                                        + "}\n"
                                        + ".keycap-shift-text {\n"
                                        + "  stroke: none;\n"
                                        + "  fill: black;\n"
                                        + "  font-size:0.6em;\n"
                                        + "  font-weight:500;\n"
                                        + "  dominant-baseline: middle;\n"
                                        + "}\n"
                                        + ".keycap-alt-text {\n"
                                        + "  stroke: none;\n"
                                        + "  fill: black;\n"
                                        + "  font-size:0.6em;\n"
                                        + "  font-weight:500;\n"
                                        + "  dominant-baseline: middle;\n"
                                        + "}\n"
                                        + "</style>\n";


    private static String oneString = "<svg x='svgX' y='svgY' height='svgHeight' width='svgWeight'>\n"
                                      + " <g>\n"
                                      + "  <rect x='0' y='0' height='svgHeight' width='svgWeight' class='keycap-rec'/>\n"
                                      + "  <text x='TextX' y='TextY' dominant-baseline='middle' text-anchor='middle' class='keyCapStyle'>TextValue</text>\n"
                                      + "  <polyline stroke='orange' points='40,0 40,80'></polyline>"
                                      + "  <polyline stroke='orange' points='0,40 80,40'></polyline>"

                                      + " </g>\n"
                                      + "</svg>\n";


    private static String twoString = "<svg x='svgX' y='svgY' height='svgHeight' width='svgWeight'>\n"
                                      + " <g>\n"
                                      + "  <rect x='0' y='0' height='svgHeight' width='svgWeight' class='keycap-rec'/>\n"
                                      + "  <text x='TextShiftX' y='TextShiftY' dominant-baseline='middle' text-anchor='middle' class='keycap-shift-text'>TextShiftValue</text>\n"
                                      + "  <text x='TextX' y='TextY' dominant-baseline='middle' text-anchor='middle' class='keycap-text'>TextValue</text>\n"
                                      + " </g>\n"
                                      + "</svg>\n";

    private static String threeString = "<svg x='svgX' y='svgY' height='svgHeight' width='svgWeight'>\n"
                                        + " <g>\n"
                                        + "  <rect x='0' y='0' height='svgHeight' width='svgWeight' class='keycap-rec'/>\n"
                                        + "  <text x='TextShiftX' y='TextShiftY' dominant-baseline='middle' text-anchor='middle' class='keycap-shift-text'>TextShiftValue</text>\n"
                                        + "  <text x='TextAltX' y='TextAltY' dominant-baseline='middle' text-anchor='middle' class='keycap-alt-text'>TextAltValue</text>\n"
                                        + "  <text x='TextX' y='TextY' dominant-baseline='middle' text-anchor='middle' class='keycap-text'>TextValue</text>\n"
                                        + " </g>\n"
                                        + "</svg>\n";

    //    String threeString = "<svg x='164' y='4' height='76' width='76'>\n"
    //                         + " <g>\n"
    //                         + "  <rect x='0' y='0' height='76' width='76' class='keycap-rec'/>\n"
    //                         + "  <text x='15%' y='25%' dominant-baseline='middle' text-anchor='middle' class='keycap-shift-text'>!</text>\n"
    //                         + "  <text x='15%' y='75%' dominant-baseline='middle' text-anchor='middle' class='keycap-alt-text'>£</text>\n"
    //                         + "  <text x='50%' y='50%' dominant-baseline='middle' text-anchor='middle' class='keycap-text'>1</text>\n"
    //                         + " </g>\n"
    //                         + "</svg>\n";

    private static int column = 10;
    // private static String keycaps = "Q-,-W-,-!1-,-'£2";
    private static String keycaps = "é<\"-,-!>1-,-'£2-,-^#3-,-+$4-,-%½5-,-&¾6-,-/{7-,-([8-,-)]9-,-=}0-,-?\\*-,-_|--,-;`,-,-:.-,-Q-,-W-,-E-,-R-,-T-,-Y-,-U-,-I-,-O-,-P-,-Ğ-,-Ü-,-A-,-S-,-D-,-F-,-G-,-H-,-J-,-K-,-L-,-Ş-,-İ-,-Z-,-X-,-C-,-V-,-B-,-N-,-M-,-Ö-,-Ç-,-#1$2$ESC#-,-#1$2$F1#-,-#1$2$F2#-,-#1$2$F3#-,-#1$2$F4#-,-#1$2$F5#-,-#1$2$F6#-,-#1$2$F7#-,-#1$2$F8#-,-#1$2$F9#-,-#1$2$F10#-,-#1$2$F11#-,-#1$2$F12#-,-#1$2$PRT#-,-#1$2$SL#-,-#1$2$PA#-,-#1$2$INS#-,-#1$2$DEL#-,-#1$2$Home#-,-#1$2$End#-,-#1$2$PageUp#-,-#1$2$PD#-,-#2.25$2$Shift#-,-#1.75$2$Shift#-,-#1.25$2$Alt#-,-#1.25$2$Alt#";

    private static int key1U_H             = 80;
    private static int key1U_W             = 80;
    private static int spaceBetweenKeyCaps = 4;

    private static int startX = 10;
    private static int startY = 10;

    private static String mainKeyCapX = "50%";
    private static String mainKeyCapY = "50%";


    private static String mainKeyCapX_2  = "50%";
    private static String mainKeyCapY_2  = "75%";
    private static String shiftKeyCapX_2 = "50%";
    private static String shiftKeyCapY_2 = "25%";

    private static String mainKeyCapX_3  = "60%";
    private static String mainKeyCapY_3  = "50%";
    private static String shiftKeyCapX_3 = "25%";
    private static String shiftKeyCapY_3 = "25%";
    private static String altKeyCapX_3   = "25%";
    private static String altKeyCapY_3   = "75%";

    public static void main(final String[] args) throws IOException {
        String[] splitLoc = Main.keycaps.split("-,-");

        StringBuilder builderLoc = new StringBuilder(10_000);
        builderLoc.append(Main.svgHeader);
        builderLoc.append(Main.linkString);
        builderLoc.append(Main.styleString); // Font weight
        int oneRowMax = (Main.key1U_W * Main.column) + (Main.spaceBetweenKeyCaps * Main.column);

        int rowX = Main.startX;
        int rowIndex = 0;
        for (int iLoc = 0; iLoc < splitLoc.length; iLoc++) {
            if (rowX >= oneRowMax) {
                rowIndex++;
                rowX = Main.startX;
            }
            int y = (rowIndex * Main.key1U_H) + (Main.spaceBetweenKeyCaps * rowIndex) + Main.startY;
            int x = rowX;
            //            int rowCalculated = iLoc / Main.column;
            //            int columnCalculated = iLoc - ((iLoc / Main.column) * Main.column);
            //            int y = (rowCalculated * Main.key1U_H) + (Main.spaceBetweenKeyCaps * rowCalculated) + Main.startY;
            //            int x = (columnCalculated * Main.key1U_W) + (Main.spaceBetweenKeyCaps * columnCalculated) + Main.startX;
            String str = null;
            String key = splitLoc[iLoc];
            int typeOfKeycap = 1;
            int U1Width = Main.key1U_W;
            String charStyle = "keycap-1-text";
            if (key.length() > 1) {
                if (key.startsWith("#") && key.endsWith("#")) {
                    key = key.substring(1,
                                        key.length() - 1);
                    String[] split2Loc = key.split("\\$");
                    U1Width = (int) (Main.key1U_W * Float.parseFloat(split2Loc[0]));
                    key = split2Loc[2];
                    charStyle = "keycap-" + split2Loc[1] + "-text";
                } else {
                    typeOfKeycap = key.length();
                }
            }
            rowX = rowX + U1Width + Main.spaceBetweenKeyCaps;
            if (typeOfKeycap == 1) {
                str = Main.oneString;
                str = str.replace("svgX",
                                  "" + x)
                         .replace("svgY",
                                  "" + y)
                         .replace("svgHeight",
                                  "" + Main.key1U_H)
                         .replace("svgWeight",
                                  "" + U1Width)
                         .replace("TextX",
                                  Main.mainKeyCapX)
                         .replace("TextY",
                                  Main.mainKeyCapY)
                         .replace("keyCapStyle",
                                  charStyle)
                         .replace("TextValue",
                                  StringUtils.encodeHtml(key));
            } else if (typeOfKeycap == 2) {
                str = Main.twoString;
                str = str.replace("svgX",
                                  "" + x)
                         .replace("svgY",
                                  "" + y)
                         .replace("svgHeight",
                                  "" + Main.key1U_H)
                         .replace("svgWeight",
                                  "" + Main.key1U_W)
                         .replace("TextX",
                                  Main.mainKeyCapX_2)
                         .replace("TextY",
                                  Main.mainKeyCapY_2)
                         .replace("TextShiftX",
                                  Main.shiftKeyCapX_2)
                         .replace("TextShiftY",
                                  Main.shiftKeyCapY_2)
                         .replace("TextShiftValue",
                                  StringUtils.encodeHtml("" + splitLoc[iLoc].charAt(0)))
                         .replace("TextValue",
                                  StringUtils.encodeHtml("" + splitLoc[iLoc].charAt(1)));
            } else if (typeOfKeycap == 3) {
                str = Main.threeString;
                str = str.replace("svgX",
                                  "" + x)
                         .replace("svgY",
                                  "" + y)
                         .replace("svgHeight",
                                  "" + Main.key1U_H)
                         .replace("svgWeight",
                                  "" + Main.key1U_W)
                         .replace("TextX",
                                  Main.mainKeyCapX_3)
                         .replace("TextY",
                                  Main.mainKeyCapY_3)
                         .replace("TextShiftX",
                                  Main.shiftKeyCapX_3)
                         .replace("TextShiftY",
                                  Main.shiftKeyCapY_3)
                         .replace("TextAltX",
                                  Main.altKeyCapX_3)
                         .replace("TextAltY",
                                  Main.altKeyCapY_3)
                         .replace("TextShiftValue",
                                  StringUtils.encodeHtml("" + splitLoc[iLoc].charAt(0)))
                         .replace("TextAltValue",
                                  StringUtils.encodeHtml("" + splitLoc[iLoc].charAt(1)))
                         .replace("TextValue",
                                  StringUtils.encodeHtml("" + splitLoc[iLoc].charAt(2)));
            }

            builderLoc.append(str)
                      .append("\n");

        }
        builderLoc.append("</svg>\n");
        System.out.println(builderLoc.toString());

        String svgText = builderLoc.toString();
        System.out.println(builderLoc.toString());
        Path sal = Paths.get("./keyboard.svg");

        System.out.println(sal.toAbsolutePath()
                              .toString());
        Files.write(sal,
                    svgText.getBytes(Charset.forName("UTF-8")));

    }
}
