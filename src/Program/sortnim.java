package Program;
import java.util.Comparator;
public class sortnim {
    public class urutnim implements Comparator<Mahasiswa> 
    {
      @Override
        public int compare(Mahasiswa z, Mahasiswa x)
     {
        return z.getnim().compareToIgnoreCase(x.getnim());
    
       }
    }
}
