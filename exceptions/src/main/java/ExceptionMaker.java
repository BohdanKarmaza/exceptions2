public class ExceptionMaker {
    public static void main(String[] args) throws SaferException {
        new ExceptionMaker().isThereTwo(getData());
    }

    public boolean isThereTwo(Object[] objectsArray) throws SaferException {
        for (Object someObject : objectsArray) {
            // Додати код, що перехоплює вийняток NullPointerException та повертає SaferException
            try {
                if (someObject.equals(2)) {
                    return true;
                }
            } catch (NullPointerException e) {
                throw new SaferException("В об'єкт передаються нульові дані");
            }
        }
        return false;
    }

    public static Object[] getData() {
        return new Object[] { new Object(), null, "test data", 2 };
    }

}
