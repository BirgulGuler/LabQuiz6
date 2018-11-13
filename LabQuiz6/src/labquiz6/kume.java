/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz6;
import java.util.ArrayList;
/**
 *
 * @author Technopc
 */
public class kume {
    ArrayList kume1=new ArrayList();
  kume()
    {
    }
   kume(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            kume1.add(a[i]);
        }
    }
    kume(kume a)
    {
        for(int i=0;i<a.kume1.size();i++)
        {
            this.kume1.add(a.kume1.get(i));
        }
            
    }
    public void ekle(int a)
    {
        kume1.add(a);
    }
    public void yazdir()
    { System.out.println("Array listin elemanları=");
        for(int i=0;i<kume1.size();i++)
        {
            System.out.print(kume1.get(i)+" ");
        }
         System.out.println("");
    }
    public boolean denk(kume a)
    {
        if(this.kume1.size()==a.kume1.size()) return true;
        else return false;
    }
    public boolean esit(kume a)
    {
        if(this.kume1.equals(a.kume1)) return true;
        else return false;
    }
    public kume birlesim(kume a)
    { int sayac=-1;
        for(int j=0;j<a.kume1.size();j++)
        {
            for(int i=0;i<this.kume1.size();i++)
        {
            if(this.kume1.get(i)==a.kume1.get(j)) sayac=0; 
        }
           if (sayac==-1) this.kume1.add(a.kume1.get(j));
        }
        return this;
    }
}
