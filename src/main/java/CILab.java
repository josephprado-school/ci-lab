import java.util.Locale;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {

        if (myString == null)
            throw new NullPointerException("String is null.");

        if (myString.equals(myString.toUpperCase()))
            return true;

        if (myString.equals(myString.toLowerCase()))
            return true;

        String first = myString.substring(0,1).toUpperCase();
        String remaining = myString.substring(1,myString.length()).toLowerCase();

        return myString.equals(first + remaining);
    }

}

