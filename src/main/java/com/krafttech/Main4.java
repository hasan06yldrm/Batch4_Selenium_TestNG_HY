package com.krafttech;

public class Main4 {
    public static void main(String[] args) {
        //Which method would you use to learn if a string is a rotation of another string?
        //rotation of car->car, arc, rca
        //sarı->sarı,arıs,rısa,ısar  -->en baştaki harfin en sona geçmesiyle oluşan yeni kelime..sıra bozulmuyor
        //ve en fazla harf sayısı kadar oluyor

        String str1 = "yaman";
        String str2 = "manya";

        System.out.println("isRotation(str1,str2) = " + isRotation(str1, str2));
        System.out.println("isRotation1(str1,str2) = " + isRotation1(str1, str2));
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.substring(1) + str1.substring(0, 1);//sarı-arıs-rısa-ısar
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRotation1(String str1, String str2) { //sarısarı
        if (str1.length() != str2.length()) {
            return false;
        }
        return (str1 + str1).contains(str2);
    }
}
