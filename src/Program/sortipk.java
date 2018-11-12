package Program;

import java.util.Comparator;

public class sortipk {
    
public class urutipk implements Comparator<Mahasiswa>
    {
     @Override
      public int compare(Mahasiswa z, Mahasiswa x){
        return Float.compare(z.getipk(), x.getipk());
      }
    }
}