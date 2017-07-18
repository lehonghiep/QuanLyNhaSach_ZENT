/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.util;

//import java.sql.Date;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Hong Hiep
 */
public class Convert {
    public static java.sql.Date convertDate(Date date){
//        return new java.sql.Date(date.getTime());
if (date != null) {
            return new java.sql.Date(date.getTime());
        } else {
            return null;
        }
    }
    public static String cutName(String name){
        name =name.trim();
        name=name.substring(name.lastIndexOf(" ")+1);
        return name;
    }
    public static void main(String[] args) {
//        SimpleDateFormat sdf=new SimpleDateFormat("dd:MM:yyyy");
        //System.out.println(sdf.format(new Date));
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(new Date()));
        
        System.out.println(convertDate(new Date()));
    }
    public static Icon load(String linkImage, int k, int m) {/*linkImage là tên icon, k kích thước chiều rộng mình muốn,m chiều dài và hàm này trả về giá trị là 1 icon.*/
    try {
        BufferedImage image = ImageIO.read(new File(linkImage));//đọc ảnh dùng BufferedImage
 
        int x = k;
        int y = m;
        int ix = image.getWidth();
        int iy = image.getHeight();
        int dx = 0, dy = 0;
 
        if (x / y > ix / iy) {
            dy = y;
            dx = dy * ix / iy;
        } else {
            dx = x;
            dy = dx * iy / ix;
        }
 
        return new ImageIcon(image.getScaledInstance(dx, dy,
                image.SCALE_SMOOTH));
 
    } catch (IOException e) {
 
        e.printStackTrace();
    }
 
    return null;
}
    public static String convertName(String name){
        name=name.trim().toLowerCase();
        while (name.contains("  ")) {
            name = name.replace("  ", " ");
        }
        String[] mang = name.split(" ");
        String result="";
        for (int i=0;i<mang.length;i++){
            String character= mang[i].substring(0,1);
            result=result+mang[i].replaceFirst(character, character.toUpperCase())+" ";
        }
        return result;
    }
    public static String convertID(String id){
        id=id.trim().toUpperCase();
        while (id.contains(" ")) {
            id = id.replace(" ", "");
        }
        return id;
    }
}
