import java.util.Iterator;

public class test {
    public static void main(String[] args){
        rfArrayList<Integer> testrf=new rfArrayList<>(10);
        for(int i=0;i<12;i++){
            testrf.add(i);
        }
        for(int i=0;i<testrf.size();i++){
            System.out.print(testrf.get(i)+" ");
        }
        System.out.println("\n");
        testrf.remove(0);
//        for(int i=0;i<testrf.size();i++){
//            System.out.print(testrf.get(i)+" ");
//        }
        Iterator<Integer> itr=testrf.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
