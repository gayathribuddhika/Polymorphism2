
package polymophism2;


public class Polymophism2 {

    
    public static void main(String[] args) {
        Sub3 obj[] = new Sub3[2];
        obj[0] = new Sub1();
        obj[1] = new Sub2();
        
        for(int x=0; x<2;++x){
            obj[x].eat();
        }
    }
    
}
