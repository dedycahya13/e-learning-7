package Program;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class utama
{
   public static Scanner zx = new Scanner (System.in);
   public static  List <Mahasiswa> mhs = new ArrayList<>();

    public static void input()
    {   String kos = zx.nextLine();
        System.out.print("masukan nim : ");
        String nim = zx.nextLine();
         System.out.print("masukan nama: ");
        String nama = zx.nextLine();
         System.out.print("masukan ipk : ");
        float ipk = zx.nextFloat();
        Mahasiswa ti = new Mahasiswa (nim,nama,ipk);
        mhs.add(ti);
             
    }
    public static void menampilkan()
    {
        if(mhs.isEmpty())
        {
            System.out.println("data masih kosong");
        }
        else
        {
             System.out.println("-----------------");
             int x = 1;
             for (Mahasiswa Mhs : mhs)
             {
                 System.out.println("data ke -"+x);
                 System.out.println("nim  : "+Mhs.getnim());
                 System.out.println("nama : "+Mhs.getnama());
                 System.out.println("ipk  : "+Mhs.getipk());
                 x++;
             }
        }
  }
    public static void urut()
    {
         if(mhs.isEmpty())
        {
            System.out.println("data masih kosong");
        }
         else
         {   int input = 0;
         do
         {
             System.out.println("----------------");
             System.out.println("1. sorting nim ");
             System.out.println("2. sorting nama ");
             System.out.println("3. sorting ipk ");
             System.out.println("4. kembali ke awal");
             System.out.print(" pilihan : ");
             input = zx.nextInt();
             switch(input)
                     {
                 case 1 :
                     Collections.sort(mhs , new urutnim());
                     int y = 1;
                     for(Mahasiswa mhs : mhs)
                     {
                         System.out.println("---------");
                         System.out.println("data ke -"+y);
                         System.out.println("nim  ="+mhs.getnim());
                         System.out.println("nama ="+mhs.getnama());
                         System.out.println("ipk  ="+mhs.getipk());
                         y++;
                     }
                     break;
                 case 2 :
                     Collections.sort(mhs , new urutnama());
                     int e = 1;
                     for(Mahasiswa mhs : mhs)
                     {
                         System.out.println("---------");
                         System.out.println("data ke -"+e);
                         System.out.println("nim  ="+mhs.getnim());
                         System.out.println("nama ="+mhs.getnama());
                         System.out.println("ipk  ="+mhs.getipk());
                         e++;
                     }
                     break;
                 case 3 :
                     Collections.sort(mhs, new urutipk());
                     int a = 1;
                     for(Mahasiswa mhs : mhs)
                     {
                         System.out.println("---------");
                         System.out.println("data ke -"+a);
                         System.out.println("nim  ="+mhs.getnim());
                         System.out.println("nama ="+mhs.getnama());
                         System.out.println("ipk  ="+mhs.getipk());
                         a++;
                     }
                     break;
                  }
              }while (input!=4);
         }
    }  
  public static void main(String[] args) 
    {
        int m = 0;
        do 
        {
            System.out.println("----------");
            System.out.println("1. input data");
            System.out.println("2. tampil dua");
            System.out.println("3. sorting data");
            System.out.println("4. keluar data");
            System.out.print("pilih :"); m=zx.nextInt();
            
            switch (m)
            {
                case 1 : 
                    input();
                    break;
                case 2 :
                    menampilkan();
                    break;
                case 3 :
                    urut();
                    break;         
            }
        }
        while (m!=4);
        
    }
    
}