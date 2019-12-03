package com.keyboard;


import java.util.HashMap;

public class StringUtils {

    private static final HashMap<Character, String> htmlEncodeChars = new HashMap<>();

    static {

        // Special characters for HTML

        StringUtils.htmlEncodeChars.put('\'',
                                        "&apos;");
        StringUtils.htmlEncodeChars.put('\u0026',
                                        "&amp;");
        StringUtils.htmlEncodeChars.put('\u003C',
                                        "&lt;");
        StringUtils.htmlEncodeChars.put('\u003E',
                                        "&gt;");
        StringUtils.htmlEncodeChars.put('\u0022',
                                        "&quot;");

        //        StringUtils.htmlEncodeChars.put('\u0152',
        //                                        "&OElig;");
        //        StringUtils.htmlEncodeChars.put('\u0153',
        //                                        "&oelig;");
        //        StringUtils.htmlEncodeChars.put('\u0160',
        //                                        "&Scaron;");
        //        StringUtils.htmlEncodeChars.put('\u0161',
        //                                        "&scaron;");
        //        StringUtils.htmlEncodeChars.put('\u0178',
        //                                        "&Yuml;");
        //        StringUtils.htmlEncodeChars.put('\u02C6',
        //                                        "&circ;");
        //        StringUtils.htmlEncodeChars.put('\u02DC',
        //                                        "&tilde;");
        //        StringUtils.htmlEncodeChars.put('\u2002',
        //                                        "&ensp;");
        //        StringUtils.htmlEncodeChars.put('\u2003',
        //                                        "&emsp;");
        //        StringUtils.htmlEncodeChars.put('\u2009',
        //                                        "&thinsp;");
        //        StringUtils.htmlEncodeChars.put('\u200C',
        //                                        "&zwnj;");
        //        StringUtils.htmlEncodeChars.put('\u200D',
        //                                        "&zwj;");
        //        StringUtils.htmlEncodeChars.put('\u200E',
        //                                        "&lrm;");
        //        StringUtils.htmlEncodeChars.put('\u200F',
        //                                        "&rlm;");
        //        StringUtils.htmlEncodeChars.put('\u2013',
        //                                        "&ndash;");
        //        StringUtils.htmlEncodeChars.put('\u2014',
        //                                        "&mdash;");
        //        StringUtils.htmlEncodeChars.put('\u2018',
        //                                        "&lsquo;");
        //        StringUtils.htmlEncodeChars.put('\u2019',
        //                                        "&rsquo;");
        //        StringUtils.htmlEncodeChars.put('\u201A',
        //                                        "&sbquo;");
        //        StringUtils.htmlEncodeChars.put('\u201C',
        //                                        "&ldquo;");
        //        StringUtils.htmlEncodeChars.put('\u201D',
        //                                        "&rdquo;");
        //        StringUtils.htmlEncodeChars.put('\u201E',
        //                                        "&bdquo;");
        //        StringUtils.htmlEncodeChars.put('\u2020',
        //                                        "&dagger;");
        //        StringUtils.htmlEncodeChars.put('\u2021',
        //                                        "&Dagger;");
        //        StringUtils.htmlEncodeChars.put('\u2030',
        //                                        "&permil;");
        //        StringUtils.htmlEncodeChars.put('\u2039',
        //                                        "&lsaquo;");
        //        StringUtils.htmlEncodeChars.put('\u203A',
        //                                        "&rsaquo;");
        //        StringUtils.htmlEncodeChars.put('\u20AC',
        //                                        "&euro;");
        //
        //        // Character entity references for ISO 8859-1 characters
        //        StringUtils.htmlEncodeChars.put('\u00A0',
        //                                        "&nbsp;");
        //        StringUtils.htmlEncodeChars.put('\u00A1',
        //                                        "&iexcl;");
        //        StringUtils.htmlEncodeChars.put('\u00A2',
        //                                        "&cent;");
        //        StringUtils.htmlEncodeChars.put('\u00A4',
        //                                        "&curren;");
        //        StringUtils.htmlEncodeChars.put('\u00A5',
        //                                        "&yen;");
        //        StringUtils.htmlEncodeChars.put('\u00A6',
        //                                        "&brvbar;");
        //        StringUtils.htmlEncodeChars.put('\u00A7',
        //                                        "&sect;");
        //        StringUtils.htmlEncodeChars.put('\u00A8',
        //                                        "&uml;");
        //        StringUtils.htmlEncodeChars.put('\u00A9',
        //                                        "&copy;");
        //        StringUtils.htmlEncodeChars.put('\u00AA',
        //                                        "&ordf;");
        //        StringUtils.htmlEncodeChars.put('\u00AB',
        //                                        "&laquo;");
        //        StringUtils.htmlEncodeChars.put('\u00AC',
        //                                        "&not;");
        //        StringUtils.htmlEncodeChars.put('\u00AD',
        //                                        "&shy;");
        //        StringUtils.htmlEncodeChars.put('\u00AE',
        //                                        "&reg;");
        //        StringUtils.htmlEncodeChars.put('\u00AF',
        //                                        "&macr;");
        //        StringUtils.htmlEncodeChars.put('\u00B0',
        //                                        "&deg;");
        //        StringUtils.htmlEncodeChars.put('\u00B1',
        //                                        "&plusmn;");
        //        StringUtils.htmlEncodeChars.put('\u00B2',
        //                                        "&sup2;");
        //        StringUtils.htmlEncodeChars.put('\u00B3',
        //                                        "&sup3;");
        //        StringUtils.htmlEncodeChars.put('\u00B4',
        //                                        "&acute;");
        //        StringUtils.htmlEncodeChars.put('\u00B5',
        //                                        "&micro;");
        //        StringUtils.htmlEncodeChars.put('\u00B6',
        //                                        "&para;");
        //        StringUtils.htmlEncodeChars.put('\u00B7',
        //                                        "&middot;");
        //        StringUtils.htmlEncodeChars.put('\u00B8',
        //                                        "&cedil;");
        //        StringUtils.htmlEncodeChars.put('\u00B9',
        //                                        "&sup1;");
        //        StringUtils.htmlEncodeChars.put('\u00BA',
        //                                        "&ordm;");
        //        StringUtils.htmlEncodeChars.put('\u00BB',
        //                                        "&raquo;");
        //        StringUtils.htmlEncodeChars.put('\u00BC',
        //                                        "&frac14;");
        //        StringUtils.htmlEncodeChars.put('\u00BD',
        //                                        "&frac12;");
        //        StringUtils.htmlEncodeChars.put('\u00BE',
        //                                        "&frac34;");
        //        StringUtils.htmlEncodeChars.put('\u00BF',
        //                                        "&iquest;");
        //        StringUtils.htmlEncodeChars.put('\u00C0',
        //                                        "&Agrave;");
        //        StringUtils.htmlEncodeChars.put('\u00C1',
        //                                        "&Aacute;");
        //        StringUtils.htmlEncodeChars.put('\u00C2',
        //                                        "&Acirc;");
        //        StringUtils.htmlEncodeChars.put('\u00C3',
        //                                        "&Atilde;");
        //        StringUtils.htmlEncodeChars.put('\u00C4',
        //                                        "&Auml;");
        //        StringUtils.htmlEncodeChars.put('\u00C5',
        //                                        "&Aring;");
        //        StringUtils.htmlEncodeChars.put('\u00C6',
        //                                        "&AElig;");
        //        StringUtils.htmlEncodeChars.put('\u00C7',
        //                                        "&Ccedil;");
        //        StringUtils.htmlEncodeChars.put('\u00C8',
        //                                        "&Egrave;");
        //        StringUtils.htmlEncodeChars.put('\u00C9',
        //                                        "&Eacute;");
        //        StringUtils.htmlEncodeChars.put('\u00CA',
        //                                        "&Ecirc;");
        //        StringUtils.htmlEncodeChars.put('\u00CB',
        //                                        "&Euml;");
        //        StringUtils.htmlEncodeChars.put('\u00CC',
        //                                        "&Igrave;");
        //        StringUtils.htmlEncodeChars.put('\u00CD',
        //                                        "&Iacute;");
        //        StringUtils.htmlEncodeChars.put('\u00CE',
        //                                        "&Icirc;");
        //        StringUtils.htmlEncodeChars.put('\u00CF',
        //                                        "&Iuml;");
        //        StringUtils.htmlEncodeChars.put('\u00D0',
        //                                        "&ETH;");
        //        StringUtils.htmlEncodeChars.put('\u00D1',
        //                                        "&Ntilde;");
        //        StringUtils.htmlEncodeChars.put('\u00D2',
        //                                        "&Ograve;");
        //        StringUtils.htmlEncodeChars.put('\u00D3',
        //                                        "&Oacute;");
        //        StringUtils.htmlEncodeChars.put('\u00D4',
        //                                        "&Ocirc;");
        //        StringUtils.htmlEncodeChars.put('\u00D5',
        //                                        "&Otilde;");
        //        StringUtils.htmlEncodeChars.put('\u00D6',
        //                                        "&Ouml;");
        //        StringUtils.htmlEncodeChars.put('\u00D7',
        //                                        "&times;");
        //        StringUtils.htmlEncodeChars.put('\u00D8',
        //                                        "&Oslash;");
        //        StringUtils.htmlEncodeChars.put('\u00D9',
        //                                        "&Ugrave;");
        //        StringUtils.htmlEncodeChars.put('\u00DA',
        //                                        "&Uacute;");
        //        StringUtils.htmlEncodeChars.put('\u00DB',
        //                                        "&Ucirc;");
        //        StringUtils.htmlEncodeChars.put('\u00DC',
        //                                        "&Uuml;");
        //        StringUtils.htmlEncodeChars.put('\u00DD',
        //                                        "&Yacute;");
        //        StringUtils.htmlEncodeChars.put('\u00DE',
        //                                        "&THORN;");
        //        StringUtils.htmlEncodeChars.put('\u00DF',
        //                                        "&szlig;");
        //        StringUtils.htmlEncodeChars.put('\u00E0',
        //                                        "&agrave;");
        //        StringUtils.htmlEncodeChars.put('\u00E1',
        //                                        "&aacute;");
        //        StringUtils.htmlEncodeChars.put('\u00E2',
        //                                        "&acirc;");
        //        StringUtils.htmlEncodeChars.put('\u00E3',
        //                                        "&atilde;");
        //        StringUtils.htmlEncodeChars.put('\u00E4',
        //                                        "&auml;");
        //        StringUtils.htmlEncodeChars.put('\u00E5',
        //                                        "&aring;");
        //        StringUtils.htmlEncodeChars.put('\u00E6',
        //                                        "&aelig;");
        //        StringUtils.htmlEncodeChars.put('\u00E7',
        //                                        "&ccedil;");
        //        StringUtils.htmlEncodeChars.put('\u00E8',
        //                                        "&egrave;");
        //        StringUtils.htmlEncodeChars.put('\u00E9',
        //                                        "&eacute;");
        //        StringUtils.htmlEncodeChars.put('\u00EA',
        //                                        "&ecirc;");
        //        StringUtils.htmlEncodeChars.put('\u00EB',
        //                                        "&euml;");
        //        StringUtils.htmlEncodeChars.put('\u00EC',
        //                                        "&igrave;");
        //        StringUtils.htmlEncodeChars.put('\u00ED',
        //                                        "&iacute;");
        //        StringUtils.htmlEncodeChars.put('\u00EE',
        //                                        "&icirc;");
        //        StringUtils.htmlEncodeChars.put('\u00EF',
        //                                        "&iuml;");
        //        StringUtils.htmlEncodeChars.put('\u00F0',
        //                                        "&eth;");
        //        StringUtils.htmlEncodeChars.put('\u00F1',
        //                                        "&ntilde;");
        //        StringUtils.htmlEncodeChars.put('\u00F2',
        //                                        "&ograve;");
        //        StringUtils.htmlEncodeChars.put('\u00F3',
        //                                        "&oacute;");
        //        StringUtils.htmlEncodeChars.put('\u00F4',
        //                                        "&ocirc;");
        //        StringUtils.htmlEncodeChars.put('\u00F5',
        //                                        "&otilde;");
        //        StringUtils.htmlEncodeChars.put('\u00F6',
        //                                        "&ouml;");
        //        StringUtils.htmlEncodeChars.put('\u00F7',
        //                                        "&divide;");
        //        StringUtils.htmlEncodeChars.put('\u00F8',
        //                                        "&oslash;");
        //        StringUtils.htmlEncodeChars.put('\u00F9',
        //                                        "&ugrave;");
        //        StringUtils.htmlEncodeChars.put('\u00FA',
        //                                        "&uacute;");
        //        StringUtils.htmlEncodeChars.put('\u00FB',
        //                                        "&ucirc;");
        //        StringUtils.htmlEncodeChars.put('\u00FC',
        //                                        "&uuml;");
        //        StringUtils.htmlEncodeChars.put('\u00FD',
        //                                        "&yacute;");
        //        StringUtils.htmlEncodeChars.put('\u00FE',
        //                                        "&thorn;");
        //        StringUtils.htmlEncodeChars.put('\u00FF',
        //                                        "&yuml;");
        //
        //        // Mathematical, Greek and Symbolic characters for HTML
        //        StringUtils.htmlEncodeChars.put('\u0192',
        //                                        "&fnof;");
        //        StringUtils.htmlEncodeChars.put('\u0391',
        //                                        "&Alpha;");
        //        StringUtils.htmlEncodeChars.put('\u0392',
        //                                        "&Beta;");
        //        StringUtils.htmlEncodeChars.put('\u0393',
        //                                        "&Gamma;");
        //        StringUtils.htmlEncodeChars.put('\u0394',
        //                                        "&Delta;");
        //        StringUtils.htmlEncodeChars.put('\u0395',
        //                                        "&Epsilon;");
        //        StringUtils.htmlEncodeChars.put('\u0396',
        //                                        "&Zeta;");
        //        StringUtils.htmlEncodeChars.put('\u0397',
        //                                        "&Eta;");
        //        StringUtils.htmlEncodeChars.put('\u0398',
        //                                        "&Theta;");
        //        StringUtils.htmlEncodeChars.put('\u0399',
        //                                        "&Iota;");
        //        StringUtils.htmlEncodeChars.put('\u039A',
        //                                        "&Kappa;");
        //        StringUtils.htmlEncodeChars.put('\u039B',
        //                                        "&Lambda;");
        //        StringUtils.htmlEncodeChars.put('\u039C',
        //                                        "&Mu;");
        //        StringUtils.htmlEncodeChars.put('\u039D',
        //                                        "&Nu;");
        //        StringUtils.htmlEncodeChars.put('\u039E',
        //                                        "&Xi;");
        //        StringUtils.htmlEncodeChars.put('\u039F',
        //                                        "&Omicron;");
        //        StringUtils.htmlEncodeChars.put('\u03A0',
        //                                        "&Pi;");
        //        StringUtils.htmlEncodeChars.put('\u03A1',
        //                                        "&Rho;");
        //        StringUtils.htmlEncodeChars.put('\u03A3',
        //                                        "&Sigma;");
        //        StringUtils.htmlEncodeChars.put('\u03A4',
        //                                        "&Tau;");
        //        StringUtils.htmlEncodeChars.put('\u03A5',
        //                                        "&Upsilon;");
        //        StringUtils.htmlEncodeChars.put('\u03A6',
        //                                        "&Phi;");
        //        StringUtils.htmlEncodeChars.put('\u03A7',
        //                                        "&Chi;");
        //        StringUtils.htmlEncodeChars.put('\u03A8',
        //                                        "&Psi;");
        //        StringUtils.htmlEncodeChars.put('\u03A9',
        //                                        "&Omega;");
        //        StringUtils.htmlEncodeChars.put('\u03B1',
        //                                        "&alpha;");
        //        StringUtils.htmlEncodeChars.put('\u03B2',
        //                                        "&beta;");
        //        StringUtils.htmlEncodeChars.put('\u03B3',
        //                                        "&gamma;");
        //        StringUtils.htmlEncodeChars.put('\u03B4',
        //                                        "&delta;");
        //        StringUtils.htmlEncodeChars.put('\u03B5',
        //                                        "&epsilon;");
        //        StringUtils.htmlEncodeChars.put('\u03B6',
        //                                        "&zeta;");
        //        StringUtils.htmlEncodeChars.put('\u03B7',
        //                                        "&eta;");
        //        StringUtils.htmlEncodeChars.put('\u03B8',
        //                                        "&theta;");
        //        StringUtils.htmlEncodeChars.put('\u03B9',
        //                                        "&iota;");
        //        StringUtils.htmlEncodeChars.put('\u03BA',
        //                                        "&kappa;");
        //        StringUtils.htmlEncodeChars.put('\u03BB',
        //                                        "&lambda;");
        //        StringUtils.htmlEncodeChars.put('\u03BC',
        //                                        "&mu;");
        //        StringUtils.htmlEncodeChars.put('\u03BD',
        //                                        "&nu;");
        //        StringUtils.htmlEncodeChars.put('\u03BE',
        //                                        "&xi;");
        //        StringUtils.htmlEncodeChars.put('\u03BF',
        //                                        "&omicron;");
        //        StringUtils.htmlEncodeChars.put('\u03C0',
        //                                        "&pi;");
        //        StringUtils.htmlEncodeChars.put('\u03C1',
        //                                        "&rho;");
        //        StringUtils.htmlEncodeChars.put('\u03C2',
        //                                        "&sigmaf;");
        //        StringUtils.htmlEncodeChars.put('\u03C3',
        //                                        "&sigma;");
        //        StringUtils.htmlEncodeChars.put('\u03C4',
        //                                        "&tau;");
        //        StringUtils.htmlEncodeChars.put('\u03C5',
        //                                        "&upsilon;");
        //        StringUtils.htmlEncodeChars.put('\u03C6',
        //                                        "&phi;");
        //        StringUtils.htmlEncodeChars.put('\u03C7',
        //                                        "&chi;");
        //        StringUtils.htmlEncodeChars.put('\u03C8',
        //                                        "&psi;");
        //        StringUtils.htmlEncodeChars.put('\u03C9',
        //                                        "&omega;");
        //        StringUtils.htmlEncodeChars.put('\u03D1',
        //                                        "&thetasym;");
        //        StringUtils.htmlEncodeChars.put('\u03D2',
        //                                        "&upsih;");
        //        StringUtils.htmlEncodeChars.put('\u03D6',
        //                                        "&piv;");
        //        StringUtils.htmlEncodeChars.put('\u2022',
        //                                        "&bull;");
        //        StringUtils.htmlEncodeChars.put('\u2026',
        //                                        "&hellip;");
        //        StringUtils.htmlEncodeChars.put('\u2032',
        //                                        "&prime;");
        //        StringUtils.htmlEncodeChars.put('\u2033',
        //                                        "&Prime;");
        //        StringUtils.htmlEncodeChars.put('\u203E',
        //                                        "&oline;");
        //        StringUtils.htmlEncodeChars.put('\u2044',
        //                                        "&frasl;");
        //        StringUtils.htmlEncodeChars.put('\u2118',
        //                                        "&weierp;");
        //        StringUtils.htmlEncodeChars.put('\u2111',
        //                                        "&image;");
        //        StringUtils.htmlEncodeChars.put('\u211C',
        //                                        "&real;");
        //        StringUtils.htmlEncodeChars.put('\u2122',
        //                                        "&trade;");
        //        StringUtils.htmlEncodeChars.put('\u2135',
        //                                        "&alefsym;");
        //        StringUtils.htmlEncodeChars.put('\u2190',
        //                                        "&larr;");
        //        StringUtils.htmlEncodeChars.put('\u2191',
        //                                        "&uarr;");
        //        StringUtils.htmlEncodeChars.put('\u2192',
        //                                        "&rarr;");
        //        StringUtils.htmlEncodeChars.put('\u2193',
        //                                        "&darr;");
        //        StringUtils.htmlEncodeChars.put('\u2194',
        //                                        "&harr;");
        //        StringUtils.htmlEncodeChars.put('\u21B5',
        //                                        "&crarr;");
        //        StringUtils.htmlEncodeChars.put('\u21D0',
        //                                        "&lArr;");
        //        StringUtils.htmlEncodeChars.put('\u21D1',
        //                                        "&uArr;");
        //        StringUtils.htmlEncodeChars.put('\u21D2',
        //                                        "&rArr;");
        //        StringUtils.htmlEncodeChars.put('\u21D3',
        //                                        "&dArr;");
        //        StringUtils.htmlEncodeChars.put('\u21D4',
        //                                        "&hArr;");
        //        StringUtils.htmlEncodeChars.put('\u2200',
        //                                        "&forall;");
        //        StringUtils.htmlEncodeChars.put('\u2202',
        //                                        "&part;");
        //        StringUtils.htmlEncodeChars.put('\u2203',
        //                                        "&exist;");
        //        StringUtils.htmlEncodeChars.put('\u2205',
        //                                        "&empty;");
        //        StringUtils.htmlEncodeChars.put('\u2207',
        //                                        "&nabla;");
        //        StringUtils.htmlEncodeChars.put('\u2208',
        //                                        "&isin;");
        //        StringUtils.htmlEncodeChars.put('\u2209',
        //                                        "&notin;");
        //        StringUtils.htmlEncodeChars.put('\u220B',
        //                                        "&ni;");
        //        StringUtils.htmlEncodeChars.put('\u220F',
        //                                        "&prod;");
        //        StringUtils.htmlEncodeChars.put('\u2211',
        //                                        "&sum;");
        //        StringUtils.htmlEncodeChars.put('\u2212',
        //                                        "&minus;");
        //        StringUtils.htmlEncodeChars.put('\u2217',
        //                                        "&lowast;");
        //        StringUtils.htmlEncodeChars.put('\u221A',
        //                                        "&radic;");
        //        StringUtils.htmlEncodeChars.put('\u221D',
        //                                        "&prop;");
        //        StringUtils.htmlEncodeChars.put('\u221E',
        //                                        "&infin;");
        //        StringUtils.htmlEncodeChars.put('\u2220',
        //                                        "&ang;");
        //        StringUtils.htmlEncodeChars.put('\u2227',
        //                                        "&and;");
        //        StringUtils.htmlEncodeChars.put('\u2228',
        //                                        "&or;");
        //        StringUtils.htmlEncodeChars.put('\u2229',
        //                                        "&cap;");
        //        StringUtils.htmlEncodeChars.put('\u222A',
        //                                        "&cup;");
        //        StringUtils.htmlEncodeChars.put('\u222B',
        //                                        "&int;");
        //        StringUtils.htmlEncodeChars.put('\u2234',
        //                                        "&there4;");
        //        StringUtils.htmlEncodeChars.put('\u223C',
        //                                        "&sim;");
        //        StringUtils.htmlEncodeChars.put('\u2245',
        //                                        "&cong;");
        //        StringUtils.htmlEncodeChars.put('\u2248',
        //                                        "&asymp;");
        //        StringUtils.htmlEncodeChars.put('\u2260',
        //                                        "&ne;");
        //        StringUtils.htmlEncodeChars.put('\u2261',
        //                                        "&equiv;");
        //        StringUtils.htmlEncodeChars.put('\u2264',
        //                                        "&le;");
        //        StringUtils.htmlEncodeChars.put('\u2265',
        //                                        "&ge;");
        //        StringUtils.htmlEncodeChars.put('\u2282',
        //                                        "&sub;");
        //        StringUtils.htmlEncodeChars.put('\u2283',
        //                                        "&sup;");
        //        StringUtils.htmlEncodeChars.put('\u2284',
        //                                        "&nsub;");
        //        StringUtils.htmlEncodeChars.put('\u2286',
        //                                        "&sube;");
        //        StringUtils.htmlEncodeChars.put('\u2287',
        //                                        "&supe;");
        //        StringUtils.htmlEncodeChars.put('\u2295',
        //                                        "&oplus;");
        //        StringUtils.htmlEncodeChars.put('\u2297',
        //                                        "&otimes;");
        //        StringUtils.htmlEncodeChars.put('\u22A5',
        //                                        "&perp;");
        //        StringUtils.htmlEncodeChars.put('\u22C5',
        //                                        "&sdot;");
        //        StringUtils.htmlEncodeChars.put('\u2308',
        //                                        "&lceil;");
        //        StringUtils.htmlEncodeChars.put('\u2309',
        //                                        "&rceil;");
        //        StringUtils.htmlEncodeChars.put('\u230A',
        //                                        "&lfloor;");
        //        StringUtils.htmlEncodeChars.put('\u230B',
        //                                        "&rfloor;");
        //        StringUtils.htmlEncodeChars.put('\u2329',
        //                                        "&lang;");
        //        StringUtils.htmlEncodeChars.put('\u232A',
        //                                        "&rang;");
        //        StringUtils.htmlEncodeChars.put('\u25CA',
        //                                        "&loz;");
        //        StringUtils.htmlEncodeChars.put('\u2660',
        //                                        "&spades;");
        //        StringUtils.htmlEncodeChars.put('\u2663',
        //                                        "&clubs;");
        //        StringUtils.htmlEncodeChars.put('\u2665',
        //                                        "&hearts;");
        //        StringUtils.htmlEncodeChars.put('\u2666',
        //                                        "&diams;");
    }

