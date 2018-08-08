import java.util.ArrayList;

public class SortedArrayList extends ArrayList<Integer> {

    @Override
    public boolean add(Integer obj) {

        Integer temp;
        if (super.isEmpty()) {
            super.add(obj);

        }
        else {
            for (int i = 0; i < super.size(); i++) {

                if (super.get(super.size()-1)  <= obj) {

                    super.add(obj);
                    System.out.println("my new Store" + super.toString());

                    break;

                }

                else if (super.get(i) > obj) {

                    super.add(i, obj);

                    System.out.println("my new Store" + super.toString());
                    break;


                }

            }
        }

        return true;

        }


}
