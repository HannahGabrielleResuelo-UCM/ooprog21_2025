public class FixDebugOne
{
    /* This program displays a greeting */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}

/*
Spotted bugs found:

1. Class name has a space "FixDebug One" should be "FixDebugOne"
2. Main method name should be lowercase "main" instead of "Main"
3. Main method parameter should be "String[] args" instead of "String args"
4. Typo in "System" written as "Systm"
5. Missing semicolon at the end of println statement
*/