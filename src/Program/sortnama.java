package Program;

import java.util.Comparator;
public class sortnama {
public class urutnama implements Comparator<Mahasiswa> 
    {
       @Override
        public int compare(Mahasiswa z, Mahasiswa x)
      {
        return z.getnama().compareToIgnoreCase(x.getnama());   
       }
    }
}