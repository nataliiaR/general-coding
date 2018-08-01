import java.util.ArrayList;

public class SortedArrayList extends ArrayList {

    @Override
    public boolean add (Object obj){

        Integer temp;
        if (super.isEmpty()){
            super.add(obj);
            System.out.println("my Store" + super.toString());
            System.out.println("myStore size "+ super.size());

        }
        else {
            for (int i= 0; i<super.size(); i++) {
                if ( (Integer)super.get(super.size()-1) < (Integer) obj) {
                    System.out.println("array object  "+ (Integer)super.get(super.size()-1));
                    System.out.println("oblect " + obj );
                    super.add(obj);
                    System.out.println("my new Store" + super.toString());
                    System.out.println("myStore new size "+ super.size());
                    break;

                    } else {
                temp =  (Integer)super.get(super.size()-1);
                System.out.println("temp  "+ temp);

                System.out.println("array object new "+ (Integer)super.get(super.size()-1));
                System.out.println("oblect new" + obj );
                super.remove(super.size()-1);
                super.add(super.size(), obj);
                super.add(temp);System.out.println("myStore size second "+ super.size());
                break;
                }
            }
        }

        return true;
    }

}
