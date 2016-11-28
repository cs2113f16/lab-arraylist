class Test {
    public static void main(String[] args) {
        testIntArrayList();
        //testArrayList(); // uncomment this line to test ArrayList
    }

    // DO NOT MODIFY CODE BELOW HERE
    private static void testIntArrayList() {
        IntArrayList list = new IntArrayList();
        for(int i = 0; i < 35; i++) {
            list.putAL(i * 10);
        }
        System.out.println("-----Printing Integer List -----");
        list.printAL();
        System.out.println("Entry 30 is " + list.getAL(30) + " (should be 300)\n");
    }

    private static void testArrayList() {
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        for(int i = 0; i < 35; i++) {
            String str = getString(i);
            doubleList.putAL(i * 10.01);
            stringList.putAL(str);
            studentList.putAL(new Student(100000 + i * 10, str));
        }

        System.out.println("-----Printing Double List-----");
        doubleList.printAL();
        System.out.println("Entry 30 is " + doubleList.getAL(30) + " (should be 300.3)\n");
        System.out.println("-----Printing String List-----");
        stringList.printAL();
        System.out.println("Entry 30 is " + stringList.getAL(30) + " (should be efghi)\n");
        System.out.println("-----Printing Student List-----");
        studentList.printAL();
        System.out.println("Entry 30 is " + studentList.getAL(30) + " (should be 100300, efghi)");
    }

    private static String getString(int start) {
        char[] chars = new char[5];
        for(int i = 0; i < 5; i++) {
            chars[i] = (char) (start + i < 26 ? 65 + start + i : 71 + start + i);
        }
        return "" + chars[0] + chars[1] + chars[2] + chars[3] + chars[4];
    }
}