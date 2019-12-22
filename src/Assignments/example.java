package Assignments;

import javax.swing.*;
public class example
{
    // main metodu
    public static void main( String args[] )
    {
        String s1 = "Java Programlama diline hoş geldiniz ";
        String s2=JOptionPane.showInputDialog(" isminizi giriniz :");
        String s3="\n Umarım ders sonunda uzman bir programcı olursunuz";
        String s4=s1+s2+s3;
        JOptionPane.showMessageDialog(null,s4); // sonucu göster
    } // main metodu sonu
} // BPIH1E7 sınıfı sonu