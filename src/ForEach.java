public class ForEach {
    public static void main(String[] args) {
        String[] students = {"Asad", "Ismail", "Naima", "Daud", "Yasin", "Hamza"};

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }

        // For each loops (aka "enhanced for loops" are used when we want to perform
        // a task on each item in an array or other collection
        for (String student : students) {
            System.out.println(student);
        }


        // Real world example:
        /*
            Comcast (or Netflix) receives media content from TV networks and Movie studios.
            The episodes will be listed as an array. A For Each loop will be used to
            iterate through each episode in the show and publish that episode to a website.
         */
    }
}