    private StringUtils() {
    }

    public static String encodeHtml(final String source) {
        return StringUtils.encode(source,
                                  StringUtils.htmlEncodeChars);
    }


    private static String encode(final String source,
                                 final HashMap<Character, String> encodingTable) {
        if (null == source) {
            return null;
        }

        if (null == encodingTable) {
            return source;
        }

        StringBuffer encoded_string = null;
        char[] string_to_encode_array = source.toCharArray();
        int last_match = -1;
        int difference = 0;

        for (int i = 0; i < string_to_encode_array.length; i++) {
            char char_to_encode = string_to_encode_array[i];

            if (encodingTable.containsKey(char_to_encode)) {
                if (null == encoded_string) {
                    encoded_string = new StringBuffer(source.length());
                }
                difference = i - (last_match + 1);
                if (difference > 0) {
                    encoded_string.append(string_to_encode_array,
                                          last_match + 1,
                                          difference);
                }
                encoded_string.append(encodingTable.get(char_to_encode));
                last_match = i;
            }
        }

        if (null == encoded_string) {
            return source;
        } else {
            difference = string_to_encode_array.length - (last_match + 1);
            if (difference > 0) {
                encoded_string.append(string_to_encode_array,
                                      last_match + 1,
                                      difference);
            }
            return encoded_string.toString();
        }
    }
}
