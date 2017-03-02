package com.ward;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;

/**
 * Created by amold on 11/01/17.
 */
public class Ward {

    public static void main(String[] args) {
        String str = "77.6821573319402,12.9982954643688,0,77.6804930527017,13.0008593716565,0,77.6792925526527,13.000825873093,0,77.6767420855336,13.0006069671276,0,77.6753381873918,12.9998767239527,0,77.6752123551151,13.0002394457441,0,77.6771117536539,13.001112843135,0,77.6771115236842,13.0011172930333,0,77.6741266469997,13.0009833248563,0,77.6720365788816,13.0008796909522,0,77.6708318905896,13.0007438971018,0,77.6692751679123,13.0004812618726,0,77.6674175365892,12.9998188691151,0,77.6669141914502,12.999591453925,0,77.6658425828412,12.9990113050566,0,77.6642219913421,12.9981121713065,0,77.663661970255,12.9977864966347,0,77.6627332173216,12.9972463846589,0,77.6634455758704,12.9961272324221,0,77.6640386193501,12.9950578046882,0,77.6649804934591,12.9933752823024,0,77.665088448747,12.9931946021717,0,77.6652025591111,12.9930175968375,0,77.665322694596,12.9928444678602,0,77.665448718386,12.9926754123857,0,77.6655804869612,12.9925106229205,0,77.6657178502608,12.9923502871127,0,77.6658606518542,12.9921945875387,0,77.666008729119,12.9920437014947,0,77.6661619134261,12.9918978007953,0,77.6663200303323,12.9917570515778,0,77.6664828997782,12.9916216141129,0,77.6671040369492,12.9911971947325,0,77.6681520346437,12.9905565407885,0,77.6679804944792,12.9903888906857,0,77.6675953289167,12.9901486996188,0,77.6674589008626,12.9898710757364,0,77.6673754785953,12.9895580296622,0,77.6672708587746,12.9889304232689,0,77.6674413309986,12.986483633609,0,77.6676465834436,12.9864038422604,0,77.6677371281718,12.9859417021302,0,77.6682947655386,12.986345812501,0,77.6686740887657,12.9866455594351,0,77.6690584004945,12.9867958285665,0,77.6697217867289,12.9869107771475,0,77.6702205711709,12.9868732409379,0,77.6705872290958,12.9867506245732,0,77.6717913390732,12.9863740808732,0,77.672780557308,12.9868595739733,0,77.674548865551,12.986886685657,0,77.6739370781689,12.9872281235787,0,77.6754777734434,12.9879347694451,0,77.6755253381434,12.990391543221,0,77.6755003015761,12.9906574430452,0,77.6754059795309,12.9913576033623,0,77.675180345716,12.9916092924589,0,77.6752769650543,12.9920601766515,0,77.6761497356233,12.9918841668489,0,77.6763473615381,12.9928868052684,0,77.6763174815969,12.9929840883128,0,77.6761293844408,12.9930345151721,0,77.6756410641025,12.9930607595952,0,77.6755491381472,12.9934283948805,0,77.6755356003127,12.9936143729827,0,77.6756119543783,12.9938135983659,0,77.6758766203985,12.9942415451171,0,77.6761248415497,12.9945563002464,0,77.6762831166742,12.9947569993056,0,77.6764316879831,12.9949996132909,0,77.6768072351258,12.9956128713121,0,77.678174813057,12.9953860639622,0,77.6790604858871,12.995254700732,0,77.6797969609261,12.9951408159786,0,77.6803854833787,12.9950509123175,0,77.6813783704202,12.9949889437096,0,77.6817395082954,12.99530964899,0,77.6817545809553,12.9955063484689,0,77.682769004108,12.995539832887,0,77.6828489214814,12.9956754369947,0,77.6829658402886,12.9959225324724,0,77.6834607494656,12.9964006398826,0,77.6821573319402,12.9982954643688,0";

        String[] s = str.split(",0,");
        String[] s1 = s[0].split(",");

        System.out.println("lat: "+s1[0] + "long: "+s1[1]);

        Geometry geometry = new GeometryFactory().createMultiPolygon()
    }
}