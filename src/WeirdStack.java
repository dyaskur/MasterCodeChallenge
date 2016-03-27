/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mastercode;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverse;
import java.util.List;

/**
 *
 * @author muhammaddyasyaskur
 */
class WeirdStack<T> {
    int[] numbers = new int[5];
int a;
int total;
List<Integer> listz = new ArrayList<Integer>();
    WeirdStack(int i) {
        total = i;

    }

    void push(int i) {
listz.add(i);
listz.size();
if(listz.size() > total)
{ 
    //listz.remove(0);
}       
//System.out.println(listz.size()+"zzz");

    }

    List<Integer> pop() {
        Collections.reverse(listz);

                List<Integer> zz = listz.subList(0, total);


        return zz;
    }

    void setPopSize(int i) {
        total =i;
    }
    
}
