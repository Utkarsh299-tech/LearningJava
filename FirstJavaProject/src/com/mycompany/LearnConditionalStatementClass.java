package com.mycompany;

/**
 * Author : US
 */
public class LearnConditionalStatementClass {

    public static void main(String[] args) {
//        // Print your branch name
//        String branch = "IT";
//        if(branch == "IT"){
//            System.out.println("Information Technology");
//        } else if (branch == "CS") {
//            System.out.println("Computer Science");
//        } else if (branch == "ECE") {
//            System.out.println("Electronics and Communication Engineering");
//        } else {
//            System.out.println("Invalid branch");
//        }

//        Printing Gate Marks scored

//        int gateMarks = 50;
//        switch (gateMarks) {
//            case 50:
//                System.out.println("Scored 50 marks");
//                break;
//            case 60:
//                System.out.println("Scored 60 marks");
//                break;
//            case 70:
//                System.out.println("Scored 70 marks");
//                break;
//            case 50:
//                System.out.println("Scored 50 marks again");
//                break;
//            default:
//                System.out.println("Marks not received!");
//
//        }
//                int gateMarks = 50;
//                switch (gateMarks) {
//                    case 50:
//                        System.out.println("Scored 50 marks");
//                        break;
//                    case 60:
//                        System.out.println("Scored 60 marks");
//                        break;
//                    case 70:
//                        System.out.println("Scored 70 marks");
//                        break;
//                    case "Eighty":
//                        System.out.println("Scored 80 marks");
//                        break;
//                    default:
//                        System.out.println("Marks not received!");
//
//                }
//        int gateMarks = 50;
//        int myMarks = 50;
//        switch (gateMarks) {
//            case myMarks:
//                System.out.println("Scored 50 marks");
//                break;
//            case 60:
//                System.out.println("Scored 60 marks");
//                break;
//            case 70:
//                System.out.println("Scored 70 marks");
//                break;
//            case 80:
//                System.out.println("Scored 80 marks");
//                break;
//            default:
//                System.out.println("Marks not received!");
//
//        }
//        String branch = "IT";
//        switch (branch) {
//            case "CS":
//                System.out.println("Computer Science");
//                break;
//            case "IT":
//                System.out.println("Information Technology");
//                break;
//            case "ECE":
//                System.out.println("Electronics and Communication Engineering");
//                break;
//            case "EEE":
//                System.out.println("Electrical and Electronics Engineering");
//                break;
//            default:
//                System.out.println("Invalid branch!");
//
//        }
//        Print your phone brand
//        String brand = "Nokia";
//        switch (brand) {
//            case "RealMe":
//                System.out.println("RealMe phone");
//                break;
//            case "Apple":
//                System.out.println("Apple phone");
//                break;
//            case "Samsung":
//                System.out.println("Samsung phone");
//                break;
//            case "OnePlus":
//                System.out.println("OnePlus");
//                break;
//            default:
//                System.out.println("Huh! I don't know your phone brand!");
//
//        }

//        Nested Switch Example
        int a = 2; //possible values : 1, 2, 3
        int b = 3; //possible values : 1, 2, 3
        switch (a) {
            case 1:
                System.out.println("Value of a is 1");
                switch (b) {
                    case 1:
                        System.out.println("Value of b is 1");
                        break;
                    case 2:
                        System.out.println("Value of b is 2");
                        break;
                    case 3:
                        System.out.println("Value of b is 3");
                        break;
                    default:
                        System.out.println("Invalid value!");
                        break;
                }
                break;
            case 2:
                System.out.println("Value of a is 2");
                switch (b) {
                    case 1:
                        System.out.println("Value of b is 1");
                        break;
                    case 2:
                        System.out.println("Value of b is 2");
                        break;
                    case 3:
                        System.out.println("Value of b is 3");
                        break;
                    default:
                        System.out.println("Invalid value!");
                        break;
                }
                break;
            case 3:
                System.out.println("Value of a is 3");
                break;
            default:
                System.out.println("Invalid value!");
                break;
        }


    }
}
