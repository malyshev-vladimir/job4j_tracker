package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"0", "44", "7", "61", "88", "9", "12", "52"};
        try {
            indexOf(array, "88");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}