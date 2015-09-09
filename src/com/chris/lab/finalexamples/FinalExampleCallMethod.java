package com.chris.lab.finalexamples;

public class FinalExampleCallMethod extends FinalExample {
    /*
     * A java method with final keyword is called final method and it can not be
     * overridden in sub-class. You should make a method final in java if you
     * think it�s complete and its behavior should remain constant in
     * sub-classes. Final methods are faster than non-final methods because they
     * are not required to be resolved during run-time and they are bonded on
     * compile time.
     */

    @Override
    public final String getName() {
        // compilation error: overridden method is final
        return "cheap personal loan";
    }
}
