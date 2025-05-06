public class WordPair
{

private String first; 
private String second; 

public WordPair(String f, String s){
    first = f;
    second = s; 
}

/** Returns the first string of this WordPair object. */
public String getFirst()
{
    return first; 
}

/** Returns the second string of this WordPair object. */
public String getSecond()
{
    return second; 
}

public String toString() {
    return "(\"" + first + "\", \"" + second + "\")";
}

}