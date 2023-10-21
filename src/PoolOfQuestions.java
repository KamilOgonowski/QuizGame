public class PoolOfQuestions {
    Questions [] ListOfQuestions = {new Questions(1,"Which class you can use to create mutable String objects?: ",
                                        new String[]{"Mutable class","String class", "String class", "StringBuilder class"},
                                        3,2),

                                    new Questions(2,"What does the JVM stands for? ",
                                        new String[]{"Java Vertical Multiplication","Java Virtual Machine", "Java Virtual Messages", "Join Virtual Machine"},
                                        1,2),

                                    new Questions(3,"What is a 'compiler' in Java?",
                                         new String[]{"A program that translates Java source code into bytecode",
                                                      "A program that runs Java applications", "A Java keyword", "A data type"},
                                         0,2),

                                    new Questions(4,"What is the 'this' keyword used for in Java?",
                                            new String[]{"To create a new instance of a class","To specify the visibility of a method",
                                                         "To refer to the current instance of the class", "To start a new thread"},
                                            2,2),

                                    new Questions(5,"What is the main difference between an abstract class and an interface in Java",
                                            new String[]{"An abstract class can have concrete methods, while an interface cannot","An abstract class cannot have any methods, while an interface can",
                                                         "An abstract class is a keyword in Java, while an interface is not", "An abstract class and an interface are the same thing in Java"},
                                            0,2),

                                    new Questions(6, "Which of the following access modifiers allows a class to be accessed from anywhere?",
                                            new String[]{"public", "private", "protected", "default"},
                                            0, 2),

                                    new Questions(7, "What is the purpose of the 'super' keyword in Java?",
                                            new String[]{"To create a new object", "To access the superclass of a class",
                                                    "To specify the visibility of a method", "To define a loop"},
                                            1, 2),

                                    new Questions(8, "What is the result of 7 % 3 in Java?",
                                            new String[]{"3", "2", "1", "0"},
                                            2, 2),


                                    new Questions(9, "Which data structure in Java uses a 'Last-In, First-Out' (LIFO) approach?",
                                            new String[]{"Queue", "ArrayList", "LinkedHashMap", "Stack"},
                                            3, 2),

                                    new Questions(10, "What is the Java keyword used to indicate that a method does not return a value?",
                                            new String[]{"void", "null", "public", "static"},
                                            0, 2)

    };


}
