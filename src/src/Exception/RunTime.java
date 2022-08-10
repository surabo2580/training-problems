package Exception;

class Hello extends RuntimeException {


    public Hello()
    {
        super();
    }
}

public class RunTime {

    public void ThrowNew()
    {
        // throw exception
        throw new Hello();
    }

    public static void main(String[] args)
    {
        try {
            new RunTime().ThrowNew();
        }
        // catch exception
        catch (Exception x) {
            System.out.println(
                    "example of runtime exception");
        }
    }
}