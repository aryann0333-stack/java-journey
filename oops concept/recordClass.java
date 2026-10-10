
/* 
*special c;ass designed to hold data with less boilerplate code it *automatically provides a constructor accessor methods,equals(),*hashcode() and toString()
 */

/* this is the below data carrier class has many lines and our intution is *to do same thing with less boilerplate 
*1. traditinal way -> more boilerplate
 */
class customer {
    private final int id;
    private final String name;

    public customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "customer [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        customer other = (customer) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

/* reduced boiler plate code */
// it can implement interfaces also
record customerRecord(int id, String name) implements Cloneable {

    // default constructor not recomended
    // canonical constructor means has same parameter

    static int age; // allowed
    // int address; not allowed

    public static int getAge() {
        return age;
    }

    public customerRecord(int id, String name) {
        if (id == 0)
            throw new IllegalArgumentException("ID cannot be zero ");
        this.id = id;
        this.name = name;
    }
    // compact canonical form
    // public customerRecord{
    // if (id==0){
    // throw new IllegalArgumentException("ID cannot be zero");
    // }
    // }

    /* we can define methods also */
    public void show() {
        System.out.println("in show");
    }

}

public class recordClass {
    public static void main(String[] args) {

        customer c1 = new customer(31, "aryan");
        System.out.println(c1);
        customer c2 = new customer(0, "aryan");
        /*
         * we can create deafult constructor but not recomended all variable in record
         * are final
         */
        // customer c3 = new customer(); not recomended

        /*
         * return false these two differnt object are at two differnt location and jvm
         * does not know this it comapre memory stuff not values
         */
        System.out.println(c1.equals(c2));

        customerRecord c = new customerRecord(4, "verma");
        System.out.println(c);
        c.show();
        System.out.println(c1.getName());
    }
}
