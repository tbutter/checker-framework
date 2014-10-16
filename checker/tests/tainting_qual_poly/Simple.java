import org.checkerframework.checker.experimental.tainting_qual_poly.qual.*;

//class Simple {
//
//    void execute(@Untainted String s) { }
//    void tainted(String s) { }
//
//    void stringLiteral() {
//        execute("ldskjfldj");
//        tainted("lksjdflkjdf");
//    }
//
//    void stringRef(String ref) {
//        //:: error: (argument.type.incompatible)
//        execute(ref);   // error
//        tainted(ref);
//    }
//
//    void untaintedRef(@Untainted String ref) {
//        execute(ref);
//        tainted(ref);
//    }
//
// Strings don't have qual params

//    void concatenation(@Untainted String s1, String s2) {
//        execute(s1 + s1);
//        execute(s1 += s1);
//        execute(s1 + "m");
//        //:: error: (argument.type.incompatible)
//        execute(s1 + s2);   // error
//
//        //:: error: (argument.type.incompatible)
//        execute(s2 + s1);   // error
//        //:: error: (argument.type.incompatible)
//        execute(s2 + "m");  // error
//        //:: error: (argument.type.incompatible)
//        execute(s2 + s2);   // error
//
//        tainted(s1 + s1);
//        tainted(s1 + "m");
//        tainted(s1 + s2);
//
//        tainted(s2 + s1);
//        tainted(s2 + "m");
//        tainted(s2 + s2);
//
//    }
//}
