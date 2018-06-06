import java.util.Iterator;

public class rfArrayList<AnyType> {
    AnyType[] coreArray;
    int current;
    int modNum;
    class rfArrayListIterator implements Iterator<AnyType>{
        int modNumCopy;
        int index;
        public rfArrayListIterator(){
            modNumCopy=modNum;
        }
        public boolean hasNext(){
            return index<current;
        }

        @Override
        public AnyType next() {
            return coreArray[index++];
        }
    }
    public rfArrayList(){
        coreArray=(AnyType[]) new Object[8];
    }

    public rfArrayList(int size){
        coreArray=(AnyType[])new Object[size];
    }
    public void add(AnyType o){
        if(current==coreArray.length){
            AnyType[] tmp=(AnyType[]) new Object[coreArray.length*2];
            for(int i=0;i<coreArray.length;i++){
                tmp[i]=coreArray[i];
            }
            coreArray=tmp;
        }
        coreArray[current++]=o;
        modNum++;
    }
    public AnyType get(int index){
        return coreArray[index];
    }
    public int size(){
        return current;
    }
    public AnyType remove(int index){
        AnyType removed=coreArray[index];
        for(int i=index+1;i<current;i++)
            coreArray[i-1]=coreArray[i];
        current--;
        modNum--;
        return removed;
    }

    public Iterator<AnyType> iterator(){
        return new rfArrayListIterator();
    }
}
