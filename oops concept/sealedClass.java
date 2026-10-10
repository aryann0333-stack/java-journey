
/*
* Sealed class is used to control the inheritance it allow to some *specific sub class to extend using keyword permit now B C can *extend A not D
*/
sealed class A permits B, C {

}

/*
 * since we made class D sealed it need to have sub class which is E and because
 * of Sealed E should extend D.
 * sealed class can extend anyy other class also like
 * sealed class can also implement any other interface
 */
sealed class D extends Thread implements Cloneable permits E {

}

/*
 * permitted classes must have these three keyword
 * 1.Sealed -> used to again control inheritance
 * 2.final-> avoid futher inheritance of subclass
 * 3.non Sealed -> any sub class can inherit again
 */
final class B extends A {

}

non-sealed class C extends A {

}

/*
 * we need to define again the sub class by sealed non sealed or final as it is
 * subclass of D
 */
non-sealed class E extends D {

}

/* As C is non sealed can be extended by any class now */
@SuppressWarnings("unused")
class F extends C {

}

/*
 * all rules of classes are applied on interfaces except the final innterfaces
 * dont have final keyword they can be either sealed or non sealed
 */

sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

public class sealedClass {
    public static void main(String[] args) {

    }
}
