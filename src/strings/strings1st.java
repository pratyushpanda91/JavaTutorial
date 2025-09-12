package strings;

public class strings1st {
    public static void main(String[] args) {
        String name = "ANuj";
        String samename = "Anuj";
        String newName = new String("Anuj");

        System.out.println(name);
        System.out.println(newName);

//        if(name == samename){
//            System.out.println("Both are same ");
//        } else {
//            System.out.println("Not same");
//        }
//
//        if(name == newName){
//            System.out.println("Both are same ");
//        } else {
//            System.out.println("Not same");
//        }

//        if(name.equals(newName)) {
//            System.out.println("name and newName have same values");
//        } else {
//            System.out.println("not same ");
//        }
        if (name.equalsIgnoreCase(newName)) {
            System.out.println("name and newName have same values");
        } else {
            System.out.println("not same ");
        }
    }
}
