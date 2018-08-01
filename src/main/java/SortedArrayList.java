import java.util.ArrayList;

public class SortedArrayList extends ArrayList<Integer> {

    @Override
    public boolean add (Integer obj){

        Integer temp;
        if (super.isEmpty()){
            super.add(obj);
            System.out.println("my Store" + super.toString());
            System.out.println("myStore size "+ super.size());

        }
        else {
            for (int i=0; i<super.size(); i++) {
                if ( super.get(i) >= obj) {
                    temp =  super.get(i);
                    System.out.println("temp  "+ temp);

                    System.out.println("array object new "+ super.get(i));
                    System.out.println("oblect new" + obj );

                    super.add(i, obj);

                    System.out.println("myStore size second "+ super.size());
                    break;


                    } else {
                    System.out.println("array object  "+ super.get(i));
                    System.out.println("object " + obj );
                    super.add(obj);
                    System.out.println("my new Store" + super.toString());
                    System.out.println("myStore new size "+ super.size());
                    break;
                }
            }
        }

        return true;
    }

}
